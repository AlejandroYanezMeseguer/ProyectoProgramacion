package API;

import API.data.Data;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Clase ConexionAPIArmas que se utilizara para conectar con la API de las armas
 */
public class ConexionAPIArmas {

    /**
     * Metodo que se utilizara para conectar con la API de las armas
     * @return EldenRingData
     */
    public ArrayList<Data> APIArmas() {

        ArrayList<Data> arma = new ArrayList<Data>();

        String apiUrl = "https://eldenring.fanapis.com/api/weapons?limit=100&page=";

        try {

            for (int i = 0; i < 4; i++) {
                var apiUrlLocal = apiUrl + i;

                URL url = new URL(apiUrlLocal);

                HttpURLConnection con = (HttpURLConnection) url.openConnection();

                con.setRequestMethod("GET");

                BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));

                String inputLine;

                StringBuffer content = new StringBuffer();

                while ((inputLine = in.readLine()) != null) {

                    content.append(inputLine);

                }
                ObjectMapper mapper = new ObjectMapper();
               var resultado = mapper.readValue(content.toString(), EldenRingData.class);

               arma.addAll(Arrays.asList(resultado.data));

                in.close();

                con.disconnect();

            }
        } catch (IOException e) {

                e.printStackTrace();

        }
        return arma;
    }

}

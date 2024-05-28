package API;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Clase ConexionAPIArmas que se utilizara para conectar con la API de las armas
 */
public class ConexionAPIArmas {

    /**
     * Metodo que se utilizara para conectar con la API de las armas
     * @return EldenRingData
     */
    public EldenRingData APIArmas() {

        EldenRingData arma = null;

        String apiUrl = "https://eldenring.fanapis.com/api/weapons";

        try {

            URL url = new URL(apiUrl);

            HttpURLConnection con = (HttpURLConnection) url.openConnection();

            con.setRequestMethod("GET");

            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));

            String inputLine;

            StringBuffer content = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {

                content.append(inputLine);

            }
            ObjectMapper mapper = new ObjectMapper();
            arma = mapper.readValue(content.toString(), EldenRingData.class);

            in.close();

            con.disconnect();

        } catch (IOException e) {

            e.printStackTrace();

        }

        return arma;
    }

}

package API;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConexionAPIEscudos {

    public EldenRingData APIEscudos() {

        EldenRingData escudos = null;

        String apiUrl = "https://eldenring.fanapis.com/api/shields?limit=100";

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
             escudos = mapper.readValue(content.toString(), EldenRingData.class);

            in.close();

            con.disconnect();

        } catch (IOException e) {

            e.printStackTrace();

        }

        return escudos;
    }

}

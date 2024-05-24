package API;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ConexionAPIEscudos {

    public void APIEscudos() {

        String apiUrl = "https://eldenring.fanapis.com/api/shields";

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

            // Procesar JSON y actualizar interfaz aquí

            in.close();

            con.disconnect();

        } catch (IOException e) {

            e.printStackTrace();

        }

    }

}

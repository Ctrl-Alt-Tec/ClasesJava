package clase45;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class HTTPhelper {

    public static void main(String[] args){
        System.out.println(sendGetRequest("https://franspaco.com/team_events2018.json"));
    }

    public static String sendGetRequest(String urlString){
        try{
            StringBuilder result = new StringBuilder();

            URL url = new URL(urlString);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            try(BufferedReader br = new BufferedReader(
                    new InputStreamReader(conn.getInputStream()))){
                String line;
                while ((line = br.readLine()) != null) {
                    result.append(line);
                }
            }
            return result.toString();
        }
        catch (MalformedURLException ex){
            ex.printStackTrace();
        }
        catch (IOException ex){
            ex.printStackTrace();
        }
        return null;
    }
}

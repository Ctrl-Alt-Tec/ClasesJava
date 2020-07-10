
package clase45;

import com.google.gson.*;

public class GSON {
    public static void main (String[] hola){
        String url = "https://franspaco.com/clase/datos.json";
        String result =HTTPhelper.sendGetRquest(url);
        person p = new gson.fromJson(result, Person.class);
        System.out.println(p.lastname);
        System.out.println(p.pets);
    }
}

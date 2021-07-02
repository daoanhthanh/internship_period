package var_gettingStarted;

import java.util.HashMap;
import java.util.Set;

public class MapUsage {
    public void getSomeHttpSuccessfulResponse(){
        var httpResponse = new HashMap<Integer, String>();
        httpResponse.put(200, "Ok");
        httpResponse.put(201, "Created");
        httpResponse.put(202, "Accepted");
        httpResponse.put(203, "Non-Authoritative Information");
        httpResponse.put(204, "NO content");
        var set = httpResponse.keySet();
        for (int key: set){
            System.out.println(key+" "+httpResponse.get(key));
        }
    }

    public void getCountriesAndCapitals(){
        var capitalCities = new HashMap<String, String>();
        capitalCities.put("Vietnam", "Ha Noi");
        capitalCities.put("England", "London");
        capitalCities.put("America", "Washington DC");
        var set = capitalCities.entrySet();
        for (var sub:set){
            System.out.println(sub);
        }

    }
}

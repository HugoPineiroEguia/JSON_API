import org.json.JSONArray;
import org.json.JSONObject;


public class Main {
    static String json = "" +
            "{" +
            "    \"pageInfo\": {" +
            "            \"pageName\": \"Homepage\"," +
            "            \"logo\": \"https://www.example.com/logo.jpg\"" +
            "    }," +
            "    \"posts\": [" +
            "            {" +
            "                \"post_id\": \"0123456789\"," +
            "                \"actor_id\": \"1001\",\n" +
            "                \"author_name\": \"Jane Doe\"," +
            "                \"post_title\": \"How to parse JSON in Java\"," +
            "                \"comments\": []," +
            "                \"time_of_post\": \"1234567890\"" +
            "            }," +

            "            {" +
            "                \"post_id\": \"1234567890\"," +
            "                \"actor_id\": \"1001\",\n" +
            "                \"author_name\": \"Jane Doe\"," +
            "                \"post_title\": \"How to parse JSON in Java\"," +
            "                \"comments\": [\"Hola\"]," +
            "                \"time_of_post\": \"1234567890\"" +
            "            }" +
            "    ]" +

            "}";
}
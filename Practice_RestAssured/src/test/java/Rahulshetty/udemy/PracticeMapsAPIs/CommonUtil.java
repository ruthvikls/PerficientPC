package Rahulshetty.udemy.PracticeMapsAPIs;

import io.restassured.path.json.JsonPath;

public class CommonUtil {
	public static JsonPath rawToJSON(String response) {
		JsonPath js = new JsonPath(response);
		return js;
	}

}

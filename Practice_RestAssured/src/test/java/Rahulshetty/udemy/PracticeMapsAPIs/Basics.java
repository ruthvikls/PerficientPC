package Rahulshetty.udemy.PracticeMapsAPIs;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.nio.file.Files;
import java.nio.file.Paths;

import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class Basics {

	public static void main(String[] args) throws Exception {
		// post
		// since the body is static i will be sending the payload thorugh external JSON
		// File (Not Using Payload.postBody())
		RestAssured.baseURI = "https://rahulshettyacademy.com";
		String response = given().log().all().queryParam("key", "qaclick123").header("Content-Type", "application/json")
				.body(new String(
						Files.readAllBytes(Paths.get("C:\\Users\\r.lakshminarayana\\Documents\\Payload.json"))))
				.when().post("maps/api/place/add/json").then().assertThat().statusCode(200)
				.body("scope", equalTo("APP")).header("Server", "Apache/2.4.41 (Ubuntu)").extract().response()
				.asString();

		System.out.println(response);
		JsonPath js = new JsonPath(response); // to validate the response, json object is created (extracting the json
												// data)
		String placeID = js.getString("place_id");
		System.out.println(placeID);

		System.out.println("******************************************************************");

		// update place(PUT request)
		String newAddress = "70224,Washington DC, USA";

		given().log().all().queryParam("key", "qaclick123").header("Content-Type", "application/json")
				.body("{\r\n" + "\"place_id\":\"" + placeID + "\",\r\n" + "\"address\":\"" + newAddress + "\",\r\n"
						+ "\"key\":\"qaclick123\"\r\n" + "}")
				.when().put("maps/api/place/update/json").then().log().all().assertThat().statusCode(200)
				.body("msg", equalTo("Address successfully updated"));

		System.out.println("******************************************************************");

		// get the address (GET method)
		String getResponse = given().log().all().queryParam("key", "qaclick123").queryParam("place_id", placeID).when()
				.get("maps/api/place/get/json").then().log().all().assertThat().statusCode(200).extract().response()
				.asString();
		JsonPath js1 = new JsonPath(getResponse);
		String actualAddress = js1.getString("address");
		System.out.println(actualAddress);
		Assert.assertEquals(actualAddress, newAddress);
		System.out.println("*******Passed******");

		// delete the address
		given().log().all().queryParam("key", "qaclick123").header("Content-Type", "application/json")
				.body("{\r\n" + "    \"place_id\":\"" + placeID + "\"\r\n" + "}\r\n" + "").when()
				.delete("maps/api/place/delete/json").then().log().all().assertThat().statusCode(200)
				.body("status", equalTo("OK"));
	}

}

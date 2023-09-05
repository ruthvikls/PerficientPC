package com.YT.TestingAcademy;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.json.simple.JSONObject;
import org.junit.Assert;

//import com.Strings.JsonObject;
import com.practice.parsing.JSON;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class BookARoom_TestingAcademy {

	public static void main(String[] args) {
		
	/*	RestAssured.baseURI = "https://automationintesting.online";
		String room = "single";
		//get Call
	String response = 	given().log().all()
		.when().get("/room")
		.then().assertThat().statusCode(200).extract().asString();
	System.out.println("The response of the request is" + response);
	
	JsonPath json = new JsonPath(response);
	String typeOfRoom = json.get("rooms[0].type");
	System.out.println(typeOfRoom);
	Assert.assertEquals(room,typeOfRoom);
	
	*/
	  JSONObject js = new JSONObject();
      js.put("something","something value");
      
      JSONObject anotherjs = new JSONObject();
      anotherjs.put("child", "child Value");
      
      js.put("another", anotherjs);
      System.out.println(js.toString());
	}

}

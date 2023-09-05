package com.PracticeOAuth;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import com.practice.parsing.JSON;

import io.restassured.parsing.Parser;
import io.restassured.path.json.JsonPath;

public class OAuth2 {

	public static void main(String[] args) {

		String authorizationCodeURL = "https://rahulshettyacademy.com/getCourse.php?code=4%2F0AWtgzh4NNTCdYZC2cay-J7PKGFAmEbXeWD8LlJF2M9QnKWExx_rhLRTl8h768AmJSnDlRQ&scope=email+https%3A%2F%2Fwww.googleapis.com%2Fauth%2Fuserinfo.email+openid&authuser=0&prompt=none";
		String partialcode = authorizationCodeURL.split("code=")[1];

		String code = partialcode.split("&scope")[0];

		System.out.println(code);

		String accessTokenRequest = given()
				.urlEncodingEnabled(false)
				.queryParam("code", code)
				.queryParams("client_id", "692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com")

				.queryParams("client_secret", "erZOWM9g3UtwNRj340YYaK_W")

				.queryParams("grant_type", "authorization_code")

				.queryParams("state", "verifyfjdss")
				.queryParams("redirect_uri", "https://rahulshettyacademy.com/getCourse.php").when().log().all()
				.post("https://www.googleapis.com/oauth2/v4/token").asString();

		JsonPath js = new JsonPath(accessTokenRequest);
		String accessToken = js.getString("access_token");
		System.out.println(accessToken);

		String response = given().contentType("application/json").queryParam("access_token", accessToken).expect().defaultParser(Parser.JSON).when()
				.get("https://rahulshettyacademy.com/getCourse.php").asString();
		System.out.println(response);

	}

}

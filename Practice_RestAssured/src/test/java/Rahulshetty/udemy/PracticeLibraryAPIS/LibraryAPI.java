package Rahulshetty.udemy.PracticeLibraryAPIS;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Rahulshetty.udemy.PracticeMapsAPIs.CommonUtil;
import Rahulshetty.udemy.PracticeMapsAPIs.Payload;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import io.restassured.RestAssured;

public class LibraryAPI {
	@Test(dataProvider="newBooks")
	public void addBook(String isbn , String aisle) {
		
		RestAssured.baseURI="http://216.10.245.166";
		String resp = given().log().all().headers("Content-Type","application/json")
		.body(Payload.addBook(isbn,aisle))
		.when().post("Library/Addbook.php")
		.then().log().all()
		.assertThat().statusCode(200).extract().response().asString();
		
		JsonPath js = CommonUtil.rawToJSON(resp);
		String id = js.get("ID");
		String Msg = js.get("Msg");
		System.out.println("*******"+id+" : "+Msg+"*******");
		
		//deleteBOOKS
		
		System.out.println("***************************************************");
		String res = given().log().all().body(Payload.BookID(id))
				.when().post("Library/DeleteBook.php").then().log().all().assertThat().statusCode(200)
						.extract().response().asString();
		System.out.println(res);
		JsonPath jsD = CommonUtil.rawToJSON(res);
		String deleteMessage = js.get("msg");
		System.out.println("********"+deleteMessage+"************************");
	}
	
@DataProvider(name="newBooks")
public Object[][] getBooks() {
	return new Object[][] {{"Stark","2114"},{"Rogers","3232"},{"Quill","2243"}};
}
}

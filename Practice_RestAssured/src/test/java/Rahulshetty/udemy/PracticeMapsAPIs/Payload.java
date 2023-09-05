package Rahulshetty.udemy.PracticeMapsAPIs;

public class Payload {

	public static String postBody() {
		return "{\r\n"
				+ "  \"location\": {\r\n"
				+ "    \"lat\": -38.383494,\r\n"
				+ "    \"lng\": 33.427362\r\n"
				+ "  },\r\n"
				+ "  \"accuracy\": 50,\r\n"
				+ "  \"name\": \"AVengers Tower\",\r\n"
				+ "  \"phone_number\": \"(+91) 983 893 3937\",\r\n"
				+ "  \"address\": \"29, Main layout, Avengers Street\",\r\n"
				+ "  \"types\": [\r\n"
				+ "    \"shoe park\",\r\n"
				+ "    \"shop\"\r\n"
				+ "  ],\r\n"
				+ "  \"website\": \"http://google.com\",\r\n"
				+ "  \"language\": \"French-IN\"\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ "";
	}

public static String addBook(String isbnBook, String aisleBook) {
	String payLoadBook = "{\r\n"
			+ "\r\n"
			+ "\"name\":\"Tales of the Mightiest Heros\",\r\n"
			+ "\"isbn\":\""+isbnBook+"\",\r\n"
			+ "\"aisle\":\""+aisleBook+"\",\r\n"
			+ "\"author\":\"Thor Odinson\"\r\n"
			+ "}\r\n"
			+ "";
	return payLoadBook;
}

public static String BookID(String IDofBOOK) {
return "{\r\n"
+ " \r\n"
+ "\"ID\" : \""+IDofBOOK+"\"\r\n"
+ " \r\n"
+ "} \r\n"
+ "";

}
}
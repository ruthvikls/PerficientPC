package com.rsa.files;

import org.testng.Assert;

import io.restassured.path.json.JsonPath;

public class ParsingComplexJSON {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JsonPath js = new JsonPath(payload.coursePrices());
		// Print No of courses returned by API
		System.out.println("Print No of courses returned by API");
		int numberOfCourses = js.get("courses.size()");
		System.out.println(numberOfCourses);
		System.out.println("*****************************************");

		// Print Purchase Amount
		System.out.println("Print Purchase Amount");
		int purchaseAmount = js.get("dashboard.purchaseAmount");
		System.out.println(purchaseAmount);
		System.out.println("*****************************************");

		// Print Title of the first course
		System.out.println("Print Title of the first course");
		String firstCourseTitle = js.get("courses[0].title");
		System.out.println(firstCourseTitle);
		System.out.println("*****************************************");

		// Print All course titles and their respective Prices
		System.out.println("Print All course titles and their respective Prices");
		for (int i = 0; i < numberOfCourses; i++) {
			String allTitles = js.get("courses[" + i + "].title");
			int allPrices = js.get("courses[" + i + "].price");
			System.out.println(allTitles + " : " + allPrices);
		}
		System.out.println("*****************************************");

		// Print no of copies sold by RPA Course
		System.out.println("Print no of copies sold by RPA Course");
		for (int i = 0; i < numberOfCourses; i++) {
			String allTitles = js.get("courses[" + i + "].title");
			if (allTitles.equalsIgnoreCase("RPA")) {
				int cp = js.get("courses[" + i + "].copies");
				System.out.println(cp);
				break;
				}
		}
		System.out.println("*****************************************");
	
	//Verify if Sum of all Course prices matches with Purchase Amount
		System.out.println("Verify if Sum of all Course prices matches with Purchase Amount");
		int sum =0;
		for(int i=0;i<numberOfCourses;i++) {
			int price = js.get("courses["+i+"].price");
			int copies = js.get("courses["+i+"].copies");
			int amount = price*copies;
			System.out.println("Amount is = "+amount );
			sum = sum+amount;
			}
		System.out.println(sum);
		
		int purchaseamt= js.get("dashboard.purchaseAmount");
		Assert.assertEquals(sum, purchaseamt);
	}

}

package com.practice.parsing;

import io.restassured.path.json.JsonPath;

public class jsonObject {

	public static void main(String[] args) {

		JsonPath js = new JsonPath(parse_jsonObject.Employees());

		// number of employees
		int numberOfEmployees = js.get("employees.employee.size()");
		System.out.println(numberOfEmployees);
		System.out.println("*******************************************");

		// print lastname of second employee
		String lastname = js.get("employees.employee[1].lastName");
		System.out.println(lastname);
		System.out.println("*******************************************");
		
		// print all the employees firstname,lastname and id
		for (int i = 0; i < numberOfEmployees; i++) {
			String id = js.get("employees.employee[" + i + "].id");
			String firstName = js.get("employees.employee[" + i + "].firstName");
			String lastName = js.get("employees.employee[" + i + "].lastName");
			System.out.println(id + " : " + firstName + " : " + lastName);

		}
		System.out.println("*******************************************");
	
		//what is the id of Maria
		for(int i=0;i<numberOfEmployees;i++) {
			String firstname = js.get("employees.employee["+i+"].firstName");
			if(firstname.equalsIgnoreCase("Maria")) {
				String idEmp = js.get("employees.employee["+i+"].id");
				
				System.out.println(idEmp);
				break;
			}
			
		}
	}

}

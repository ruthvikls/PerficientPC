package com.practice.parsing;

import io.restassured.path.json.JsonPath;

public class JSON {

	public static void main(String[] args) {
			
		JsonPath js =  new JsonPath(ParsingData_JSON.newData());
		
		//get Number of members
		int sizeOFMembers = js.get("members.size()");
		System.out.println(sizeOFMembers);
		int powerSize = js.getInt("members[2].powers.size()");
		System.out.println(powerSize);
		for(int i=0;i<powerSize;i++) {
			String newPower = js.get("members[2].powers["+i+"]");
			System.out.println(newPower);
		}
		System.out.println("***************************");
		//second Name Secret Identity
		for(int i=0;i<sizeOFMembers;i++) {
			String name = js.get("members["+i+"].name");
			if(name.equalsIgnoreCase("Molecule Man")) {
				String secretIdentity  = js.get("members["+i+"].secretIdentity");
				System.out.println(secretIdentity);
				break;
				}
			}
		System.out.println("***************************");
		//powers list out
		for(int i =0; i<sizeOFMembers;i++) {
			String name = js.get("members["+i+"].name");
			if(name.equalsIgnoreCase("Madame Uppercut")) {
			int powers  = js.get("members["+i+"].powers.size()");
			String[] powerString  = js.get("members["+i+"].powers");
				System.out.println(powers);
				System.out.println(powerString);
			
		}
		

	}

}
	}
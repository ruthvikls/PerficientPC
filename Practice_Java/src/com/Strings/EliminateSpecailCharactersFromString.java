package com.Strings;

public class EliminateSpecailCharactersFromString {

	public static void main(String[] args) {
		
		String sentence = "This!@is^A&^(Good**(^Person";
		
		sentence= sentence.replaceAll("[^a-zA-Z]", "");
		System.out.println(sentence);
		
		String sent = "99asgd86adsjhf4433jsjjHH82";
		String ok = sent.replaceAll("[^0-9]", "");
		System.out.println(ok);
		
		
		String code = "https://accounts.google.com/o/oauth2/auth/oauthchooseaccount?redirect_uri=storagerelay%3A%2F%2Fhttps%2Fin.bookmyshow.com%3Fid%3Dauth957953&response_type=permission%20id_token&scope=email%20profile%20openid&openid.realm&include_granted_scopes=true&client_id=990572338172-iibth2em4l86htv30eg1v44jia37fuo5.apps.googleusercontent.com&ss_domain=https%3A%2F%2Fin.bookmyshow.com&fetch_basic_profile=true&gsiwebsdk=2&service=lso&o2v=1&flowName=GeneralOAuthFlow";
		String split = code.split("client_id=")[1];
		System.out.println(split);
		String split1 = split.split("-iibth")[0];
		System.out.println(split1);
		

	}

}

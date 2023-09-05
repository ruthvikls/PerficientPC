package com.MostAskedIQ;

public class IPAddressValidator {

	    public static boolean isValidIP(String ipAddress) {
	        String[] parts = ipAddress.split("\\.");

	        if (parts.length != 4) {
	            return false;
	        }

	        for (String part : parts) {
	            try {
	                int num = Integer.parseInt(part);
	                if (num < 0 || num > 255) {
	                    return false;
	                }
	            } catch (NumberFormatException e) {
	                return false;
	            }
	        }

	        return true;
	    }

	    public static void main(String[] args) {
	        String[] testIPs = {
	            "192.168.0.1",
	            "0.0.0.0",
	            "255.255.255.255",
	            "256.0.0.1",
	            "192.168.0",
	            "abc.def.ghi.jkl"
	        };

	        for (String ip : testIPs) {
	            System.out.println(ip + " is valid: " + isValidIP(ip));
	        }
	        System.out.println("*************************************************************");
	        
	    }
	


}

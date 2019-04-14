package com.dpedwards.blockchain;

import java.security.MessageDigest; // import java security 

   /**
    * Used to define SHA-256 hash generation
    * The SHA256 hashes are the fingerprints of the blocks
    * 
    * @author Davain Pablo Edwards
    * @license MIT 
    * @version 1.0
    */
public class SHA256Helper {

	public static String generateHash(String data) {
		try {
			
			MessageDigest digest = MessageDigest.getInstance("SHA-256");
			byte[] hash = digest.digest(data.getBytes("UTF-8"));
			
			StringBuffer hexadecimalString = new StringBuffer();
			
			for (int i = 0; i < hash.length; i++) {
				String hexadecimal = Integer.toHexString(0xff & hash[i]);
				if (hexadecimal.length() == 1) hexadecimalString.append('0');
				hexadecimalString.append(hexadecimal);
			}
			
			return hexadecimalString.toString();
			
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}	
}

package practice.Additional;

import java.util.Base64;

public class PasswordService{
	
	private static final String SALT_1 = "45c9a9c734cdc1e0c05b4a613541dc9f";
	private static  final String SALT_2 = "9b52f6b25ef47e16c59695c3a1354f24";
	
	public static void main(String[] args) {
		String p = encodePassword("grihothm");
		System.out.println(p);
		String b = "VVZkU2RHRlhOVUZOVkVsNklFNUVWbXBQVjBVMVdYcGplazVIVG10WmVrWnNUVWROZDA1WFNUQlpWRmw0VFhwVk1FMVhVbXBQVjFrOSBPV0kxTW1ZMllqSTFaV1kwTjJVeE5tTTFPVFk1TldNellURXpOVFJtTWpRPQ==";
		System.out.println(decodePassword(b));
	}
	
	private static String encodeBase64(String userString) {
		return Base64.getEncoder().encodeToString(userString.getBytes());
	}
	
	private static String decodeBase64(String base64) {
		return new String(Base64.getDecoder().decode(base64));
	}
	
	public static String encodePassword(String userPassword) {
		String secret = encodeBase64(userPassword)+ " " +encodeBase64(SALT_1);
		
		String deeperSecret = encodeBase64(secret) + " " + encodeBase64(SALT_2);
		
		return encodeBase64(deeperSecret);
	}
	
	public static String decodePassword(String encodedString) {
		String deeperSecret = decodeBase64(encodedString);
		
		String secretEncoded = deeperSecret.split(" ")[0];
		
		String passwordEncoded = decodeBase64(secretEncoded);
		
		String secret = passwordEncoded.split(" ")[0];
		
		String userPassword = decodeBase64(secret);
		
		return userPassword;
	}

	
}

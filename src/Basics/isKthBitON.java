package Basics;

import java.util.ArrayList;
import java.util.List;

public class isKthBitON {
	static String a = "";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int number=57;
//		int k=2;
//		System.out.println(check(57,k));
		
		List<String> errors= new ArrayList<>();
		
		changeString(errors);
		System.out.println(errors.toString()+"see this works");
	}
	
	private static void changeString(List<String> errors) {
		errors.add("abc");
		errors.add("def");
		
	}
	
	
	
	
	public static boolean check(int n,int k) {
		
		int mask=1<<k;
		
		return (n & mask) == mask;
	}

}

package Basics;

import java.util.Scanner;

public class AdvancedCGD {

	public static Scanner scn=new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int test=Integer.parseInt(scn.nextLine());
		
		for(int t=0;t<test;t++)
		{
			String[] line=scn.nextLine().split(" ");
			String a=line[1];
			long b=Long.parseLong(line[0]);
			System.out.println(advancedGCD(a,b));
		}
	}

	private static long advancedGCD(String a, long b) {
		long new_a=0;
		for(int i=0;i<a.length();i++) {
			new_a*=10;
			new_a%=b;
			new_a+=Character.getNumericValue(a.charAt(i));
		}
		
		
		
		return gcd(new_a,b);
	}
	
	public static long gcd(long a, long b) {
		
		
		long dividend=b;
		long divisor=a;
		long rem=dividend%divisor;
		while(rem>0) {
			dividend=divisor;
			divisor=rem;
			rem=dividend%divisor;
		}
		
		
		return divisor;
	}

}

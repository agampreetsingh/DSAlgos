package Basics.demo;

public class GCD {

	public static void main(String[] args) {
		int n1=24;
		int n2=60;
		System.out.println(findGCD(n2,n1));
	}
	public static int findGCD(int n1,int n2) {
		int gcd=1;
		
		int rem=n1%n2;
		while(rem!=0) {
			n2=n1;
			n1=rem;
			rem=n1%n2;
		}
		gcd=n1;
		return gcd;
	}

}

package demo.techniques.recursion;

import java.util.Scanner;

public class Recursion {
	
	public static void main(String[] args) {
		int n = 5;
		//printMagic(n);
//		Long start = System.currentTimeMillis();
//		System.out.println(fibR(45));
//		System.out.println("Time for DP: "+ (System.currentTimeMillis()-start));
//		
//		Long startDP = System.currentTimeMillis();
//		System.out.println(fib(45, new int[46]));
//		System.out.println("Time for DP: "+ (System.currentTimeMillis()-startDP));
		Scanner scn = new Scanner(System.in);
		int count = scn.nextInt();
		printPrimes(10);
		
		printNPrimes(count);
		
	}

	public static void printNPrimes(int count) {
		printNPrimes(0,count);
		
	}

	private static void printNPrimes(int number, int count) {
		if(count == 0) {
			return;
		}
		
		if(isPrime(number)) {
			System.out.println(number);
			count--;
		}
		printNPrimes(number+1, count);
	}

	private static int fib(int n, int[] dp) {
		if(n == 0 || n == 1) {
			return n;
		}
		if(dp[n]!=0) {
			return dp[n];
		}
		int fibN = fib(n-1,dp) + fib(n-2,dp);
		dp[n]=fibN;
		return dp[n];
	}
	
	
	
	private static int fibR(int n) {
		if(n == 0 || n == 1) {
			return n;
		}
		
		int fibN = fibR(n-1) + fibR(n-2);
		return fibN;
	}

	private static void printMagic(int n) {
		if(n==-1) {
			return;
		}
		
		printMagic(n-1);
		System.out.println(n);
		
	}
	
	private static void printPrimes(int n) {
		if(n == 0 || n == 1) {
			return;
		}
		
		printPrimes(n-1);
		
		if(isPrime(n)== true) {
			System.out.println(n);
		}
		
	}

	
	private static boolean isPrime(int n) {
		if(n == 2) {
			return true;
		}
		for(int i = 2; i<=Math.sqrt(n); i++) {
			if(n%i == 0) {
				return false;
			}
		}
		return true;
	}
	
}

 
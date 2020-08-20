package codeArena;

import java.util.Scanner;

public class TestClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int test=scn.nextInt();
		for(int t=0;t<test;t++) {
			short x=scn.nextShort();
			int y=scn.nextInt();
			int n=scn.nextInt();
			
			System.out.println(sum(x,y,n));
			
		}
	}
	
	public static long sum(long x, long y, long n) {
		long sum=x+y;
			for(int i=2;i<n;i++) {
				long temp=Math.abs(x-y);
				sum+=temp;
				x=y;
				y=temp;
			}
	
		return sum;
	}

}

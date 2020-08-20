package codechef;

import java.util.Scanner;

public class CHN15A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn=new Scanner(System.in);
		int test=scn.nextInt();
		for(int t=0;t<test;t++) {
			int n=scn.nextInt();
			int k=scn.nextInt();
			int count=0;
			
			for(int i=0;i<n;i++) {
				if((scn.nextInt()+k)%7==0) {
					count++;
				}
			}
			System.out.println(count);
		}
	}
	
}

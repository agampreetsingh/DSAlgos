package HackerEarth;

import java.util.Scanner;

public class AmazonConvertToOne {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		System.out.println(countRed(n));
	}
	
	public static int countRed(int n) {
		
		if(n==4 || n==3) {
			return 2;
		}
		else if(n==1) {
			return 0;
		}
		else if(n==2) {
			return 1;
		}
		else{
			return Integer.toBinaryString(n).length()+1;
		}
		
	}
}

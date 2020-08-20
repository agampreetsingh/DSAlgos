package GeeksForGeeks.qc;

import java.util.Scanner;

public class FindMissingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int test=scn.nextInt();
		for(int t=0;t<test;t++) {
			int n=scn.nextInt();
			int totalXOR=0;
			switch(n%4) {
			case 0: totalXOR= n; break;
			case 1: totalXOR= 1; break;
			case 2: totalXOR= n+1; break;
			case 3: totalXOR= 0; break;
			}
			
		}

	}

}

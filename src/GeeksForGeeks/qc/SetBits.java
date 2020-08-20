package GeeksForGeeks.qc;

import java.util.Scanner;

public class SetBits {

	public static void main(String[] args) {

		Scanner scn=new Scanner(System.in);
		
		int test=scn.nextInt();
		for(int t=0;t<test;t++) {
			int n=scn.nextInt();
			System.out.println(countSetBits(n));
		}
		
	}

	public static int countSetBits(int n) {
		int mask=1;
		int count=0;
		for(int i=0;i<32;i++) {
			if((mask & n)==mask) {
				count++;
			}
			mask<<=1;
		}
		return count;
	}
}

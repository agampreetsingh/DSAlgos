package HackerEarth.AugustCircuts;

import java.util.Arrays;
import java.util.Scanner;

public class NoorAndFish {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int test=scn.nextInt();
		for(int t=0;t<test;t++) {
			int n=scn.nextInt();
			int[] s=new int[n];
			int[] e=new int[n];
			for(int i=0;i<n;i++) {
				s[i]=scn.nextInt();
				e[i]=scn.nextInt();
			}
			
			System.out.println(countFish(s,e,n));
		}
	}
	
	public static int countFish(int[] s, int[] e, int n) {
		int remainingFishes=n;
		//pending
		
		return remainingFishes;
	}
}

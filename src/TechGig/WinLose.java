package TechGig;

import java.util.Arrays;
import java.util.Scanner;

public class WinLose {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int test=scn.nextInt();
		for(int t=0;t<test;t++) {
			int n=scn.nextInt();
			int[] v=new int[n];
			int[] h=new int[n];
			for(int i=0;i<n;i++) {
				v[i]=scn.nextInt();
			}
			for(int i=0;i<n;i++) {
				h[i]=scn.nextInt();
			}
			System.out.println(endGame(v,h));
		}
	}
	public static String endGame(int[] v,int[] h) {
		Arrays.sort(v);
		Arrays.sort(h);
		for(int i=0;i<v.length;i++) {
			if(h[i]<v[i]) {
				return "LOSE";
			}
		}
		return "WIN";
	}

}

package codeArena.demo;

import java.util.Arrays;
import java.util.Scanner;

public class TestClass6 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int test=scn.nextInt();
		for(int t=0;t<test;t++) {
			int r=scn.nextShort();
			int s=scn.nextShort();
			int n=scn.nextInt();
			int[] arr=new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=scn.nextInt();
			}
			
			System.out.println(checkWinner(r,s,arr));
		}
	}

	private static String checkWinner(int r, int s, int[] arr) {
		
		Arrays.sort(arr);
		int eatR=0;
		int eatS=0;
		int capR=r;
		int capS=s;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<capR) {
				capR-=arr[i];
				eatR++;
			}
			if(arr[i]<capS) {
				capS-=arr[i];
				eatS++;
			}
			if(arr[i]>capR && arr[i]>capS) {
				break;
			}
		}
		
		if(eatR<eatS) {
			return "Sayan Won";
		}
		if(eatS<eatR) {
			return "Raghu Won";
		}
		else {
			return "Tie";
		}
		
	}
}

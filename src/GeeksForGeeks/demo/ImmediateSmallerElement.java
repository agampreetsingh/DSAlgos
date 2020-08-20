package GeeksForGeeks.demo;

import java.util.Scanner;

public class ImmediateSmallerElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int test=scn.nextInt();
		for(int t=0;t<test;t++) {
			int n=scn.nextInt();
			int[] arr=new int[n];
			
			for(int i=0;i<n;i++) {
				arr[i]=scn.nextInt();
			}
			
			printImm(arr);
		}
	}

	public static void printImm(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i+1]<arr[i]) {
				System.out.print(arr[i+1] + " ");
			}
			else {
				System.out.print("-1 ");
			}
		}
		
			System.out.print("-1 ");
		
		System.out.println();
	}
}

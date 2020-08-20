package GeeksForGeeks.demo;

import java.util.Scanner;

public class RotatingArray1D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int test=scn.nextInt();
		for(int t=0;t<test;t++) {
			int n=scn.nextInt();
			int[] arr= new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=scn.nextInt();
			}
			
			rotate(arr);
			display(arr);
		}
	}

	public static void rotate(int[] arr) {
		
	}
	
	
	public static void display(int[] arr) {
		
	}
}

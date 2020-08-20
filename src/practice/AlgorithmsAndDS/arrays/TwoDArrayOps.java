package practice.AlgorithmsAndDS.arrays;

import java.util.Scanner;

public class TwoDArrayOps {

	public static void takeInput(int[][] arr) {
		Scanner scn=new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			for(int j=0;i<arr[i].length;j++) {
				arr[i][j]=scn.nextInt();
			}
		}
	}
	
	public static void display(int[][] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}


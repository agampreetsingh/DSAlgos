package practice.AlgorithmsAndDS.arrays;

import java.util.Scanner;

public class ArrayOperations {
	
	public static void takeInput(int[] arr) {
		Scanner scn=new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			arr[i]=scn.nextInt();
		}
	}
	
	public static void display(int[] arr) {
		for(int item: arr ) {
			System.out.print(item+" ");
		}
	}
}

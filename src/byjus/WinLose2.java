package byjus;

import java.util.ArrayList;
import java.util.Scanner;

public class WinLose2 {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int test=scn.nextInt();
		for(int t=0;t<test;t++) {
			int n=scn.nextInt();
			int[] arr=new int[n];
			
			for(int i=0;i<n;i++) {
				arr[i]=scn.nextInt();
			}
			
			printMaximumSubArraySum(arr);
		}
	}
	public static void printMaximumSubArraySum(int[] arr) {
		int[] a1;
		if(arr.length%2!=0) {
			a1=new int[(arr.length/2)+1];
		}
		else
		a1=new int[arr.length/2];
		int[] a2=new int[arr.length/2];
		for(int i=0,j=0;i<arr.length-1;i+=2,j++) {
			a1[j]=arr[i];
		}
		if(arr.length%2!=0) {
			a1[a1.length-1]=arr[arr.length-1];
		}
		for(int i=1,j=0;i<arr.length-1;i+=2,j++) {
			a2[j]=arr[i];
		}
		
		if(maximumSubArraySum(a1)>maximumSubArraySum(a2)) {
			printList(a1);
		}
		else
			printList(a2);
		
		
	}
	
	private static void printList(int[] arr) {
		int osum=arr[0];
		int csum=arr[0];
		ArrayList<Integer> list=new ArrayList<>();
		for(int i=1;i<arr.length;i++) {
			if(csum+arr[i]<arr[i]) {
				csum=arr[i];
				//list=new ArrayList<>();
				list.add(arr[i]);
			}
			else {
				csum+=arr[i];
				list.add(arr[i]);
			}
			if(csum>osum) {
				osum=csum;
				//list.add(arr[i]);
			}
		}		
		System.out.println(list);
		
	}
	public static int maximumSubArraySum(int[] arr) {
		int osum=arr[0];
		int csum=arr[0];
		
		for(int i=1;i<arr.length;i++) {
			if(csum+arr[i]<arr[i]) {
				csum=arr[i];
		
			}
			else {
				csum+=arr[i];
		
			}
			if(csum>osum) {
				osum=csum;
			}
		}		
		//System.out.println(list);
		return osum;
	}
	
}

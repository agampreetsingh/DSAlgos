package codeArena.demo;

import java.util.Scanner;

public class TestClass10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int test=scn.nextInt();
		for(int t=0;t<test;t++) {
			int n=scn.nextInt();
			int[] arr=new int[n];
			int q=scn.nextInt();
			for(int i=0;i<n;i++) {
				arr[i]=scn.nextInt();
			}
			
			while(q>0) {
				int type=scn.nextInt();
				int left=scn.nextInt();
				int right=scn.nextInt();
				if(type==0) {
					System.out.println(longestLenght(arr,left,right));
				}
				else {
					arr[left-1]+=right;
				}				
				q--;
			}
		}
	}

	public static int longestLenght(int[] arr, int left, int right) {
		int count=0;
		int maxCount=count;
		for(int i=left;i<right;i++) {
			if(arr[i]<arr[i-1]) {

				
				count=0;
			}
			else
			{
				count++;
			}
			if(maxCount<count) {
				maxCount=count;
			}
		}
		
		
		return maxCount+1;
	}

}

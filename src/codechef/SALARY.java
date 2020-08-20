package codechef;

import java.util.Scanner;
public class SALARY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int test=scn.nextInt();
		for(int t=0;t<test;t++) {
			int n=scn.nextInt();
			int[] a=new int[n];
			int sum=0;
			int min=Integer.MAX_VALUE;
			for(int i=0;i<n;i++) {
				a[i]=scn.nextInt();
				if(a[i]<min) {
					min=a[i];
				}
				sum+=a[i];
			}
			
				System.out.println(sum-(n*min));
		}
		
	}

}

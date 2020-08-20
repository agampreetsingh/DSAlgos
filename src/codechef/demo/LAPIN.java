package codechef.demo;

import java.util.Scanner;

public class LAPIN {
	public static Scanner scn=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int test=scn.nextInt();
		scn.nextLine();
		for(int t=0;t<test;t++) {
			String s=scn.nextLine();
			int[] a=new int[26];
			int[] b=new int[26];
			s=s.toLowerCase();
			for(int i=0,j=s.length()-1;i<s.length()/2 || j>s.length()/2;i++,j--) {
				a[s.charAt(i)-97]++;
				b[s.charAt(j)-97]++;
			}
			match(a,b);
			
		}

	}
	
	public static void match(int[] a,int[] b) {
		for(int i=0;i<a.length;i++) {
			if(a[i]!=b[i]) {
				System.out.println("NO");
				return;
			}
		}
		System.out.println("YES");
		return;
	}

}

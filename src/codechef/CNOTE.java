package codechef;

import java.util.Scanner;
public class CNOTE {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int test=scn.nextInt();
		for(int t=0;t<test;t++) {
			int x=scn.nextInt();
			int y=scn.nextInt();
			int k=scn.nextInt();
			int n=scn.nextInt();
			int[] p=new int[n];
			int[] c=new int[n];
			for(int i=0;i<n;i++) {
				p[i]=scn.nextInt();
				c[i]=scn.nextInt();
			}
			
			int remaining=x-y;
			chef(k, n, p, c, remaining);
		}
	}

	private static void chef(int k, int n, int[] p, int[] c, int remaining) {
		if(remaining<0) {
			System.out.println("LuckyChef");
			return;
		}
		else {
			
			for(int i=0;i<n;i++) {
				if(p[i]>=remaining && c[i]<=k) {
					System.out.println("LuckyChef");
					return;
				}
			}
			System.out.println("UnluckyChef");
		}
	}

}

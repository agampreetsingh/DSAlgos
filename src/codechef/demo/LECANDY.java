package codechef.demo;

import java.util.Scanner;

public class LECANDY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int test = scn.nextInt();
		for (int t = 0; t < test; t++) {
			int n = scn.nextInt();
			int c = scn.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				c -= scn.nextInt();
			}
			if (c < 0) {
				System.out.println("No");
			} else
				System.out.println("Yes");
		}

	}

}

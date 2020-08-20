package codeArena;

import java.util.Scanner;

public class TestClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int test = scn.nextInt();
		for (int t = 0; t < test; t++) {
			long p = scn.nextInt();
			long m = scn.nextInt();
			System.out.println(countDiffBits(p, m));
		}
	}

	public static int countDiffBits(long p, long m) {
		int count=0;
		long xor=p ^ m;
		for(int i=0;i<64;i++) {
			if(check(xor,i)==true)
			{
				count++;
			}
		}
		
		return count;
	}

	public static boolean check(long n, int k) {

		int mask = 1 << k;

		return (n & mask) == mask;
	}

}

package codeArena;

import java.util.Scanner;

public class TestClass7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int test=scn.nextInt();
		for(int t=0;t<test;t++) {
			int b1=scn.nextInt();
			int b2=scn.nextInt();
			int m1=scn.nextInt();
			int m2=scn.nextInt();
			System.out.println(answer(b1,b2,m1,m2));
		}
	}

	private static String answer(int b1, int b2, int m1, int m2) {
		if((Math.max(b1, b2)<Math.min(m1, m2) && Math.max(m1, m2)<Math.min(b1, b2)) || (Math.max(m1, m2)<Math.min(b1, b2) || Math.max(b1, b2)<Math.min(m1, m2))) {
			if((Math.abs(Math.max(b1, b2)-Math.min(m1, m2))) >1 || (Math.abs(Math.max(b1, b2)-Math.min(m1, m2)))  > 1)
			return "Line";
		}
		if(b1==m1 || b1==m2 || b2==m1 || b2==m2) {
		return "Point";
		}
		else {
			return "Nothing";
		}
		
	}

}

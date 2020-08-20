package HackerEarth.AugustCircuts;

import java.util.Scanner;

public class PicuAndBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int test=scn.nextInt();
		for(int t=0;t<test;t++) {
			int d=scn.nextInt();
			int a=scn.nextInt();
			int m=scn.nextInt();
			int b=scn.nextInt();
			int x=scn.nextInt();
			double numerator=((x-d)*(m+1));
			double denomenator=((m*a)+b);
									
			//int days = countdays(d, a, m, b, x);

			int days=(int) Math.round(numerator/denomenator);
			System.out.println(days);
		}
	}

	private static int countdays(int d, int a, int m, int b, int x) {
		int days=0;
		int ca=0;
		int cb=0;
		while(d<x) {
			if(ca<=m) {
				d+=a;
				ca+=1;
				ca%=m;
				days++;
			}
			if(cb!=0) {
				d+=b;
				cb+=1;
				cb%=2;
				days++;
			}
		}
		return days;
	}

}

/* TEST CASES
7
2 5 4 3 51
2 5 4 3 46
3 6 3 5 60
5 8 5 4 70
10 6 7 5 80
20 15 10 8 100
50 40 35 15 150



7
2 5 4 3 12
2 5 4 3 100
3 6 3 5 90
5 8 5 2 60
10 6 7 3 100
20 15 11 8 100
50 40 32 15 150

*/

/* ANSWERS
 11
 10
 10
 9
 12
 6
 3
 
 
 3
22
16
8
16
6
 
*/
 

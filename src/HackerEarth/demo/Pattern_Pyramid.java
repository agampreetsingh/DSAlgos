package HackerEarth.demo;

import java.util.Scanner;

public class Pattern_Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int input = scn.nextInt();
		pat(input);
	}

	public static void pat(int input) {
		int left = 1;
		int lowInRight = (input * (input + 1)) - input + 1;
		int right = lowInRight;
		int spaces = 0;
		for (int i = input; i > 0; i--) {
			for (int s = 0; s < spaces; s++) {
				System.out.print("\t");
			}

			spaces += 2;

			for (int j = 0; j < i; j++) {
				System.out.print(left + "\t*\t");
				left++;
			}

			for (int r = 0; r < i; r++) {
				System.out.print(right + "\t");
				if (r < i - 1)
					System.out.print("\t*\t");
				right++;
			}

			lowInRight -= i - 1;
			right = lowInRight;

			System.out.println();
		}

	}

}

/*
 * 
 * 1 * 2 * 3 * 4 * 5 * 26 * 27 * 28 * 29 * 30 6 * 7 * 8 * 9 * 22 * 23 * 24 * 25
 * 10 * 11 * 12 * 19 * 20 * 21 13 * 14 * 17 * 18 15 * 16
 * 
 * 
 * 1 * 2 * 3 * 4 * 17 * 18 * 19 * 20 5 * 6 * 7 * 14 * 15 * 16 8 * 9 * 12 * 13 10
 * * 11
 * 
 * 
 */
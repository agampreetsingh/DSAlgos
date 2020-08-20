package codechef.demo;

import java.util.Scanner;

public class FRGTNLNG {

	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int test = scn.nextInt();
		for (int t = 0; t < test; t++) {
			int n = scn.nextInt();
			int k = scn.nextInt();
			scn.nextLine();
			String[] words = new String[n];
			words = scn.nextLine().split(" ");
			String[] phrases = new String[k];
			for (int i = 0; i < k; i++) {
				phrases[i] = scn.nextLine();
			}
			check(words,phrases);
			System.out.println();
		}
	}
	public static void check(String[] words, String[] phrases) {
		for(int i=0;i<words.length;i++) {
			boolean found=false;
			for(int j=0;j<phrases.length;j++) {
				if(phrases[j].contains(words[i])) {
					found=true;
				}
			}
			if(found==true) {
				System.out.print("YES ");
			}
			else {
				System.out.print("NO ");
			}
		}
	}

}

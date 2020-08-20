package HackerEarth;

import java.math.BigInteger;
import java.util.Scanner;

public class MaxBinaryMatrix {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String args[]) throws Exception {

		// Write your code here
		String[] line = scn.nextLine().split(" ");
		int n = Integer.parseInt(line[0]);
		int m = Integer.parseInt(line[1]);

		
		String[] arr = new String[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextLine();

		}

		System.out.println(maxBinary(arr));

	}

	public static int maxBinary(String[] arr) {
		int index = 0;
		int max = Integer.MIN_VALUE;
		int power = arr.length - 1;
		int number = 0;
		for (int i = 0; i < arr.length; i++) 
		{
			power=0;
			for (int j = 0; j < arr[0].length(); j++) 
			{
				number+=Math.pow(Integer.parseInt(arr[i].charAt(j)+""),power);
				power--;
			}
			
			if(number>max)
			{
				max=number;
				index=i=1;
			}
			
		}

		return index;
	}
}

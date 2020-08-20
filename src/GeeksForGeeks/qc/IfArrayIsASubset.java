package GeeksForGeeks.qc;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

//https://practice.geeksforgeeks.org/problems/array-subset-of-another-array/0

public class IfArrayIsASubset {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int test = scn.nextInt();
		for (int t = 0; t < test; t++) {
			int n = scn.nextInt();
			int m = scn.nextInt();
			Map<Integer, Integer> arr1 = new HashMap<>();
			
			for (int i = 0; i < n; i++) {
				int number = scn.nextInt();
				if (arr1.containsKey(number))
					arr1.put(number, arr1.get(number) + 1);
				else
					arr1.put(number, 1);
			}
			
			List<Integer> arr2 = new LinkedList<Integer>();
			
			for (int i = 0; i < m; i++) {
				arr2.add(scn.nextInt());
			}
			
			System.out.println(check(arr1,arr2)?"Yes":"No");

		}

	}

	
	public static boolean check(Map<Integer, Integer> arr1,List<Integer> arr2) {
		boolean rv=true;
		
		if(arr2.size()>arr1.size()) {
			return false;
		}
		int i=0;
		while(i<arr2.size()) {
			int number=arr2.get(i);
			if(arr1.containsKey(number)) {
				if(arr1.get(number)>0) {
					arr2.remove(i);
					arr1.replace(number, arr1.get(number)-1);
				}
				else {
					return false;
				}
			}
			else {
				return false;
			}
			
		}
		
		
	
		return rv;
	}
}

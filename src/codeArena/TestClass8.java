package codeArena;

import java.util.HashMap;
import java.util.Scanner;

public class TestClass8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		Stream.iterate(new int[]{2, 3},
				t -> new int[]{arr[1],arr[0] + arr[1]}) limit(10).map(arr -> arr[0]).forEach(System.out::println);
		
	}

	private static int sitting(int n, HashMap<Integer, Integer> map, int[] arr) {
		int count=0;
		HashMap<Integer,Boolean> sitting=new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			if(map.containsKey(arr[i])) {
				{
					if(!sitting.containsKey(arr[i]))
					{
						count++;
						sitting.put(arr[i],true);
					}
					if(!sitting.containsKey(map.get(arr[i])))
					{
						count++;
						sitting.put(map.get(arr[i]),true);
					}
				}
			}
		}
		
		
		return count;
	}

}

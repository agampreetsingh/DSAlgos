package codeArena;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class TestClass9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int test=scn.nextInt();
		for(int t=0;t<test;t++) {
			int n=scn.nextInt();
			int k=scn.nextInt();
			int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		
		System.out.println(cost(arr,k));
		}
			
	}
	
	public static int cost(int[] arr,int k) {
		int cost=0;
		Map<Integer,Integer> map=new HashMap<>();
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			if(map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i])+1);
			}
			else
				map.put(arr[i],1);
		}

		int maxVal=Integer.MIN_VALUE;
		int maxKey=0;
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
		   if(entry.getValue()>maxVal) {
			   maxVal=entry.getValue();
			   maxKey=entry.getKey();
		   }
		}
		return cost;
	}

}

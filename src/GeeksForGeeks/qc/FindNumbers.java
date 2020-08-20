package GeeksForGeeks.qc;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int test=scn.nextInt();
		for(int t=0;t<test;t++) {
			int n=scn.nextInt();
			int[] a=new int[2*n+2];
			for(int i=0;i<2*n + 2;i++)
			{
				a[i]=scn.nextInt();
			}
			numbers(a);
		}
	}

	public static void numbers(int[] arr) {
		Map<Integer, Integer> count=new HashMap<Integer, Integer>();
		for(int i=0;i<arr.length;i++) {
			if(count.containsKey(arr[i])) {
				count.remove(arr[i]);
			}
			else {
				count.put(arr[i],1);
			}
		}
		Integer[] a=new Integer[2];
		int n1=count.keySet().toArray(a)[0];
		int n2=arr[1];
		
		System.out.println(n1>n2?n1+" "+n2:n2+" "+n1);
	}
}

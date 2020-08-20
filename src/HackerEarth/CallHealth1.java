package HackerEarth;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class CallHealth1 {

	public static class Connection{
		public int x;
		public int y;
		
	}
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		int n=scn.nextInt();
		int m=scn.nextInt();
		int k=scn.nextInt();
		Connection[] cons=new Connection[m];
		for(int i=0;i<m;i++)
		{
			cons[i]= new Connection();
			cons[i].x=scn.nextInt();
			cons[i].y=scn.nextInt();
		}
		
		printVouchers(n,cons,k);
	}
	public static void printVouchers(int n, Connection[] cons, int k) {
		ArrayList<HashSet<Integer>> flights=new ArrayList<>();
		HashSet<Integer> temp=new HashSet<>();
		temp.add(cons[0].x);
		temp.add(cons[0].y);
		flights.add(temp);
		for(int i=1;i<cons.length;i++) {
			boolean found=false;
			for(int j=0;j<flights.size();j++) {
				if(flights.get(j).contains(cons[i].x) || flights.get(j).contains(cons[i].y)) {
					flights.get(j).add(cons[i].x);
					flights.get(j).add(cons[i].y);
					found=true;
					break;
			}
				
			}
			if(found==false) {
				HashSet<Integer> t=new HashSet<>();
				t.add(cons[i].x);
				t.add(cons[i].y);
				flights.add(t);
			}
		
		}
		System.out.println(flights.size());
		
		for(int i=0;i<flights.size();i++) {
			Integer[] arr=new Integer[flights.get(i).size()];
			arr=flights.get(i).toArray(arr);
			Arrays.sort(arr);
			System.out.print(arr[k-1]+" ");
		}
		
	}

}

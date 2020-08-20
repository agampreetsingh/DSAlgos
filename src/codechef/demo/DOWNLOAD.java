package codechef.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DOWNLOAD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int recipies=scn.nextInt();
		List<Integer> s=new ArrayList<>();
		List<Integer> e=new ArrayList<>();
		
		for(int r=0;r<recipies;r++) {
			s.add(scn.nextInt());
			e.add(scn.nextInt());
		}
		int groups=scn.nextInt();
		for(int g=0;g<groups;g++) {
			int aliens=scn.nextInt();
			int[] a=new int[aliens];
			for(int i=0;i<aliens;i++) {
				a[i]=scn.nextInt();
			}
			System.out.println(count(s,e,a));
		}
	}
	public static int count(List<Integer> start, List<Integer> end, int[] a) {
		int count=0;
		List<Integer> s=new ArrayList<>(start);
		List<Integer> e=new ArrayList<>(end);
		for(int i=0;i<a.length;i++) {
			int j=0;
			while(j<s.size()) {
	
			if(a[i]<=e.get(j) && a[i]>=s.get(j)) {
				count++;
				s.remove(j);
				e.remove(j);
				
			}
			else {
				j++;	
			}
			
			}
		}
	
		
		
		
		return count;
	}
}

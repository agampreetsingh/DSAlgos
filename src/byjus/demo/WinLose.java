package byjus.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WinLose {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int test=scn.nextInt();
		for(int t=0;t<test;t++) {
			int n=scn.nextInt();
			scn.nextLine();
			String t1=scn.nextLine();
			String t2=scn.nextLine();
			System.out.println(countDraws(t1,t2));
		}
	}
	public static int countDraws(String t1, String t2) {
		int draws=0;
		Map<Character,Integer> map=new HashMap<>();
		for(int i=0;i<t1.length();i++) {
			if(map.containsKey(t1.charAt(i))) {
				map.put(t1.charAt(i), map.get(t1.charAt(i))+1);
			}
			else
				map.put(t1.charAt(i), 1);
		}
		
		for(int i=0;i<t2.length();i++) {
			if(map.containsKey(t2.charAt(i))) {
				if(map.get(t2.charAt(i))>0){
					draws++;
					map.put(t2.charAt(i), map.get(t2.charAt(i))-1);
				}
			}
		}
		return draws;
	}

}

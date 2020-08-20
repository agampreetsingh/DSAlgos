package codeArena;

import java.util.HashMap;
import java.util.Scanner;

public class TestClass5 {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		int test=scn.nextInt();
		scn.nextLine();
		for(int tt=0;tt<test;tt++) {
			String s=scn.nextLine();
			String t=scn.nextLine();
			System.out.println(editD(s,t));
		}
		
	}

	
	public static int editD(String s, String t) {
		int count=0;
		HashMap<Character,Integer> map=new HashMap<>();
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}
			else {
				map.put(ch, 1);
			}
		}
		
		for(int i=0;i<t.length();i++) {
			char ch=t.charAt(i);
			if(map.containsKey(ch)) {
				if(map.get(ch)==0) 
					map.put(ch, 1);
				else
					map.put(ch, map.get(ch)-1);
				}
			else
				map.put(ch, 1);
			}
		
		for (Object value : map.values()) {
		    count+=(int)value;
		} 
		return count;
	}
}

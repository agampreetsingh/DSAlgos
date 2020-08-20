package codeArena;

import java.util.*;
public class TestClass {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int test=scn.nextInt();
		for(int t=0;t<test;t++) {
			String s=scn.nextLine();
			System.out.println(rot15(s));
		}
	}
	public static String rot15(String s)
	{
		String code="";
		int[] codes=new int[26];
		for(int i=0;i<s.length();i++) {
			codes[s.charAt(i)-97]++;
			code+=getChar(s.charAt(i),13+codes[s.charAt(i)-97]-1);
			
		}
		
		return code;
	}
	
	 public static char getChar(char ch, int n) {
			char rv;
			int x=ch;
			if(x+n>122) {
				rv=(char) ((((x+n)-122)%26)+97);
			}
			else
				rv=(char) (x+n);
			
			return rv;
		}
}

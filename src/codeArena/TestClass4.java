package codeArena;

import java.util.HashMap;
import java.util.Scanner;

public class TestClass4 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		
		int x=scn.nextInt();
		int y=scn.nextInt();
		HashMap<String,Integer> map=new HashMap<>();
		
		System.out.println(printAnswer(recFunc(x,y,map)));
		
	}

	public static int recFunc(int x,int y, HashMap<String, Integer> map) {
		if(map.containsKey(x+","+y)) {
			return map.get(x+","+y);
		}
		if(x==0) {
			map.put(x+","+y, y+1);
			return y+1;
		}
		if(x>0 && y==0) {
			return recFunc(x-1,1,map);
		}
		else
		{
			return recFunc(x-1,recFunc(x,y-1,map),map);
			
		}
	}
	
	public static String printAnswer(int n) {
		String answer=String.valueOf(n);
		answer="00"+answer;
		answer=answer.substring(answer.length()-3);
		return answer;
	}
}

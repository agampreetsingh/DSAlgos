package HackerEarth.AugustCircuts;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StringOcc {

	public static Scanner scn=new Scanner(System.in);
	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		int size=scn.nextInt();
		scn.nextLine();
		String s=scn.nextLine();
		int max=Integer.MIN_VALUE;
		Map<Character,Integer> count=new HashMap<>();
		int sum=0;
		for(int i=0;i<size;i++) {
			if(count.containsKey(s.charAt(i)))
			count.put(s.charAt(i),count.get(s.charAt(i))+1);
			else
				count.put(s.charAt(i),1);
			if(count.get(s.charAt(i))>max) {
				max=count.get(s.charAt(i));
			}
			System.out.println(count);
		}
		for(Integer value: count.values()) {
			sum+=value;
		}
		
		System.out.println(sum-max);
		
		
		
	}

}

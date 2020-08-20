package GeeksForGeeks;

import java.util.Scanner;

public class sort0and1array {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int test=scn.nextInt();
		for(int t=0;t<test;t++){
		    int n=scn.nextInt();
		    int[] arr=new int[n];
		    int[] count=new int[3];
		    
		    for(int i=0;i<n;i++){
		    	
		        count[scn.nextInt()]++;
		    }
		    for(int i=0;i<3;i++){
		        for(int j=0;j<count[i];j++){
		            System.out.print(i+" ");
		        }
		    }
		    System.out.println();
		    
		}
		
	}
}

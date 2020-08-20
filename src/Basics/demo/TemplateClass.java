package Basics.demo;
import java.math.BigInteger;
import java.util.*;

public class TemplateClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scn =  new Scanner(System.in);
	        int test=scn.nextInt();
	        for(int t=0;t<test;t++){
	            int n=scn.nextInt();
	            int x=(int)Math.pow(n,3);
	            System.out.println(nainF(x));
	        }
	}
	
	public static long nainF(long x){
        if(x<=9){
            return x;
        }
        else{
            long sum=0;
            while(x!=0){
                long temp=x%10;
                x=x/10;
                sum+=temp;
            }
            return nainF(sum);
        }
    }

}

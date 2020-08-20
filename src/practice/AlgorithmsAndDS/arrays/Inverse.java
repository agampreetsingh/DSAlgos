package practice.AlgorithmsAndDS.arrays;

import java.util.Scanner;

public class Inverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		
		int size=scn.nextInt();
		int[] arr=new int[size];
		ArrayOperations.takeInput(arr);
		//int[] result=inverse(arr);
		//rotate(arr,3);
		ArrayOperations.display(arr);
		System.out.println(maxSubArraySum(arr));
	}
	
//	5
//	3 0 1 4 2
// Op-	1 2 4 0 3 
	public static int[] inverse(int[] arr) {
		int[] rv=new int[arr.length];
		for(int i=0;i<rv.length;i++) {
			rv[arr[i]]=i;
		}
		return rv;
	}
	
	public static boolean isMirrorInverse(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			if(arr[arr[i]]!=i) {
				return false;
			}
		}
		return true;
	}
	
	public static void rotate(int[] arr, int k) {
		reverse(arr,0,arr.length-k-1);
		reverse(arr,arr.length-k,arr.length-1);
		reverse(arr,0,arr.length-1);
	}
	
	public static void reverse(int[] arr, int beg, int end) {
		while(beg<end) {
			int temp=arr[beg];
			arr[beg]=arr[end];
			arr[end]=temp;
			beg++;
			end--;
		}
	}
	
	public static int maxSubArraySum(int[] arr) {
		int osum=arr[0];
		int csum=arr[0];
		for(int i=1;i<arr.length-1;i++) {
			
			if(csum+arr[i]>arr[i]) {
				csum+=arr[i];
			}
			else {
				csum=arr[i];
			}
			
			if(csum>osum) {
				osum=csum;
			}
		}
		return osum;
	}

}

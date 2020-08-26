package demo.datastructures;

public class KadanesAlgo {
	
	public static void main(String[] args) {
		int[] arr = {-2, -3, -4, -1, -2, 1, 5, -3};
		
		System.out.println(getLargestContSum(arr));
	}
	
	public static int getLargestContSum(int[] arr) {
		int msf = arr[0];
		int tempSum = arr[0];
		
		for(int i=0;i<arr.length;i++) {
			tempSum = Math.max(arr[i], tempSum + arr[i]);
			msf = Math.max(msf, tempSum);
		}
		return msf;
	}

}

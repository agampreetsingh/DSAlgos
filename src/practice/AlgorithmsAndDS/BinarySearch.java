package practice.AlgorithmsAndDS;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,4,5,6,7,8,9,11,12,15,20,55};
		int x=12;
		System.out.println(binarySearch(arr,x));
	}
	public static int search(int[] arr, int x) {
		int index=-1;
		int begin=0;
		int last=arr.length-1;
		while(begin<=last) {
			int mid=(begin + last)/2;
			if(x<arr[mid])
			{
				last=mid-1;
				
			}
			else if(x>arr[mid]) {
				begin=mid+1;
			}
			else {
				return mid;
			}
		}
		
		return index;
	}
	
	
	public static int binarySearch(int[] arr, int x)
	{
		int begin=0;
		int last=arr.length-1;
		while(begin<=last) {
			int mid=(begin+last)/2;
			if(arr[mid]==x) {
				return mid;
			}
			if(x<arr[mid]) {
				mid=mid-1;
			}
			else if(x>arr[mid]) {
				begin=mid+1;
			}
		}
		return -1;
	}
}

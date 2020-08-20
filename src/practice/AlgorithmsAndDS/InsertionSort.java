package practice.AlgorithmsAndDS;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,15,2,-1,7};
		sort(arr);
		display(arr);
	}
		
	public static void sort(int[] arr) {
		for(int i=1;i<arr.length-1;i++) {
			for(int j=i;j>0;j--) {
				if(arr[j]<arr[j-1]) {
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
				else
				{
					break;
				}
			}
		}
	}
	
	public static void display(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}

package demo.techniques;

public class _Patterns {

	public static void main(String[] args) {
		int n = 5;
		printZ(n);
		
		long number = 677778811;
		System.out.println(getFreq(number));
		
		int a = 10;
		int b = 20;
		System.out.println("a@n".matches(".@."));
		a = a + b;
		b = a - b;
		a = a -b;
		System.out.println("a: "+a+"  b:"+b);		
	}

	private static String getFreq(long number) {
		int[] arr = new int[10];
		String n = number+"";
		for(int i = 0; i< n.length(); i++) {
			int t = Integer.parseInt(n.charAt(i)+"");
			arr[t]++;
		}
		String rv = "";
		for(int i =0 ; i<arr.length ;i++) {
			if(arr[i]>0) {
				String temp =  i + ": "+arr[i]+" \n";
				rv = rv + temp;
			}
		}
		return rv;
	}

	private static void printZ(int n) {
		for(int i = 0; i< n; i++) {
			System.out.print("* ");
		}
		System.out.println();
		int spaces = n-2;
		for(int i =0; i< n-2; i++) {
			for(int s = spaces; s>0 ; s--) {
				System.out.print("  ");
			}
		System.out.print("* \n");
		spaces --;
		}
		for(int i = 0; i< n; i++) {
			System.out.print("* ");
		}
	}

}



//* * * * *
//      *
//    *
//  *
//* * * * * 
 

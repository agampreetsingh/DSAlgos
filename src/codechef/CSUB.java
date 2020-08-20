package codechef;
	
	import java.util.Scanner;
	
	public class CSUB {
		public static Scanner scn=new Scanner(System.in);
		public static void main(String[] args) {
			
			int test=scn.nextInt();
			for(int t=0;t<test;t++) {
				int n=scn.nextInt();
				scn.nextLine();
				String number=scn.nextLine();
				long count=0;
				for(int i=0;i<n;i++) {
					if(number.charAt(i)=='1') {
						count++;
					}
				}
				System.out.println(count*(count+1)/2);
			}
			
		}
	
	}

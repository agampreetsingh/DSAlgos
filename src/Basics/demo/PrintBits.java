package Basics.demo;

public class PrintBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=129;
		//System.out.println(Integer.toBinaryString((int)Math.pow(2, 6)));
		System.out.println(printBits(number));
	}
	
	public static String printBits(int number) {

		String binaryString="";
		int begin=(int) Math.sqrt(number);
		for(int i=begin;i>=0;i--) {
			int mask=1 << i;
			if((number & mask) == mask) {
				binaryString+=1;
			}
			else {
				binaryString+=0;
			}
		}
		return binaryString;
	}

}

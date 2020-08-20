package Basics;

public class ReverseOfANumber {

	public static void main(String[] args) {
		int number=98790;
		System.out.println(reverse(number));
	}
	public static int reverse(int number) {
		int reverse=0;
		while(number>0) {
			reverse*=10;
			reverse+=number%10;
			number=number/10;
		}
	
		
		
		return reverse;
	}

}

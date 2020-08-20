package Basics.demo;

public class toggleKthBi {

	public static void main(String[] args) {
		int number=57;
		int k=2;
		System.out.println(Integer.toBinaryString(number));
		System.out.println(Integer.toBinaryString(turnOn(number,k)));
	}
	
	public static int turnOn(int number, int k) {
		int mask=1 << k;
		return number | mask;
	}

}

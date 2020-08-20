package HackerEarth.demo;

public class apti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		interchange("HACKEREARTH");
	}

	public static void interchange(String s)
	{
		System.out.println(s.length());
		System.out.println(s);
		char[] a=new char[s.length()];
		for(int i=0;i<s.length()/2;i++)
		{
			a[i]=s.charAt(s.length()-i-1);
			a[a.length-1-i]=s.charAt(i);
		}
		a[5]=s.charAt(5);
		System.out.println();
		for(int i=0;i<11;i++)
		{
			System.out.print(a[i]);
		}
	}
}

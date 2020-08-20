package practice.AlgorithmsAndDS;


class Point{
	private int c;
	private int r;
	Point(int c, int r){
		this.c=c;
		this.r=r;
	}
	public String showPoint() {
		return this.c+", "+this.r;
	}
}
public class ExitPoint {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr= {
				{0,0,1,0},
				{1,0,0,0},
				{0,0,0,0},
				{1,0,1,0}};
		System.out.println(exitPoint(arr).showPoint());
	}
	public static Point exitPoint(int[][] arr) {
		Point point=null;
		int cc=0;
		int cr=0;
		for(int c=0,r=0;c<arr.length && r<arr[c].length;c++,r++) {
			
		}
		point=new Point(cc,cr);
		return point;
	}
	
	

}

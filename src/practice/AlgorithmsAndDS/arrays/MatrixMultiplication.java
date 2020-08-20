package practice.AlgorithmsAndDS.arrays;

public class MatrixMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a= {
				{10,0,0},
				{0,5,1}};
		int[][] b= {
				{0,5,10,0},
				{20,0,1,2},
				{1,1,1,5}};
		int[][] mul=matrixMultiply(a,b);
		TwoDArrayOps.display(mul);
	}
	
	public static int[][] matrixMultiply(int[][] a, int[][] b){
		if(a[0].length!=b.length) {
			System.out.println("Cannot be multiplied!");
			return new int[0][0];
		}
		else {
			int[][] result=new int[a.length][b[0].length];
			
			for(int i=0;i<result.length;i++) {
				for(int j=0;j<result[i].length;j++) {
					for(int k=0;k<a[0].length;k++) {
						result[i][j]+=(a[i][k]*b[k][j]);
					}
				}
			}
			
			return result;
		}
	}

}

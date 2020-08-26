package demo.techniques.dp;

public class GoldMine {

	public static void main(String[] args) {
		int mines[][] = { { 1, 3, 1 }, 
							{ 2, 2, 4 }, 
							{ 5, 0, 2}, 
							{ 0, 6, 1} };
		System.out.println(getMaxGoldDP(mines));
	}

	private static int getMaxGoldDP(int[][] mines) {
		int[][] dp = new int[mines.length][mines[0].length];

		for (int col = mines[0].length - 1; col >= 0; col--) {
			for (int row = 0; row < mines.length; row++) {
				if (col == mines[0].length - 1) {
					dp[row][col] = mines[row][col];
				} else if (row == 0) {
					dp[row][col] = mines[row][col] + Math.max(dp[row][col + 1], dp[row + 1][col + 1]);
				} else if (row == mines.length-1) {
					dp[row][col] = mines[row][col] + Math.max(dp[row][col + 1], dp[row - 1][col + 1]);
				} else {
					dp[row][col] = mines[row][col]
							+ Math.max(dp[row][col + 1], Math.max(dp[row - 1][col + 1], dp[row + 1][col + 1]));
				}
			}
		}

		int max = dp[0][0];
		for (int i = 0; i < dp.length; i++) {
			if (dp[i][0] > max) {
				max = dp[i][0];
			}
		}
		return max;
	}

}

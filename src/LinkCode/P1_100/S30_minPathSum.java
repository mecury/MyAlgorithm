package LinkCode.P1_100;

/**
 * Created by 18394 on 2017/2/14.
 */
public class S30_minPathSum {
    /**
     * @param grid: a list of lists of integers.
     * @return: An integer, minimizes the sum of all numbers along its path
     */
    public int minPathSum(int[][] grid) {
        int hang = grid.length;
        if (hang == 0) {
            return 0;
        }
        int lie = grid[0].length;
        if (lie == 0){
            return 0;
        }

        for (int i = 1; i < lie; i++){
            grid[0][i] += grid[0][i-1];
        }
        for (int i = 1; i < hang; i++){
            grid[i][0] += grid[i-1][0];
        }
        for (int i = 1; i < hang; i++){
            for (int j = 1; j < lie; j++){
                grid[i][j] += Math.min(grid[i-1][j], grid[i][j-1]);
            }
        }
        return grid[hang - 1][lie - 1];
    }
}

package LinkCode.P101_200;

/**
 * Created by 18394 on 2017/2/22.
 */
public class S109_MinimumTotal {
    /**
     * @param triangle: a list of lists of integers.
     * @return: An integer, minimum path sum.
     */
    public int minimumTotal(int[][] triangle) {
        if (triangle.length == 1 && triangle[0].length == 1) return triangle[0][0];
        int row = triangle.length;
        int result = Integer.MAX_VALUE;

        for (int i = 1; i < row; i++){
            for (int j = 0; j < triangle[i].length; j++) {
                if (j == 0) {
                    triangle[i][0] += triangle[i - 1][0];
                } else if (j == triangle[i].length - 1) {
                    triangle[i][j] += triangle[i-1][j-1];
                } else {
                    triangle[i][j] += Math.min(triangle[i-1][j], triangle[i-1][j-1]);
                }
                if (i == row - 1) {
                    result = Math.min(result, triangle[i][j]);
                }
            }
        }
        return result;
    }
}

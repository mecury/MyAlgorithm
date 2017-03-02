package LinkCode.P1_100;

/**
 * Created by 18394 on 2017/3/2.
 */
public class S28_SearchMatrix {
    /**
     * @param matrix, a list of lists of integers
     * @param target, an integer
     * @return a boolean, indicate whether matrix contains target
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int row = matrix.length, col = matrix[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = col - 1; j >= 0; j--) {
                int curNum = matrix[i][j];
                if (curNum == target) {
                    return true;
                } else if (curNum > target) {
                    continue;
                } else if (curNum < target) {
                    break;
                }
                if (j == 0) {
                    return false;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] martix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 50}};
        System.out.println(new S28_SearchMatrix().searchMatrix(martix, 3));
    }
}

package LinkCode.P1_100;

/**
 * Created by 18394 on 2017/3/2.
 */
public class S61_SearchRange {
    /**
     *@param A : an integer sorted array
     *@param target :  an integer to be inserted
     *return : a list of length 2, [index1, index2]
     */
    public int[] searchRange(int[] A, int target) {
        int[] result = new int[2];
        if (A == null || A.length == 0){
            result[0] = -1;
            result[1] = -1;
            return result;
        }

        int left = 0, right = A.length - 1;
        while (left <= right){
            int mid = (left + right) / 2;
            if (A[mid] == target){
                for (int i = mid; i >= 0; i--){
                    if (A[i] != A[mid]){
                        result[0] = i + 1;
                        break;
                    }
                    if (i == 0){
                        result[0] = 0;
                        break;
                    }
                }
                for (int i = mid; i < A.length; i++){
                    if (A[i] != A[mid]){
                        result[1] = i - 1;
                        return result;
                    }
                    if (i == A.length - 1) {
                        result[1] = A.length - 1;
                    }
                }
                return result;
            } else if (A[mid] < target){
                left = mid + 1;
            } else if (A[mid] > target) {
                right = mid - 1;
            }
        }
        result[0] = -1;
        result[1] = -1;
        return result;
    }
    public static void main(String[] args){
        int[] result = new S61_SearchRange().searchRange(new int[]{9,10,100,101,1002,10203}, 10203);
        System.out.println(result[0] + " " + result[1]);
    }

}

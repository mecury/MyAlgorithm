package LinkCode.P1_100;

/**
 * Created by 18394 on 2017/3/2.
 */
public class S60_SearchInsert {
    /**
     * param A : an integer sorted array
     * param target :  an integer to be inserted
     * return : an integer
     */
    public int searchInsert(int[] A, int target) {
        if(A == null || A.length == 0) return 0;
        int length = A.length;

        int left = 0, right = A.length - 1;
        while (left <= right){
            int mid = (left + right) / 2;
            System.out.println("mid: " + mid + " left:" + left + " right:" + right);
            if (A[mid] < target){
                left = mid + 1;
            } else if (A[mid] > target){
                right = mid - 1;
            } else {
                return mid;
            }
        }
        return left;
    }

    public static void main(String[] args){
        System.out.println(new S60_SearchInsert().searchInsert(new int[]{1,3,5,6,8,9}, 7));
    }
}

package LinkCode.P1_100;

/**
 * Created by 18394 on 2017/1/17.
 */
public class S41_MaxSubArray {
    /**
     * @param nums: A list of integers
     * @return: A integer indicate the sum of max subarray
     */
    public static int maxSubArray(int[] nums) {
        if (nums.length == 1) return nums[0];
        int maxResult = nums[0];
        int mCursum = nums[0];
        int start, end;
        for (int i = 1; i < nums.length; i++) {
            mCursum += nums[i];
            if (mCursum < nums[i]) {
                mCursum = nums[i];
            }
            if (mCursum > maxResult) {
                maxResult = mCursum;
            }
        }
        return maxResult;
    }

    public static void main(String[] args) {
        int[] nums = {-1,-2,-3,-100,-1,-50};
        System.out.println(maxSubArray(nums));
    }
}

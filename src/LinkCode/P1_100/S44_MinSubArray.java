package LinkCode.P1_100;

import java.util.ArrayList;

/**
 * Created by 18394 on 2017/2/14.
 */
public class S44_MinSubArray {
    /**
     * @param nums: a list of integers
     * @return: A integer indicate the sum of minimum subarray
     */
    public static int minSubArray(ArrayList<Integer> nums) {
        int minEnd = nums.get(0);
        int minResult = minEnd;
        for (int i = 1; i < nums.size(); i++){
            minEnd = Math.min(nums.get(i), nums.get(i) + minEnd);
            minResult = Math.min(minEnd, minResult);
        }
        return minResult;
    }

    public static void main(String[] args){
        ArrayList nums = new ArrayList();
        nums.add(1);
        nums.add(-1);
        nums.add(-2);
        nums.add(1);

        System.out.println(minSubArray(nums));
    }
}

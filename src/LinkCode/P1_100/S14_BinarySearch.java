package LinkCode.P1_100;

/**
 * Created by 18394 on 2017/1/9.
 */
public class S14_BinarySearch {
    /**
     * @param nums:   The integer array.
     * @param target: Target to find.
     * @return: The first position of target. Position starts from 0.
     */
    public static int binarySearch(int[] nums, int target) {
        int pre = 0, last = nums.length, mid;
        while (pre <= last) {
            mid = (pre + last) / 2;
            if (nums[mid] == target) {
                if (mid == 0){
                    return mid;
                }
                for (int i = mid - 1; i >= 0; i--) {
                    if (nums[i] != target) {
                        return i + 1;
                    }
                }
            } else if (nums[mid] < target) {
                pre = mid + 1;
            } else if (nums[mid] > target){
                last = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int nums[] = {2,6,8,13,15,17,17,18,19,20};
        System.out.println(binarySearch(nums, 15));
    }
}

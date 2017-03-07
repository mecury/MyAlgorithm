package LinkCode.P1_100;

/**
 * Created by 18394 on 2017/3/7.
 */
public class S52_NextPermutation {
    /**
     * @param nums: an array of integers
     * @return: return nothing (void), do not return anything, modify nums in-place instead
     */
    public int[] nextPermutation(int[] nums) {
        for (int i = nums.length - 1; i >= 0; i--) {
            for (int j = nums.length - 1; j > i; j--) {
                if (nums[j] > nums[i]) {
                    //交换这两个数
                    swap(nums, i, j);
                    reverse(nums, i + 1, nums.length -  1);
                    return nums;
                }
            }
        }
        reverse(nums, 0, nums.length-1);
        return nums;
    }

    public void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    public void reverse(int[] nums, int start, int end){
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] result = new S52_NextPermutation().nextPermutation(new int[]{1, 3, 2, 3});
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }


}

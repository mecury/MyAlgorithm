package LinkCode.P1_100;

/**
 * Created by 18394 on 2017/2/18.
 */
public class S100_RemoveDuplicates {
    /**
     * @param nums: a array of integers
     * @return : return an integer
     */
    public static int removeDuplicates(int[] nums) {
        int length = nums.length;
        int index = 0;

        while(index < length){
            int start = nums[index];
            int number = 0;  //记录一个元素重复的次数
            for (int i = index + 1; i < length; i++){
                if (start == nums[i]){
                    number ++;
                } else {
                    break;
                }
            }
            length = length - number;
            for (int j = index + 1; j < length; j++){
                nums[j] = nums[j + number];
            }
//            System.out.println();
//            for (int i = 0; i < length; i++){
//                System.out.print(nums[i] + " ");
//            }
            index++;
        }

        return index;
    }

    public static void main(String[] args) {
        int[] nums = {-14, -14, -13, -13, -13, -13, -13, -13, -13, -12, -12, -12, -12, -11, -10, -9, -9, -9, -8, -7, -5, -5, -5, -5, -4, -3, -3, -2, -2, -2, -2, -1, -1, -1, -1, -1, 0, 1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 6, 6, 6, 6, 7, 8, 8, 8, 9, 9, 9, 10, 10, 10, 11, 11, 11, 12, 12, 12, 13, 14, 14, 14, 14, 15, 16, 16, 16, 18, 18, 18, 19, 19, 19, 19, 20, 20, 20, 21, 21, 21, 21, 21, 21, 22, 22, 22, 22, 22, 23, 23, 24, 25, 25};
        removeDuplicates(nums);
    }
}

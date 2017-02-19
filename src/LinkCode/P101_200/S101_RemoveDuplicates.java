package LinkCode.P101_200;

/**
 * Created by 18394 on 2017/2/19.
 */
public class S101_RemoveDuplicates {
    /**
     * @param nums: a array of integers
     * @return : return an integer
     */
    public static int removeDuplicates(int[] nums) {
        // write your code here
        int length = nums.length;
        int index = 0;
        while (index < length){
            int start = nums[index];
            int number = 0;
            if (index != length - 1){
                if (start == nums[index + 1]){
                    index ++;
                }
            }
            for (int i = index + 1; i < length; i++){
                if (start == nums[i]){
                    number ++;
                } else {
                    break;
                }
            }
            length = length - number;
            for (int i = index + 1; i < length; i++){
                nums[i] = nums[i + number];
            }
            index++;
        }

        return index;
    }
}

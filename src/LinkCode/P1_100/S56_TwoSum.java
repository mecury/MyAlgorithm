package LinkCode.P1_100;

import java.util.ArrayList;

/**
 * Created by 18394 on 2017/2/22.
 */
public class S56_TwoSum {
    /*
     * @param numbers : An array of Integer
     * @param target : target = numbers[index1] + numbers[index2]
     * @return : [index1 + 1, index2 + 1] (index1 < index2)
     */
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            int temp = target - numbers[i];
            if (!list.contains(temp)){
                list.add(numbers[i]);
            } else {
                result[0] = list.indexOf(temp) + 1;
                result[1] = i + 1;
                break;
            }
        }
        return result;
    }
}

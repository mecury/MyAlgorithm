package LinkCode.P1_100;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by 18394 on 2017/1/17.
 */
public class S46_MajorityNumber {
    /**
     * @param nums: a list of integers
     * @return: find a  majority number
     */
    public static int majorityNumber(ArrayList<Integer> nums) {
        Collections.sort(nums);
        return nums.get(nums.size() / 2);
    }

    public static void main(String[] args){
        ArrayList list = new ArrayList();
        list.add(2);
        list.add(1);
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(1);
        list.add(1);
        System.out.println(majorityNumber(list));
    }
}

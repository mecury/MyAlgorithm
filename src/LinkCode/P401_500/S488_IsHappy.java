package LinkCode.P401_500;

import java.util.ArrayList;

/**
 * Created by 18394 on 2017/1/10.
 */
public class S488_IsHappy {
    /**
     * @param n an integer
     * @return true if this is a happy number or false
     */

    public static boolean isHappy = false;
    public static ArrayList<Integer> list = new ArrayList<>();
    public static boolean isHappy(int n) {
        isHappyRecursion(n);
        return isHappy;
    }



    public static void isHappyRecursion(int n) {

        int valueN = 0;
        while (n != 0) {
            valueN += Math.pow(n % 10, 2);
            n /= 10;
        }
        n = valueN;

        if (n == 1) {
            isHappy = true;
            return;
        }else if (list.contains(n)){
            isHappy = false;
            return;
        }
        list.add(n);
        isHappyRecursion(n);
    }

    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }
}

package LinkCode.P101_200;

import java.util.ArrayList;

/**
 * Created by 18394 on 2017/1/5.
 */
public class S111_ClimbStairs {
    /**
     * @param n: An integer
     * @return: An integer
     * 直接用递归会超时
     */
    public static int climbStairs(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;

        return climbStairs(n - 1) + climbStairs(n - 2);
    }

    public static int climpStairs2(int n){
        if (n == 0) return 0;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        for (int i = 2; i < n; i++){
            list.add(list.get(i - 1) + list.get(i - 2));
        }
        return list.get(n - 1);
    }

    public static void main(String[] args){
        System.out.println(climbStairs(4));
    }
}

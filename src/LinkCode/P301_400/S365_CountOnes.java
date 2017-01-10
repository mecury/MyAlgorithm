package LinkCode.P301_400;

/**
 * Created by 18394 on 2017/1/6.
 * 计算在一个 32 位的整数的二进制表式中有多少个 1.
 */
public class S365_CountOnes {
    /**
     * @param num: an integer
     * @return: an integer, the number of ones in num
     */
    public static int countOnes(int num) {
        if (num == 0) return 0;
        int value = num;
        num = num < 0 ? -num - 1 : num;
        int n = 0;
        int result = 0;
        while (Math.pow(2, n) <= num) {
            n++;
        }
        //拿到了刚好大于num的n值
        int temp = -1;
        while (temp != 0 && n >= 0) {
            temp = (int) (num - Math.pow(2, n));
            if (temp >= 0) {
                num = temp;
                result++;
            }
            n--;
        }
        if (value < 0) result = 32 - result;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(countOnes(-178));
    }

}

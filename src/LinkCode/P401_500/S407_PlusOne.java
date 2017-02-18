package LinkCode.P401_500;

/**
 * Created by 18394 on 2017/2/16.
 */
public class S407_PlusOne {
    /**
     * @param digits a number represented as an array of digits
     * @return the result
     */
    public static int[] plusOne(int[] digits) {
        int length = digits.length;
        long number = 0;
        int n = length;
        for (int i = 0; i < n; i++) {
            number += digits[i] * Math.pow(10, length - 1);
            length --;
        }
        number++;

        //用字符串处理不被接受，
//        String str = number + "";
//        String[] strings = str.split("");
//        digits = new int[strings.length];
//        for (int i = 0; i < strings.length; i++) {
//            digits[i] = Integer.parseInt(strings[i]);
//        }

        return digits;
    }

    public static int[] plusTwo(int[] digits){
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--){
            if (digits[i] < 9){
                digits[i] += 1;
                return digits;
            }
            digits[i] = 0;
        }
        int[] result = new int[n + 1];
        result[0] = 1;
        return result;
    }

    public static void main(String[] args) {
        int[] digits = {0};
        plusOne(digits);
    }
}

package LinkCode.P401_500;

/**
 * Created by 18394 on 2017/2/21.
 */
public class S413_ReverseInteger {
    /**
     * @param n the integer to be reversed
     * @return the reversed integer
     */
    public int reverseInteger(int n) {
        int result = 0;
        if (n >= 0){
            while (n != 0){
                result = result * 10 +  n % 10;
                while (result > Integer.MAX_VALUE / 10){
                    return 0;
                }
                n = n / 10;
            }
            return result;
        } else {
            result = reverseInteger(-n);
            return -result;
        }
    }
}

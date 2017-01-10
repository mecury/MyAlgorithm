package LinkCode.P401_500;

/**
 * Created by 18394 on 2017/1/10.
 */
public class S420_CountAndSay {
    /**
     * @param n the nth
     * @return the nth sequence
     */
    public static String countAndSay(int n) {
        String oldStr = "1";
        while (--n > 0) {
            char[] oldChar = oldStr.toCharArray();
            StringBuilder sb = new StringBuilder();
            int count = 1;
            for (int i = 1; i < oldStr.length(); i++) {
                if (oldChar[i] == oldChar[i - 1]) {
                    count++;
                }else{
                    sb.append(count).append(oldChar[i-1]);
                    count = 1;
                }
            }
            oldStr = String.valueOf(sb.append(count).append(oldStr.charAt(oldStr.length() - 1)));
        }
        return oldStr;
    }

    public static void main(String[] args){
        System.out.println(countAndSay(6));
    }
}

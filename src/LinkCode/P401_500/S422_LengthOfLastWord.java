package LinkCode.P401_500;

/**
 * Created by 18394 on 2017/1/17.
 */
public class S422_LengthOfLastWord {
    /**
     * @param s A string
     * @return the length of last word
     */
    public static int lengthOfLastWord(String s) {
        if (s == "") return 0;
        String[] strings = s.split(" ");
        return strings[strings.length - 1].length();
    }

    public static void main(String[] args){
        System.out.println(lengthOfLastWord("a"));
    }
}

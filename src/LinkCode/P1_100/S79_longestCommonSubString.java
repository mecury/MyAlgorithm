package LinkCode.P1_100;

/**
 * Created by 18394 on 2017/1/17.
 */
public class S79_longestCommonSubString {
    /**
     * @param A, B: Two string.
     * @return: the length of the longest common substring.
     */
    public static int longestCommonSubstring(String A, String B) {
        if (A == null || B == null || A.length() == 0 || B.length() == 0) return 0;

        int lenA = A.length();
        int lenB = B.length();
        int longest = 0;
        int C[][] = new int[lenA + 1][lenB + 1];

        for (int i = 1; i <= lenA; i++) {
            for (int j = 1; j <= lenB; j++) {
                char charA = A.charAt(i-1);
                char charB = B.charAt(j-1);
                if (charA == charB) {
                    C[i][j] = C[i - 1][j - 1] + 1;
                } else {
                    C[i][j] = 0;
                }
                longest = Math.max(longest, C[i][j]);
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        System.out.println(longestCommonSubstring("abc", "abc"));
    }
}

package LinkCode.P101_200;

/**
 * Created by 18394 on 2017/1/11.
 */
public class S128_HashCode {
    /**
     * @param key:       A String you should hash
     * @param HASH_SIZE: An integer
     * @return an integer
     */
    public static int hashCode(char[] key, int HASH_SIZE) {
        int len = key.length;
        long hashcode = 0;
        long base = 1;
        for (int i = len - 1; i >= 0; i--) {
            hashcode = hashcode + Integer.valueOf(key[i]) * base % HASH_SIZE;
            hashcode = hashcode % HASH_SIZE;
            base = base * 33 % HASH_SIZE;
        }
        return (int) hashcode;
    }

    public static void main(String[] args) {
        System.out.println(" " + hashCode(new char[]{'a', 'b', 'c', 'd'}, 100));
        System.out.println(" " + hashCode(new char[]{'u', 'b', 'u', 'n', 't', 'u'}, 1007));
    }
}

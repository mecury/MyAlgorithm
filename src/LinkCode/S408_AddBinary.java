package LinkCode;

import java.util.Scanner;

/**
 * Created by 18394 on 2017/1/2.
 * 给定两个二进制字符串，返回他们的和（用二进制表示）
 */
public class S408_AddBinary {
    /**
     * @param a a number
     * @param b a number
     * @return the result
     */
    public static String addBinary(String a, String b) {
        if (a == null && b == null) return null;
        if (a.equals("0") && b.equals("0")) return "0";
        String targetA, targetB;
        //运算由小位开始，所以翻转一下字符串
        if (a.length() >= b.length()) {
            targetA = new StringBuffer(a).reverse().toString();
            targetB = new StringBuffer(b).reverse().toString();
        } else {
            targetA = new StringBuffer(b).reverse().toString();
            targetB = new StringBuffer(a).reverse().toString();
        }

        int currentA, currentB, temp = 0;
        String result = "";
        for (int i = 0; i < targetA.length(); i++) {
            currentA = Integer.parseInt(targetA.split("")[i]);
            if (targetB.length() > i) {
                currentB = Integer.parseInt(targetB.split("")[i]);
            } else {
                //这是只有targetA中有数据，而targetB已经全部相加完毕
                if (temp == 0) {
                    result += targetA.split("")[i];
                    temp = 0;
                } else {
                    int index = Integer.parseInt(targetA.split("")[i]);
                    //最后一个temp来决定结果，这里是for循环最后执行的代码
                    if (index + temp == 1) {
                        result += "1";
                        temp = 0;
                    } else if (index + temp == 2) {
                        result += "0";
                        temp = 1;
                    }
                    if (i + 1 == targetA.length() && temp == 1) {
                        result += "1";
                        temp = 0;
                    }
                }
                continue;
            }
            //根据temp来决定result的下一个
            if (currentA + currentB == 0) {
                if (temp == 0) {
                    result += "0";
                } else {
                    result += "1";
                }
                temp = 0;
            } else if (currentA + currentB == 1) {
                if (temp == 0) {
                    result += "1";
                    temp = 0;
                } else {
                    result += "0";
                    temp = 1;
                }
            } else if (currentA + currentB == 2) {
                if (temp == 0) {
                    result += "0";
                    temp = 1;
                } else {
                    result += "1";
                    temp = 0;
                }
            }
        }
        return new StringBuffer(result).reverse().toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            System.out.println(addBinary2(in.next(), in.next()));
        }
    }

    public static String addBinary2(String a, String b) {
        String result = "";
        int aLen = a.length() - 1;
        int bLen = b.length() - 1;
        int sum = 0;
        while (aLen >= 0 || bLen >= 0) {
            if (aLen >= 0) {
                sum += Integer.parseInt(a.substring(aLen, aLen + 1));
                aLen--;
            }
            if (bLen >= 0) {
                sum += Integer.parseInt(b.substring(bLen, bLen + 1));
                bLen--;
            }
            if (sum == 3) {
                result = "1" + result;
                sum = 1;
            } else if (sum == 2) {
                result = "0" + result;
                sum = 1;
            } else if (sum == 0 || sum == 1) {
                result = sum + "" + result;
                sum = 0;
            }
        }
        if (sum == 1){
            result = "1" + result;
        }
        return result;
    }
}

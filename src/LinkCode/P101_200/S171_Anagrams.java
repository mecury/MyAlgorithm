package LinkCode.P101_200;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by 18394 on 2017/2/17.
 */
public class S171_Anagrams {
    /**
     * @param strs: A list of strings
     * @return: A list of strings
     */
    public static List<String> anagrams(String[] strs) {
        ArrayList<String> result = new ArrayList<>();
        String firstStr = "", secondStr = "";
        if (strs == null) return result;
        //无法判断strs中含有 ""
        for (int i = 0; i < strs.length - 1; i++){
            firstStr = strs[i];
            for (int j = i + 1; j < strs.length; j++){
                secondStr = strs[j];
                if (isEquals(firstStr, secondStr)){
                    break;
                }
            }
        }


        for (int i = 0; i < strs.length; i++){
            if (isEquals(firstStr, strs[i])){
                result.add(strs[i]);
                System.out.print(strs[i] + "-");
            }
        }
        return result;
    }

    public static boolean isEquals(String firstStr, String secondStr){
        int firCount = firstStr.length();
        int secCount = secondStr.length();
        if (firCount != secCount){
            return false;
        }

        String[] secStrs = secondStr.split("");

        for (int i = 0; i < secCount; i++){
            if (firstStr.contains(secStrs[i])){
                continue;
            } else {
              return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        String[] strs = {"a","b","c"};
        for (int i = 0; i < strs.length; ++i){
            System.out.print(strs[i]);
        }
    }

    public static List<String> anagrams2(String[] strs) {
        HashMap<String, ArrayList<String>> hashMap = new HashMap<>();
        for (String str : strs){
            String key = generalLabel(str);
            ArrayList<String> res = hashMap.get(key);
            if (res == null){
                res = new ArrayList<>();
                hashMap.put(key, res);
            }
            res.add(str);
        }
        ArrayList<String> result = new ArrayList<>();
        for (ArrayList<String> anagram : hashMap.values()){
            if (anagram.size() > 1) {
                result.addAll(anagram);
            }
        }
        return result;
    }

    public static String generalLabel(String str){
        int[] hash = new int[26];
        for (int i = 0; i < str.length(); i++){
            int index = (str.charAt(i) - 'a');
            hash[index]++;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0;i < 26; ++i){
            if (hash[i] == 0) continue;
            char c = (char) ('a' + i);
            stringBuilder.append(c);
            stringBuilder.append(hash[i]);
        }
        return stringBuilder.toString();
    }
}

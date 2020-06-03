package trial;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * self explanatory - longest substring in a string; no repeated chars allowed
 */
public class LongestSubStrWORepeatChar {
    public static void main(String[] asd) {
        System.out.println(linearMaxSubstr("ABDEFGABEFDHKSSABCDEFGHIJ"));
        System.out.println(linearMaxSubstr("aABCDE"));
        System.out.println(linearMaxSubstr("1,234"));
        System.out.println(linearMaxSubstr("1.234"));
        System.out.println(linearMaxSubstr("1234"));
        System.out.println(linearMaxSubstr("1234.000"));
        System.out.println(linearMaxSubstr("\t1234.0" + "إيو"));
        //int i = (Integer)null;
        var k = 12;
        var j = "hello";
        Integer x = null;
        Object y = null;
        if (x == y){
            System.out.println("damn");
        }

    }

    //O(n^2)
    private static String longestSubstrNoRepeatChar(String original) {
        String subStr = "";
        if (original.isBlank()) {
            return "";
        }
        String tempSubStr = "";
        for (int i = 0; i < original.length(); i++) {
            tempSubStr = tempSubStr + original.charAt(i);
            for (int j = i + 1; j < original.length(); j++) {
                if (tempSubStr.indexOf(original.charAt(j)) != -1) {
                    //already exists
                    tempSubStr = "";
                    break;
                } else {
                    tempSubStr = tempSubStr + original.charAt(j);
                }
                if (subStr.length() < tempSubStr.length()) {
                    subStr = tempSubStr;
                }
            }
        }
        return subStr;
    }

    //O(n) not exactly, O(n2) still
    private static String linearMaxSubstrNoReps(String original) {
        String subStr = "";
        if (original.isBlank()) {
            return "";
        }
        int initIndex = 0;
        String tempSubStr = "";
        for (int i = 0; i < original.length(); i++) {
            tempSubStr = tempSubStr + original.charAt(i);
            initIndex = i;
            if (tempSubStr.indexOf(original.charAt(i)) != -1) {
                //already exists
                i = initIndex;
                tempSubStr = "";
                break;
            } else {
                tempSubStr = tempSubStr + original.charAt(i);
            }
            if (subStr.length() < tempSubStr.length()) {
                subStr = tempSubStr;
            }
        }
        return subStr;
    }

    //this is satisfactory, ofcourse after three days of mulling over
    //03/02/20
    private static String linearMaxSubstr(String s){
        if (s.isBlank()) {
            return "";
        }
        int initIndex = 0;
        int endIndex = 0;
        int maxInit = 0;
        int maxEnd = 0;
        Map<Character, Integer> setVisited = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            endIndex = i;
            if(setVisited.containsKey(s.charAt(i))){
                int preIndexCurrChar = setVisited.get(s.charAt(i));
                if(preIndexCurrChar < endIndex && preIndexCurrChar >= initIndex){
                    initIndex = preIndexCurrChar + 1;
                }
            }
            setVisited.put(s.charAt(i),i);
            if(endIndex - initIndex >= maxEnd - maxInit){
                maxEnd = endIndex;
                maxInit = initIndex;
            }

        }
        return s.substring(maxInit, maxEnd + 1);
    }

}

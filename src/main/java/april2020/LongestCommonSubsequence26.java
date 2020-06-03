package april2020;

import java.util.LinkedHashMap;

/**
 * Longest Common Subsequence
 * Given two strings text1 and text2, return the length of their longest common subsequence.
 *
 * A subsequence of a string is a new string generated from the original string with some characters(can be none) deleted without changing the relative order of the remaining characters. (eg, "ace" is a subsequence of "abcde" while "aec" is not). A common subsequence of two strings is a subsequence that is common to both strings.
 *
 *
 *
 * If there is no common subsequence, return 0.
 *
 *
 *
 * Example 1:
 *
 * Input: text1 = "abcde", text2 = "ace"
 * Output: 3
 * Explanation: The longest common subsequence is "ace" and its length is 3.
 * Example 2:
 *
 * Input: text1 = "abc", text2 = "abc"
 * Output: 3
 * Explanation: The longest common subsequence is "abc" and its length is 3.
 * Example 3:
 *
 * Input: text1 = "abc", text2 = "def"
 * Output: 0
 * Explanation: There is no such common subsequence, so the result is 0.
 *
 *
 * Constraints:
 *
 * 1 <= text1.length <= 1000
 * 1 <= text2.length <= 1000
 * The input strings consist of lowercase English characters only.
 */
public class LongestCommonSubsequence26 {
    public static void main(String[] sdfdf){
        System.out.println(new LongestCommonSubsequence26().longestCommonSubsequence("abcde", "ace"));
    }
    public int longestCommonSubsequence(String text1, String text2) {
        LinkedHashMap<Character, Integer> text1Map = new LinkedHashMap<>();
        LinkedHashMap<Character, Integer> text2Map = new LinkedHashMap<>();
        fillMap(text1, text1Map);
        fillMap(text2, text2Map);
        int i = 0;
        int lcs = 0;
        while(i < text1Map.size()){

        }
        return 0;
    }

    private void fillMap(String text1, LinkedHashMap<Character, Integer> text1Map) {
        for(Character c : text1.toCharArray()){
            if(text1Map.containsKey(c)){
                int val = text1Map.get(c);
                text1Map.put(c,++val);
            }
            else{
                text1Map.put(c, 1);
            }
        }
    }

}

package april2020;


/**
 * 3. Longest Substring Without Repeating Characters
 * Example 1:
 *
 * Input: "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 * Example 2:
 *
 * Input: "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 * Example 3:
 *
 * Input: "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 *              Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */
public class LongestSubstrWORepeatChar6 {

    public static void main(String[] asjkfdnsf){
        System.out.println(longestSubstr("dvdf"));
    }

    static String longestSubstr(String str){
        String longestSubstr = "", subStr = "";
        for(char ch : str.toCharArray()){
            if(subStr.indexOf(ch) >= 0){
                subStr = "" + ch;
            }
            else{
                subStr = subStr + ch;
            }
            longestSubstr = subStr.length() > longestSubstr.length() ? subStr : longestSubstr;
        }
        return longestSubstr;
    }

}

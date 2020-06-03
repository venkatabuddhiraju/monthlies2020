package may2020;

/**
 * Permutation in String
 * Given two strings s1 and s2, write a function to return true if s2 contains the permutation of s1. In other words, one of the first string's permutations is the substring of the second string.
 *
 *
 *
 * Example 1:
 *
 * Input: s1 = "ab" s2 = "eidbaooo"
 * Output: True
 * Explanation: s2 contains one permutation of s1 ("ba").
 * Example 2:
 *
 * Input:s1= "ab" s2 = "eidboaoo"
 * Output: False
 *
 *
 * Note:
 *
 * The input strings only contain lower case letters.
 * The length of both given strings is in range [1, 10,000].
 */
public class PermutationsInString18 {


    //"hello"
    //"ooolleoooleh"
    public static void main(String[] asdsfsfs){
        System.out.println(new PermutationsInString18().checkInclusion("helo", "ooolleoooleh"));
    }

    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()){
            return false;
        }
        if(s1.length() == s2.length()){
            return compareFreqs(s1, s2);
        }

        for (int i=0; i<s2.length()-s1.length()+1; i++){
            String subString = s2.substring(i, i+s1.length());
            if(compareFreqs(s1, subString)){
                return true;
            }
        }
        return false;
    }

    private boolean compareFreqs(String s1, String s2){
        int[] counts = new int[26];
        for(char c : s1.toCharArray()){
            counts[c-'a']++;
        }
        for(char c : s2.toCharArray()){
            counts[c-'a']--;
        }

        for(int i : counts){
            if(i != 0){
                return false;
            }
        }
        return true;
    }

}

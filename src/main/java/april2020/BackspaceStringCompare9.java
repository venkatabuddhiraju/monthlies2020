package april2020;

/**
 * Given two strings S and T, return if they are equal when both are typed into empty text editors. # means a backspace character.
 *
 * Example 1:
 *
 * Input: S = "ab#c", T = "ad#c"
 * Output: true
 * Explanation: Both S and T become "ac".
 * Example 2:
 *
 * Input: S = "ab##", T = "c#d#"
 * Output: true
 * Explanation: Both S and T become "".
 * Example 3:
 *
 * Input: S = "a##c", T = "#a#c"
 * Output: true
 * Explanation: Both S and T become "c".
 * Example 4:
 *
 * Input: S = "a#c", T = "b"
 * Output: false
 * Explanation: S becomes "c" while T becomes "b".
 * Note:
 *
 * 1 <= S.length <= 200
 * 1 <= T.length <= 200
 * S and T only contain lowercase letters and '#' characters.
 * Follow up:
 *
 * Can you solve it in O(N) time and O(1) space?
 */
public class BackspaceStringCompare9 {

    public static void main(String []sfdsf){
        System.out.println(backspaceCompare("ab##", "c#d#" ));
    }

    public static boolean backspaceCompare(String S, String T) {
        String finalS =  getFinalString(S);
        String finalT = getFinalString(T);
        System.out.println(finalS);
        System.out.println(finalT);
        return finalS.equalsIgnoreCase(finalT);
    }

    private static String getFinalString(String S) {
        StringBuilder sB = new StringBuilder();
        for(char c : S.toCharArray()){
            if(c == '#'){
                if(sB.length() == 0){
                    continue;
                }
                sB = sB.deleteCharAt(sB.length() - 1);
            }
            else sB.append(c);
        }
        return sB.toString();
    }

}

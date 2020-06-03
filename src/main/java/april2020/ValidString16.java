package april2020;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 *   Valid Parenthesis String
 * Given a string containing only three types of characters: '(', ')' and '*', write a function to check whether this string is valid. We define the validity of a string by these rules:
 *
 * Any left parenthesis '(' must have a corresponding right parenthesis ')'.
 * Any right parenthesis ')' must have a corresponding left parenthesis '('.
 * Left parenthesis '(' must go before the corresponding right parenthesis ')'.
 * '*' could be treated as a single right parenthesis ')' or a single left parenthesis '(' or an empty string.
 * An empty string is also valid.
 * Example 1:
 * Input: "()"
 * Output: True
 * Example 2:
 * Input: "(*)"
 * Output: True
 * Example 3:
 * Input: "(*))"
 * Output: True
 * Note:
 * The string size will be in the range [1, 100].
 */
public class ValidString16 {

    public static void main(String[] asdsds){
        System.out.println(new ValidString16().checkValidString("(()*)(()((())()))(*)((((())*())))()(((()((()(*()))"));

    }

    public boolean checkValidString(String s) {
        int bracketCount = 0, starCount = 0;
        for(Character c : s.toCharArray()){
            if(c == '('){
                bracketCount++;
            }
            else if(c == ')'){
                if(bracketCount > 0){
                    bracketCount--;
                }
                else if(starCount > 0){
                    starCount--;
                }
                else return false;
            }
            else if(c == '*'){
                starCount++;
            }
        }

        if(bracketCount > starCount){
            return false;
        }

        return true;
    }


}

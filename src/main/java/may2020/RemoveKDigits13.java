package may2020;

/**
 * Remove K Digits
 * Given a non-negative integer num represented as a string, remove k digits from the number so that the new number is the smallest possible.
 *
 * Note:
 * The length of num is less than 10002 and will be ≥ k.
 * The given num does not contain any leading zero.
 * Example 1:
 *
 * Input: num = "1432219", k = 3
 * Output: "1219"
 * Explanation: Remove the three digits 4, 3, and 2 to form the new number 1219 which is the smallest.
 * Example 2:
 *
 * Input: num = "10200", k = 1
 * Output: "200"
 * Explanation: Remove the leading 1 and the number is 200. Note that the output must not contain leading zeroes.
 * Example 3:
 *
 * Input: num = "10", k = 2
 * Output: "0"
 * Explanation: Remove all the digits from the number and it is left with nothing which is 0.
 */
public class RemoveKDigits13 {

    public static void main(String[] args){
        System.out.println(new RemoveKDigits13().removeKdigits("112", 1));
    }

    public String removeKdigits(String num, int k) {
        if(num.length() == k){
            return "0";
        }
        StringBuilder bldr = new StringBuilder(num);
        int count=0, index = 1;
        char prevChar;
        while(count < k && index < bldr.length()){
            prevChar = bldr.charAt(index - 1);
            char currChar = bldr.charAt(index);
            if(currChar < prevChar){
                bldr.deleteCharAt(index - 1);
                count++;
            }
            else{
                if(index == bldr.length() - 1){

                    break;
                }

                index++;
            }
        }
        return bldr.toString().replaceFirst("^0+(?!$)", "");
    }

}

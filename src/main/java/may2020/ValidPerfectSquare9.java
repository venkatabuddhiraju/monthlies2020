package may2020;

/**
 * Valid Perfect Square
 * Given a positive integer num, write a function which returns True if num is a perfect square else False.
 *
 * Note: Do not use any built-in library function such as sqrt.
 *
 * Example 1:
 *
 * Input: 16
 * Output: true
 * Example 2:
 *
 * Input: 14
 * Output: false
 */

public class ValidPerfectSquare9 {
    public boolean isPerfectSquare(int num) {
        if(num < 2){
            return true;
        }
        long low = 1, high = num/2;
        while(low  <= high){
            long mid = low + (high - low)/2 ;
            if(mid*mid < num){
                low = mid + 1;
            }
            else if(mid*mid == num){
                return true;
            }
            else{
                high = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] asdsds){
        System.out.println(new ValidPerfectSquare9().isPerfectSquare(808201));
    }

}

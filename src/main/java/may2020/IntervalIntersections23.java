package may2020;

/**
 * Interval List Intersections
 * Given two lists of closed intervals, each list of intervals is pairwise disjoint and in sorted order.
 *
 * Return the intersection of these two interval lists.
 *
 * (Formally, a closed interval [a, b] (with a <= b) denotes the set of real numbers x with a <= x <= b.  The intersection of two closed intervals is a set of real numbers that is either empty, or can be represented as a closed interval.  For example, the intersection of [1, 3] and [2, 4] is [2, 3].)
 *
 *
 *
 * Example 1:
 *
 *
 *
 * Input: A = [[0,2],[5,10],[13,23],[24,25]], B = [[1,5],[8,12],[15,24],[25,26]]
 * Output: [[1,2],[5,5],[8,10],[15,23],[24,24],[25,25]]
 * Reminder: The inputs and the desired output are lists of Interval objects, and not arrays or lists.
 *
 *
 * Note:
 *
 * 0 <= A.length < 1000
 * 0 <= B.length < 1000
 * 0 <= A[i].start, A[i].end, B[i].start, B[i].end < 10^9
 * NOTE: input types have been changed on April 15, 2019. Please reset to default code definition to get new method signature.
 */
public class IntervalIntersections23 {

    public static void main(String[] asdsds){

        int A[][] = {{0,2},{5,10},{13,23},{24,25}}, B[][] = {{1,5},{8,12},{15,24},{25,26}};
        int c[][] = new IntervalIntersections23().intervalIntersection(A, B);
        for(int i = 0; i < c.length; i++){
            System.out.println();
            for(int j = 0; j < c[0].length; j++){
                System.out.print(c[i][j]);
            }
        }
    }

    public int[][] intervalIntersection(int[][] A, int[][] B) {
        int c[][] = new int[Math.min(A.length, B.length)][];
        int k = 0;
        for(int i = 0, j = 0; i < A.length && j < B.length;){
            if(A[i][1] >= B[j][0]){
                if(A[i][1] <= B[j][1]){
                    c[k][0] = B[j][0];
                    c[k][1] = A[i][1];
                    k++;
                    i++;
                }
            }
        }
        return new int[3][4];
    }

}

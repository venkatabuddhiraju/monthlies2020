package april2020;

import java.util.ArrayList;
import java.util.List;

/**
 * (This problem is an interactive problem.)
 * <p>
 * A binary matrix means that all elements are 0 or 1. For each individual row of the matrix, this row is sorted in non-decreasing order.
 * <p>
 * Given a row-sorted binary matrix binaryMatrix, return leftmost column index(0-indexed) with at least a 1 in it. If such index doesn't exist, return -1.
 * <p>
 * You can't access the Binary Matrix directly.  You may only access the matrix using a BinaryMatrix interface:
 * <p>
 * BinaryMatrix.get(x, y) returns the element of the matrix at index (x, y) (0-indexed).
 * BinaryMatrix.dimensions() returns a list of 2 elements [n, m], which means the matrix is n * m.
 * Submissions making more than 1000 calls to BinaryMatrix.get will be judged Wrong Answer.  Also, any solutions that attempt to circumvent the judge will result in disqualification.
 * <p>
 * For custom testing purposes you're given the binary matrix mat as input in the following four examples. You will not have access the binary matrix directly.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * <p>
 * <p>
 * Input: mat = [[0,0],[1,1]]
 * Output: 0
 * Example 2:
 * <p>
 * <p>
 * <p>
 * Input: mat = [[0,0],[0,1]]
 * Output: 1
 * Example 3:
 * <p>
 * <p>
 * <p>
 * Input: mat = [[0,0],[0,0]]
 * Output: -1
 * Example 4:
 * <p>
 * <p>
 * <p>
 * Input: mat = [[0,0,0,1],[0,0,1,1],[0,1,1,1]]
 * Output: 1
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= mat.length, mat[i].length <= 100
 * mat[i][j] is either 0 or 1.
 * mat[i] is sorted in a non-decreasing way.
 */
public class LeftMostCol1_21 {

    static class BinaryMatrix {

        int mat[][] = {{0, 0}, {1, 1}};
        int count = 0;

        public int get(int x, int y) {
            count++;
            if (count > 1000) {
                throw new RuntimeException();
            }
            return mat[x][y];
        }

        public List<Integer> dimensions() {
            List<Integer> dim = new ArrayList<>();
            dim.add(2);
            dim.add(2);
            return dim;
        }
    }

    public static void main(String[] asdsds){
        BinaryMatrix bm = new BinaryMatrix();
        System.out.println(leftMostColumnWithOne(bm));
    }

    public static int leftMostColumnWithOne(BinaryMatrix binaryMatrix) {
        int leftMostCol = Integer.MAX_VALUE;
        for(int row=0; row<binaryMatrix.dimensions().get(0); row++){
            int l=0,r= binaryMatrix.dimensions().get(1) - 1;
            while(l<=r){
                int mid = (l+r)/2;
                if(binaryMatrix.get(row, mid) == 1){
                    leftMostCol = Math.min(leftMostCol, mid);
                    r = mid - 1;
                }
                else{
                    l = mid + 1;
                }
            }
        }
        if(leftMostCol == Integer.MAX_VALUE){
            leftMostCol = -1;
        }
        return leftMostCol;
    }
}



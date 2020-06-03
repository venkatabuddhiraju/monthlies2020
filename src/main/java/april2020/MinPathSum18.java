package april2020;

/**
 * Given a m x n grid filled with non-negative numbers, find a path from top left to bottom right which minimizes the sum of all numbers along its path.
 *
 * Note: You can only move either down or right at any point in time.
 *
 * Example:
 *
 * Input:
 * [
 *   [1,3,1],
 *   [1,5,1],
 *   [4,2,1]
 * ]
 * Output: 7
 * Explanation: Because the path 1→3→1→1→1 minimizes the sum.
 */
public class MinPathSum18 {

    public static void main(String[] sfsdf){
        int[][] grid = {{1,3,1},{1,5,1},{4,2,1}};
        System.out.println(new MinPathSum18().minPathSum(grid));
    }

    public int minPathSum(int[][] grid) {
        int minPathSum = 0;
        minPathSum = getMinSum(0,0,grid,0);
        return minPathSum;
    }

    int getMinSum(int i, int j, int[][] grid, int sum){
        if(i == grid.length -1  && j == grid[i].length -1){
            return sum + grid[i][j];
        }

        if(i < grid.length - 1){
            getMinSum(i + 1, j, grid, sum + grid[i][j]);
        }

        if(j < grid[i].length - 1){
            getMinSum(i, j + 1, grid, sum + grid[i][j]);
        }
        return -1;
    }

}

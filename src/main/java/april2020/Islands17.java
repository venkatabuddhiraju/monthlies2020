package april2020;

/**
 *   Number of Islands
 * Given a 2d grid map of '1's (land) and '0's (water), count the number of islands. An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.
 *
 * Example 1:
 *
 * Input:
 * 11110
 * 11010
 * 11000
 * 00000
 *
 * Output: 1
 * Example 2:
 *
 * Input:
 * 11000
 * 11000
 * 00100
 * 00011
 *
 * Output: 3
 */
public class Islands17 {

    public static void main(String []asfdlghjfd){
        char[][] grid = {{'1','1','0','0','0'},{'1','1','0','0','0'},{'0','0','1','0','0'},{'0','0','0','0','0'}};
        System.out.println(new Islands17().numIslands(grid));
    }

    public int numIslands(char[][] grid) {
        int numIslands = 0;
        for(int i = 0; i<grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                if(grid[i][j] == '1' && isIsland(i, j, grid)){
                    numIslands++;
                }
            }
        }
        return numIslands;
    }

    private boolean isIsland(int i, int j, char[][] grid){
        if(i > 0){
            if(grid[i-1][j] != '0'){
                return false;
            }
        }
        if(i < grid.length - 1){
            if(grid[i+1][j] != '0'){
                return false;
            }
        }
        if(j > 0){
            if(grid[i][j - 1] != '0'){
                return false;
            }
        }
        if(j < grid[i].length - 1){
            if(grid[i][j + 1] != '0'){
                return false;
            }
        }
        return true;
    }

}

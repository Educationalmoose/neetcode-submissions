class Solution {
    int[] dRows = {-1, 0, 1, 0};
    int[] dCols = {0, 1, 0, -1};

    public int numIslands(char[][] grid) {
        int islands = 0;

        for (int r = 0; r < grid.length; r++) {
            for(int c = 0; c < grid[0].length; c++) {
                if (grid[r][c] == '1') {
                    islands++;
                    dfs(r, c, grid);
                }
            }
        }
        return islands;
    }

    void dfs(int r, int c, char[][] grid) {
        grid[r][c] = '0';
        
        for (int i = 0; i < 4; i++) {
            int nextRow = r + dRows[i];
            int nextCol = c + dCols[i];
            
            if (nextRow >= 0 && nextRow < grid.length && 
                nextCol >= 0 && nextCol < grid[0].length && 
                grid[nextRow][nextCol] == '1') {
                
                dfs(nextRow, nextCol, grid);
            }
        }
    }
}

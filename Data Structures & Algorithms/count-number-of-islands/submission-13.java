class Solution {
    int[] dRows = {-1,1,-0,0};
    int[] dCols = {0,0,-1,1};
    public int numIslands(char[][] grid) {
        int islands = 0;
        for (int r=0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                if (grid[r][c] == '1') {
                    islands++;

                    dfs(r,c,grid);
                }
            }
        }
        return islands;
    }

    void dfs(int r, int c, char[][] grid) {
        if (r<0 || c < 0 || r >= grid.length || c >= grid[0].length || grid[r][c] == '0')
            return;
        grid[r][c] = '0';

        for (int k = 0; k < dRows.length; k++) {
            dfs(r + dRows[k], c +dCols[k], grid);
        }
    }
}

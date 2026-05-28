class Solution {
    int[] dRows = {-1, 0, 1, 0};
    int[] dCols = {0, 1, 0, -1};

    public int numIslands(char[][] grid) {
        int islands = 0;

        for (int r = 0; r < grid.length; r++) {
            for(int c = 0; c < grid[0].length; c++) {
                if (grid[r][c] == '1') {
                    islands++;
                    dfs(c, r, grid);
                }
            }
        }
        return islands;
    }

    void dfs(int c, int r, char[][] grid) {
        if (c < 0 || r < 0 || c >= grid[0].length || r >= grid.length || grid[r][c] == '0') {
            return;
        }
        grid[r][c] = '0';
        for (int i = 0; i < 4; i++) {
            dfs(c + dRows[i], r + dCols[i], grid);
        }
    }
}

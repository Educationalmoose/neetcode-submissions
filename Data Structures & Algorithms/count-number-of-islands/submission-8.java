class Solution {
    int[] dRows = {-1, 1, 0, 0};
    int[] dCols = {0, 0, -1, 1};

    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0)
            return 0;

        int islands = 0;

        for (int rows = 0; rows < grid.length; rows++) {
            for (int cols = 0; cols < grid[0].length; cols++) {
                if (grid[rows][cols] == '1') {
                    islands++;
                    dfs(rows, cols, grid);
                }
            }
        }
        return islands;
    }

    void dfs(int rows, int cols, char[][] grid) {
        if (rows < 0 || cols < 0 || rows >= grid.length || cols >= grid[0].length || grid[rows][cols] == '0')
            return;
        grid[rows][cols] = '0';
        for (int i = 0; i < dRows.length; i++) {
            dfs(rows + dRows[i], cols + dCols[i], grid);
        }
    }
}

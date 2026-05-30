class Solution {
    int[] dRows = {-1,1,0,0};
    int[] dCols = {0,0,-1,1};
    int maxArea = 0;
    int area = 0;

    public int maxAreaOfIsland(int[][] grid) {
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                if (grid[r][c] == 1) {
                    area = 0;
                    dfs(r,c,grid);
                    if (area > maxArea)
                        maxArea = area;
                }
            }
        }
        return maxArea;
    }

    void dfs(int r, int c, int[][] grid) {
        if (r < 0 || c < 0 || r >= grid.length || c >= grid[0].length || grid[r][c] == 0) {
            return;
        }
        area += 1;
        grid[r][c] = 0;
        for (int k = 0; k < dRows.length; k++) {
            dfs(r + dRows[k], c + dCols[k], grid);
        }
    }
}

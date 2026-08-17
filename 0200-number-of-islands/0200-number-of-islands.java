import java.util.*;

class Solution {
    public int numIslands(char[][] grid) {
        int isLand = 0;
        int m = grid.length;
        int n = grid[0].length;

        // Creating 2D visited boolean arraylist
        ArrayList<ArrayList<Boolean>> vis = new ArrayList<>();

        for(int i=0; i<m; i++){
            ArrayList<Boolean> row = new ArrayList<>();

            for(int j=0; j<n; j++){
                row.add(false);
            }

            vis.add(row);
        }

        // Calling dfs && counting how many Island is.
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j] == '1' && !vis.get(i).get(j)){
                    dfs(i, j, vis, grid, m, n);
                    isLand++;
                }
            }
        }
        return isLand;
    }


    public static void dfs(int i, int j, ArrayList<ArrayList<Boolean>> vis, char[][] grid, int m, int n){
        if((i < 0) || (j < 0) || (i >= m) || (j >= n) || (vis.get(i).get(j)) || (grid[i][j] != '1')){
            return;
        }

        vis.get(i).set(j, true);

        dfs(i-1, j, vis, grid, m, n); // Top call
        dfs(i, j+1, vis, grid, m, n); // Right call
        dfs(i+1, j, vis, grid, m, n); // Bottom call
        dfs(i, j-1, vis, grid, m, n); // Left call
    }
}
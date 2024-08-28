class Solution {

    static int[] drow = {1, -1, 0, 0};
    static int[] dcol = {0, 0, 1, -1};

    public int countSubIslands(int[][] grid1, int[][] grid2) {
        int m = grid2.length;
        int n = grid2[0].length;  
        int count = 0;
        int[][] visited = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
               
                if (grid2[i][j] == 1 && visited[i][j] != 1) {
                    
                    if (dfs(i, j, grid1, grid2, visited, m, n)) {
                        count++;
                    }
                }
            }
        }

        return count;
    }

    public static boolean dfs(int row , int col , int[][] grid1 , int[][] grid2 , int[][] visited , int m , int n){

        visited[row][col] = 1;
        boolean isSubIsland = true;

        if(grid1[row][col] == 0){
            isSubIsland = false;
        }

        for(int i = 0 ; i < 4 ; i++){

            int newRow = row + drow[i];
            int newCol = col + dcol[i];

            if(newRow >= 0 && newRow < m && newCol >= 0 && newCol < n && grid2[newRow][newCol] == 1 && visited[newRow][newCol] != 1){


                if(dfs(newRow , newCol , grid1 , grid2 , visited , m , n) == false){
                    isSubIsland = false;
                }


            }

        }

        return isSubIsland;
        

    }
}    
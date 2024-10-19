class Solution {

    static int[] xdir = {1 , -1 , 0 , 0};
    static int[] ydir = {0 , 0 , 1 , -1};

    public int maxAreaOfIsland(int[][] grid) {
        
        int m = grid.length;
        int n = grid[0].length;
        int[][] visited = new int[m][n];
        int[] area = {0};
        int maxArea = 0;

        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){

                if(visited[i][j] == 0 && grid[i][j] == 1){
                    dfs(grid , visited , area , i , j , m , n);
                    maxArea = Math.max(maxArea , area[0]);
                    area[0] = 0;
                }

            }
        }

        return maxArea;
        
    }
    public static void dfs(int[][] grid , int[][] visited , int[] area , int row , int col , int m , int n){

        visited[row][col] = 1;
        area[0]++;

        for(int i = 0 ; i < 4 ; i++){

            int newRow = row + xdir[i];
            int newCol = col + ydir[i];

            if(newRow >=0 && newRow < m && newCol >= 0 && newCol < n && visited[newRow][newCol] != 1 && grid[newRow][newCol] == 1){

                dfs(grid , visited , area , newRow , newCol , m , n);

            }

        }

    }
}
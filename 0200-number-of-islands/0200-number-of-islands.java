class Solution {

    static int[] rowDir = {1, -1 , 0 ,0};
    static int[] colDir = {0, 0 , 1 ,-1};

    public int numIslands(char[][] grid) {
        
        int[][] visited = new int[grid.length][grid[0].length];
        int isLands = 0;

        for(int i = 0 ; i < visited.length ; i++){

            for(int j = 0 ; j < visited[0].length ; j++){

                if(visited[i][j] == 0 && grid[i][j] == '1'){
                    isLands++;
                    dfs(grid , i , j , visited);
                }

            }

        }

        return isLands;


    }
    public static void dfs(char[][] grid , int row , int col , int[][] visited){

        visited[row][col] = 1;

        for(int i = 0 ; i < 4 ; i++){

            int newRow = row + rowDir[i];
            int newCol = col + colDir[i];

            
            if(newRow >= 0 && newRow < grid.length && newCol >= 0 && newCol < grid[0].length && grid[newRow][newCol] == '1'){
                if(visited[newRow][newCol] == 1){
                    continue;
                }
                dfs(grid , newRow , newCol , visited);

            }

        }
        

    }
}
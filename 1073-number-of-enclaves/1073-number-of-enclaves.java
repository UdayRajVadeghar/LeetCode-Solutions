class Solution {

    int[] drow = { 0 , 0 , -1 , 1};
    int[] dcol = {1 , -1 , 0 , 0 };


    public int numEnclaves(int[][] grid) {

        int m = grid.length; //rows
        int n = grid[0].length;//coloumns
        int[][] visited = new int[m][n];//visited array is created

        

        //Traversing through the first and last row

        for(int i = 0 ; i < n ; i++){

            if(grid[0][i] == 1){
                //dfs
                dfs(grid , 0 , i , visited);

            }

            if(grid[m-1][i] == 1){
                //dfs
                dfs(grid , m-1 , i , visited);
            }

        }

        //Traversing through the first and last coloumn
        

        for(int i = 0 ; i < m ; i++){

            if(grid[i][0] == 1){
                //dfs
                dfs(grid , i , 0 , visited);
            }

            if(grid[i][n-1] == 1){
                //dfs
                dfs(grid , i , n-1 , visited);
            }

        }

        int count = 0;


        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){

                if(grid[i][j] == 1 && visited[i][j] != 1){
                    count++;
                }

            }
        }

        return count;
        
    }

    void dfs(int[][] grid , int row , int col , int[][] visited){
        
        visited[row][col] = 1;

        for(int i = 0 ; i < 4 ; i++){

            int newRow = row + drow[i];
            int newCol = col + dcol[i];

            if(newRow >= 0 && newCol >=0 && newRow < grid.length && newCol < grid[0].length){

                if(visited[newRow][newCol] == 1){
                    continue;
                }

                if(grid[newRow][newCol] == 1){
                    visited[newRow][newCol] = 1;
                    dfs(grid , newRow , newCol , visited);
                }

            }


        }



    }
}
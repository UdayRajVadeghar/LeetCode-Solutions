class Pair{
    int row;
    int col;
    int area;

    Pair(int _row , int _col , int _area){
        this.row = _row;
        this.col = _col;
        this.area = _area;
    }
}





class Solution {

  

    public int maxAreaOfIsland(int[][] grid) {
        

        int m = grid.length;
        int n = grid[0].length;
        Queue<Pair> queue1 = new LinkedList<>();
        int[][] visited = new int[m][n];

        for(int i = 0 ; i < grid.length ; i++){
            for(int j = 0 ; j < grid[0].length ; j++){
                if(grid[i][j] == 1){
                    queue1.offer(new Pair(i , j , 1));
                    
                }
            }
        }

        int maxArea = 0;
        while(!queue1.isEmpty()){
            
            Pair temp = queue1.poll();
            int row = temp.row;
            int col = temp.col;
            int area = temp.area;

            
            visited[row][col] = 1;
            //System.out.println("   " + row +" "+col);
            int[] currentArea = {0};
            dfs(row , col , area , grid , visited , currentArea);
            maxArea = Math.max(currentArea[0] , maxArea);

        }


        return maxArea;

    

        
    }
    public static void dfs(int row , int col , int area , int[][] grid , int[][]visited , int[] currentArea){

        int[] drow = {-1 , 1 , 0 , 0 };
        int[] dcol = {0 , 0 , -1 , 1};
        System.out.println(area);
        currentArea[0]++;

        for(int i = 0 ; i < 4 ; i++){

            int newRow = drow[i] + row;
            int newCol = dcol[i] + col;

            if(newRow >= 0 && newRow < grid.length && newCol >= 0 && newCol < grid[0].length && grid[newRow][newCol] == 1){

                if(visited[newRow][newCol] == 1){
                    continue;
                }

                visited[newRow][newCol] = 1;
                //System.out.println(newRow + " " + newCol);
                
                dfs(newRow , newCol , area , grid , visited , currentArea);

            }

        }



    }
}
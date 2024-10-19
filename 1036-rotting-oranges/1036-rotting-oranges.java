class Tuple{

    int row;
    int col;
    int time;

    public Tuple(int row , int col ,int time){
        this.row = row;
        this.col = col;
        this.time = time;
    }


}

class Solution {

    static int[] drow = {0 , 0 , 1 , -1};
    static int[] dcol = {1 , -1 , 0 , 0};

    public int orangesRotting(int[][] grid) {

        
        int m = grid.length;
        int n = grid[0].length;
        int[][] visited = new int[m][n];
        Queue<Tuple> queue1 = new LinkedList<>();

        //finding the rotten orange

        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){

                if(grid[i][j] == 2){
                    queue1.offer(new Tuple(i , j , 0));
                    visited[i][j] = 1;
                }

            }
        }

        int maxTime = 0;

        while(!queue1.isEmpty()){

            int size = queue1.size();
            
            for(int i = 0 ; i < size ; i++){

                Tuple temp = queue1.poll();
                int row = temp.row;
                int col = temp.col;
                int time = temp.time;
                visited[row][col] = 1;
                maxTime = Math.max(time , maxTime);

                for(int j = 0 ; j < 4 ; j++){

                    int newRow = row + drow[j];
                    int newCol = col + dcol[j];

                    if(newRow >= 0 && newRow < m && newCol >= 0 && newCol < n && grid[newRow][newCol] == 1 && visited[newRow][newCol] == 0){
                        
                        grid[newRow][newCol] = 2;
                        queue1.offer(new Tuple(newRow , newCol , time + 1));
                        
                    }

                }

            }

        }

        for(int i = 0 ; i < m ; i++){

            for(int j = 0 ; j < n ; j++){

                if(grid[i][j] == 1){
                    return -1;
                }
            }
        }

        return maxTime;



           
    }
}
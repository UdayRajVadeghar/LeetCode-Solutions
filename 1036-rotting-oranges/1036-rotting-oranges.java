class Pair{
    int row;
    int col;
    int time;

    Pair(int _row , int _col , int _time){
        this.row = _row; 
        this.col = _col;
        this.time = _time;
    }
}


class Solution {
    public int orangesRotting(int[][] grid) {
        

        Queue<Pair> queue1 = new LinkedList<>();

        int n = grid.length;
        int m = grid[0].length;
        int count = 0;

        int[][] visited = new int[n][m];

        for(int i = 0 ; i < n ; i++){

            for(int j = 0 ; j < m ; j++){

                if(grid[i][j] == 2){

                    queue1.offer(new Pair(i , j , 0));
                    visited[i][j] = 2;
                    
                }
                if(grid[i][j] == 1){
                    count++;
                }

            }

        }

        int[] drow = {-1 , 1 , 0 , 0};
        int[] dcol = {0 , 0 , -1 , 1}; 
        int maxTime = 0;
        int newCount = 0;

        while(!queue1.isEmpty()){

            Pair temp = queue1.poll();
            int curRow = temp.row;
            int curCol = temp.col;
            int curTime = temp.time;
            maxTime = Math.max(curTime , maxTime);

            for(int i = 0 ; i < 4 ; i++){

                int newRow = drow[i] + curRow;
                int newCol = dcol[i] + curCol;

                if((newRow >= 0 && newRow < n) && (newCol >= 0 && newCol < m) && grid[newRow][newCol] == 1){
                    
                    newCount++;
                    grid[newRow][newCol] = 2;
                   
                    queue1.offer(new Pair(newRow , newCol , curTime + 1));

                }


            }

            


        }

        System.out.println(count);
        System.out.println(newCount);

        if(count == newCount){
            return maxTime;
        }
        return -1;
        
        


        

    }
}
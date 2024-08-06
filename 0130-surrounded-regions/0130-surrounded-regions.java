class Solution {

    int[] drow = {-1 , 1 , 0 , 0 };
    int[] dcol = {0 , 0 , -1 , 1};

    public void solve(char[][] board) {


        int m = board.length;
        int n = board[0].length;

        int[][] visited = new int[m][n];

        if(m == 1 || n == 1){
            return;
        }


        // first row and last row
        for(int i = 0 ; i < m ; i++){
            
            if(board[i][0] == 'O'){
                dfs(board , i , 0 , visited);
            }

            if(board[i][n-1] == 'O'){
                dfs(board , i, n-1 , visited);
            }


        }

        for(int i= 0 ; i < n ; i++){
            if(board[0][i] == 'O'){
                dfs(board , 0 , i , visited);
            }
            if(board[m-1][i] == 'O'){
                dfs(board , m-1 , i , visited);
            }
        }



        for(int i = 0 ; i < board.length ; i++){
            for(int j = 0 ; j < n ; j++){

                if(visited[i][j] == 0){
                    board[i][j] = 'X';
                }

            }
        }

        
        
        
    }

    void dfs(char[][] board , int row , int col , int[][] visited){

        visited[row][col] = 1;

        for(int i = 0 ; i < 4 ; i++){

            int newRow = drow[i] + row;
            int newCol = dcol[i] + col;


            if (newRow >= 0 && newRow < board.length && newCol >= 0 && newCol < board[0].length) {
                if (board[newRow][newCol] == 'O' && visited[newRow][newCol] == 0) {
                    dfs(board, newRow, newCol, visited);
                }
            }


        }

    }
}
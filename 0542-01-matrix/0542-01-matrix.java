
class Pair {

    int row;
    int col;

    Pair(int row, int col) {
        this.row = row;
        this.col = col;

    }

}

class Solution {
    public int[][] updateMatrix(int[][] mat) {

        Queue<Pair> queue1 = new LinkedList<>();

        int m = mat.length;
        int n = mat[0].length;

        for(int i = 0 ; i < mat.length ; i++){

            for(int j = 0 ; j < mat[0].length ; j++){

                if(mat[i][j] == 0){
                    queue1.offer(new Pair(i , j));
                }    
                if(mat[i][j] == 1){
                    mat[i][j] = m*n;
                }

            }
        }
        
        int[] drow = {-1 , 1 , 0 , 0};
        int[] dcol = {0 , 0 , 1 , -1};

        while(!queue1.isEmpty()){


            Pair temp = queue1.poll();
            int curRow = temp.row;
            int curCol = temp.col;
            

            for(int i = 0 ; i < 4 ; i++){
                
                int newRow = curRow + drow[i];
                int newCol = curCol + dcol[i];

                if(newRow < m && newRow >= 0 && newCol < n && newCol >= 0 && mat[newRow][newCol] > mat[curRow][curCol] + 1){

                    if(mat[newRow][newCol] != 0){
                        
                        queue1.offer(new Pair(newRow , newCol));
                        mat[newRow][newCol] = mat[curRow][curCol] + 1;
                    }
                    
                    

                }
            }

            


        }
        return mat;
        
    }
}
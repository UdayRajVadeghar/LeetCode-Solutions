class Solution {

    //4 directions
    static int[] drow = {0,0,1,-1};
    static int[] dcol = {1,-1,0,0};

    public List<List<Integer>> pacificAtlantic(int[][] heights) {

        int m = heights.length;
        int n = heights[0].length;

        int[][] visited = new int[m][n];

        //pacific ocean

        //1st row

        for(int i = 0 ; i < n ; i++){
            
            if(visited[0][i] == 0){
                
                dfsP(heights,0,i,visited,m,n);
            }

        }

        //1st col

        for(int i = 0 ; i < m ; i++){
            
            if(visited[i][0] == 0){
                dfsP(heights,i,0,visited,m,n);
            }

        }


        
        
        //Atlantic Ocean

        //last row

        for(int i = 0 ; i < n ; i++){
            
            if(visited[m-1][i] == 0 || visited[m-1][i] == 1){
                dfsA(heights,m-1,i,visited,m,n);
            }

        }

        //last col

        for(int i = 0 ; i < m ; i++){
            
            if(visited[i][n-1] == 0 || visited[i][n-1] == 1){
                dfsA(heights,i,n-1,visited,m,n);
            }

        }
        

        List<List<Integer>> list1 = new ArrayList<>();

        for(int i = 0 ; i < m ; i++){

            for(int j = 0 ; j < n ; j++){
                List<Integer> list2 = new ArrayList<>();

                if(visited[i][j] == 3){
                    list2.add(i);
                    list2.add(j);
                    list1.add(new ArrayList<>(list2));
                }

            }

        }

        return list1;


        
    }
    public static void dfsP(int[][] heights , int row , int col , int[][] visited ,int m , int n){

        visited[row][col] = 1;

        for(int i = 0 ; i < 4 ; i++){

            int newRow = row + drow[i];
            int newCol = col + dcol[i];

            if(newRow>=0 && newRow<m && newCol>=0 && newCol<n){

                if(heights[newRow][newCol] >= heights[row][col] && visited[newRow][newCol] != 1){

                    dfsP(heights,newRow,newCol,visited,m,n);

                }
            }
        }
    }

    public static void dfsA(int[][] heights , int row , int col , int[][] visited ,int m , int n){

        visited[row][col] += 2;

        for(int i = 0 ; i < 4 ; i++){

            int newRow = row + drow[i];
            int newCol = col + dcol[i];

            if(newRow>=0 && newRow<m && newCol>=0 && newCol<n){

                if(heights[newRow][newCol] >= heights[row][col] && visited[newRow][newCol] != 2 && visited[newRow][newCol] != 3){

                    dfsA(heights,newRow,newCol,visited,m,n);

                }
            }

        }

    }


}
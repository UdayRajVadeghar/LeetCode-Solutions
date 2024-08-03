class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {


        int nodeValue = image[sr][sc];
        //preserve the previous value
        int m = image.length;
        int n = image[0].length;


        image[sr][sc] = color;
        int[][] visited = new int[m][n];
        visited[sr][sc] = 1;
        dfs(sr , sc , image , color , nodeValue , visited);

        return image;



        
    }
    public static void dfs( int row , int col , int[][] image , int color , int nodeValue , int[][] visited){


        int[] drow = {-1 , 1 , 0 , 0};
        int[] dcol = { 0 , 0 , -1 , 1};

        for(int i = 0 ; i < 4 ; i++){
            
            int newRow = drow[i] + row;
            int newCol = dcol[i] + col;
            


            if(newRow >= 0 && newRow < image.length && newCol >=0 && newCol < image[0].length && image[newRow][newCol] == nodeValue){
                if(visited[newRow][newCol] == 1){
                    continue;
                }
                image[newRow][newCol] = color;
                visited[newRow][newCol] = 1;
                dfs(newRow , newCol , image , color , nodeValue , visited);

            }
            
        }


    }
}
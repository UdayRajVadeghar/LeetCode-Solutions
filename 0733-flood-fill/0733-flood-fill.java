class Pair{

    int row;
    int col;

    Pair(int _row , int _col){
        this.row = _row;
        this.col = _col;
    }

}




class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {


        Queue<Pair> queue1 = new LinkedList<>();

        queue1.offer(new Pair(sr , sc));

        int n = image.length;
        int m = image[0].length;
        int setCount = n*m;
        

        
        int initialColour = image[sr][sc];
        image[sr][sc] = color;
       
       
        int count = 1;
        
        
        int[] drow = {-1 , 1 , 0 , 0};
        int[] dcol = {0 , 0 , -1 , 1};

        while(!queue1.isEmpty()){
            
            Pair temp = queue1.poll();
            int tempRow = temp.row;
            int tempCol = temp.col;

            for(int i = 0 ; i < 4 ; i++){

                int newRow = tempRow + drow[i];
                int newCol = tempCol + dcol[i];

                if((newRow >=0 && newRow < n) && (newCol >= 0 && newCol < m) && image[newRow][newCol] == initialColour){
                    

                    if(count == setCount){
                        break;
                    }

                    System.out.println(newRow +" "+ newCol);
                    image[newRow][newCol] = color;
                    count++;
                    queue1.offer(new Pair (newRow , newCol));

                }

            }


        }

        return image;



        
    }
}
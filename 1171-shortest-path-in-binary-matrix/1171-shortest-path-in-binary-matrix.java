class Tuple{

    int distance;
    int row;
    int col;

    public Tuple(int distance, int row, int col) {

        this.distance = distance;
        this.row = row;
        this.col = col;

    }


}

class Solution {

    // Directions from north to north in 8 directions
    int[] drow = { 0, 1, 1, 1, 0, -1, -1, -1 };
    int[] dcol = { -1, 1, 0, -1, 1, -1, 0, 1 };

    public int shortestPathBinaryMatrix(int[][] grid) {


        if(grid[0][0] == 1){
            return -1;
        }

        if(grid.length == 1){
            return 1;
        }

        int n = grid.length;

        Queue<Tuple> queue1 = new LinkedList<>();
        int[][] minimumDistances = new int[n][n];

        for (int i = 0; i < n; i++) {
            Arrays.fill(minimumDistances[i], Integer.MAX_VALUE);
        }


        queue1.offer(new Tuple(1, 0, 0));

        while (!queue1.isEmpty()) {

            Tuple temp = queue1.poll();
            int curRow = temp.row;
            int curCol = temp.col;
            int curDistance = temp.distance;

            for (int i = 0; i < 8; i++) {

                int newRow = drow[i] + curRow;
                int newCol = dcol[i] + curCol;
                int newDistance = curDistance + 1;

                if (newRow >= 0 && newRow < n && newCol < n && newCol >=0 && grid[newRow][newCol] == 0 &&  newDistance < minimumDistances[newRow][newCol]) {

                    queue1.offer(new Tuple(newDistance, newRow, newCol));
                    minimumDistances[newRow][newCol] = newDistance;
                }

            }

        }
        if (minimumDistances[n - 1][n - 1] == Integer.MAX_VALUE) {

            return -1;

        }

        return minimumDistances[n - 1][n - 1];

    }

}
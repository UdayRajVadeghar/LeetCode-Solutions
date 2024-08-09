import java.util.HashSet;
import java.util.Set;

public class Solution {
    private boolean isValid(int[][] matrix) {
        Set<Integer> visited = new HashSet<>();
        int expectedSum = 0;
        
    
        if (matrix[1][1] != 5) {
            return false; 
        }
     
        for (int i = 0; i < 3; i++) {
            int sum = 0;
            for (int j = 0; j < 3; j++) {
                int num = matrix[i][j];
                if (num >= 1 && num <= 9 && !visited.contains(num)) {
                    visited.add(num);
                } else {
                    return false;
                }
                sum += num;
            }
            if (i == 0) expectedSum = sum;
            if (sum != expectedSum) {
                return false;
            }
        }

   
        for (int j = 0; j < 3; j++) {
            int sum = 0;
            for (int i = 0; i < 3; i++) {
                sum += matrix[i][j];
            }
            if (sum != expectedSum) {
                return false;
            }
        }

       
        int sumA = 0, sumB = 0;
        for (int i = 0; i < 3; i++) {
            sumA += matrix[i][i];
            sumB += matrix[i][2 - i];
        }
        return sumA == expectedSum && sumB == expectedSum;
    }

    public int numMagicSquaresInside(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;

        if (row < 3 || col < 3) return 0;

        int answer = 0;
        for (int i = 0; i <= row - 3; i++) {
            for (int j = 0; j <= col - 3; j++) {
                int[][] matrix = new int[3][3];
                for (int x = 0; x < 3; x++) {
                    for (int y = 0; y < 3; y++) {
                        matrix[x][y] = grid[i + x][j + y];
                    }
                }
                if (isValid(matrix)) {
                    answer++;
                }
            }
        }

        return answer;
    }
}
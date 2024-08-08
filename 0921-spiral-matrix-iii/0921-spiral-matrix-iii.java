
class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        if (rows < 0 || cols < 0 || rStart < 0 || rStart >= rows || cStart < 0 || cStart >= cols) {
            throw new IllegalArgumentException("Input is invalid");
        }

        int totalLen = rows * cols;
        int[][] result = new int[totalLen][2];
        result[0] = new int[] { rStart, cStart };
        if (totalLen == 1) {
            return result;
        }

        int dist = 0;
        int row = rStart;
        int col = cStart;
        int[][] dirs = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };
        int dirIdx = 0;
        int count = 1;

        while (count < totalLen) {
            if (dirIdx == 0 || dirIdx == 2) {
                dist++;
            }
            for (int i = 1; i <= dist; i++) {
                row += dirs[dirIdx][0];
                col += dirs[dirIdx][1];
                if (row >= 0 && row < rows && col >= 0 && col < cols) {
                    result[count++] = new int[] { row, col };
                    if (count == totalLen) {
                        return result;
                    }
                }
            }
            dirIdx = (dirIdx + 1) % 4;
        }

        return result;
    }
}
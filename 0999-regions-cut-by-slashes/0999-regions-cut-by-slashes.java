class Solution {
    public void dfs(int arr[][], int i, int j) {
        if (i < 0 || i >= arr.length || j < 0 || j >= arr[0].length || arr[i][j] == 1) return;

        arr[i][j] = 1;
        dfs(arr, i-1, j);
        dfs(arr, i+1, j);
        dfs(arr, i, j+1);
        dfs(arr, i, j-1);

        return;
    }
    public int regionsBySlashes(String[] grid) {
        int n = grid.length;
        int arr[][] = new int[3*n][3*n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < grid[i].length(); j++) {
                if (grid[i].charAt(j) == '\\') {
                    arr[3*i][3*j] = 1;
                    arr[(3*i)+1][(3*j)+1] = 1;
                    arr[(3*i)+2][(3*j)+2] = 1; 
                } else if (grid[i].charAt(j) == '/') {
                    arr[3*i][(3*j)+2] = 1;
                    arr[(3*i)+1][(3*j)+1] = 1;
                    arr[(3*i)+2][(3*j)] = 1;
                }
            }
        }
        int res = 0;
        for (int i = 0; i < 3*n; i++) {
            for (int j = 0; j < 3*n; j++) {
                if (arr[i][j] == 0) {
                    dfs(arr, i, j);
                    res++;
                }
            }
        }
        return res;
    }
}
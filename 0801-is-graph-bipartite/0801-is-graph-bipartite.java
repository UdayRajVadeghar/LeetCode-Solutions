
class Solution {
    public boolean isBipartite(int[][] graph) {

        int[] colour = new int[graph.length];

        for(int i = 0 ; i < colour.length ; i++){
            colour[i] = -1;
        }

        for(int i = 0 ; i < colour.length ; i++){

            if(colour[i] == -1){
                if(dfs(graph , i , colour , 0) == false){
                    return false;
                }
            }
        }
        return true;
    

    }

    static boolean dfs(int[][] graph , int node , int[] colour, int col){

        colour[node] = col;

        for(Integer element : graph[node]){

            if(colour[element] == -1){
                if(dfs(graph , element, colour , 1- col ) == false){
                    return false;
                }
            }
            if(colour[element] == col){
                return false;
            }

        }
        return true;

    }

}
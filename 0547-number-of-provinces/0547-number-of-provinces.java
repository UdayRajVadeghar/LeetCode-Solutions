class Solution {
    public int findCircleNum(int[][] isConnected) {

        //converting matrix to adjList
        //{{1 , 2} , {0 , 2} ,{0,1}}

        List<List<Integer>> list1 = new ArrayList<>();

        for(int i = 0 ; i < isConnected.length ; i++){

            list1.add(new ArrayList<>());

        }

        for(int i = 0 ; i < isConnected.length ; i++){
            for(int j = 0 ; j < isConnected[0].length ; j++){

                if(isConnected[i][j] == 1){
                    list1.get(i).add(j);
                }

            }
        }

        //adj created , now dfs and find the provinces


        int[] visited = new int[list1.size()];
        int provinces = 0;

        for(int i = 0 ; i < visited.length ; i++){

            if(visited[i] == 0){
                provinces++;
                dfs(list1 , i , visited);
            }

        }

        return provinces;
        
    }
    public static void dfs(List<List<Integer>> list1 , int node ,int[] visited ){

        visited[node] = 1;

        for(Integer element : list1.get(node)){
            
            if(visited[element] == 1){
                continue;
            }

            dfs(list1 , element , visited);

        }

    }
}
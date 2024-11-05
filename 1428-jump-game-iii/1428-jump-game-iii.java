class Solution {
    public boolean canReach(int[] arr, int start) {

        int[] visited = new int[arr.length];

        dfs(arr,visited,start);

        for(int i = 0 ; i < arr.length ; i++){

            if(arr[i] == 0 && visited[i] != 0){
                return true;
            }

        }

        return false;

        
    }
    public static void dfs(int[] arr,int[] visited,int index){

        if(index >= arr.length || index < 0 || visited[index] == 1){
            return;
        }

        visited[index] = 1;

        dfs(arr,visited,index+arr[index]);
        dfs(arr,visited,index-arr[index]);

    }
}
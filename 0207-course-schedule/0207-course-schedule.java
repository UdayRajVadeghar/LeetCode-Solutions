class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
      
        int[] visited = new int[numCourses];
        int[] pathVisited = new int[numCourses];

        for (int i = 0; i < numCourses; i++) {
            if (visited[i] == 0) {
                if (dfs(i, prerequisites, visited, pathVisited)) {
                    return false;  
                }
            }
        }
        return true;  
    }

    static boolean dfs(int node, int[][] prerequisites, int[] visited, int[] pathVisited) {
        visited[node] = 1; 
        pathVisited[node] = 1; 

        for (int[] prereq : prerequisites) {
            if (prereq[0] == node) {
                int dependentCourse = prereq[1];
                if (visited[dependentCourse] == 0) {
                    if (dfs(dependentCourse, prerequisites, visited, pathVisited)) {
                        return true;  
                    }
                } else if (pathVisited[dependentCourse] == 1) {
                    return true;
                }
            }
        }

        pathVisited[node] = 0;  
        return false;
    }
}

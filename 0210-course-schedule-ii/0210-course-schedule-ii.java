import java.util.*;

class Solution {

    public int[] findOrder(int numCourses, int[][] prerequisites) {

        // -------------------------
        // 1. Cycle Detection
        // -------------------------
        boolean[] pathVisited = new boolean[numCourses];
        boolean[] vis = new boolean[numCourses];

        for(int i = 0; i < numCourses; i++){

            if(!vis[i]){

                if(isCycle(i, vis, pathVisited, prerequisites)){
                    return new int[0];
                }
            }
        }


        // -------------------------
        // 2. Topological Sort
        // -------------------------
        Stack<Integer> s = new Stack<>();
        boolean[] visited = new boolean[numCourses];

        for(int i = 0; i < numCourses; i++){

            if(!visited[i]){
                topoSort(i, visited, s, prerequisites);
            }
        }


        // -------------------------
        // 3. Stack -> Answer
        // -------------------------
        int[] ans = new int[numCourses];
        int index = 0;

        while(!s.isEmpty()){
            ans[index++] = s.pop();
        }

        return ans;
    }


    // Cycle Detection
    public static boolean isCycle(
            int src,
            boolean[] visited,
            boolean[] pathVisited,
            int[][] prerequisites) {

        visited[src] = true;
        pathVisited[src] = true;

        for(int i = 0; i < prerequisites.length; i++){

            int u = prerequisites[i][0];
            int v = prerequisites[i][1];

            // v -> u
            if(v == src){

                if(!visited[u]){

                    if(isCycle(u, visited, pathVisited, prerequisites)){
                        return true;
                    }

                }
                else if(pathVisited[u]){
                    return true;
                }
            }
        }

        pathVisited[src] = false;

        return false;
    }


    // Topological Sort
    public static void topoSort(
            int src,
            boolean[] visited,
            Stack<Integer> s,
            int[][] prerequisites) {

        visited[src] = true;

        for(int i = 0; i < prerequisites.length; i++){

            int u = prerequisites[i][0];
            int v = prerequisites[i][1];

            // v -> u
            if(v == src){

                if(!visited[u]){
                    topoSort(u, visited, s, prerequisites);
                }
            }
        }

        s.push(src);
    }
}
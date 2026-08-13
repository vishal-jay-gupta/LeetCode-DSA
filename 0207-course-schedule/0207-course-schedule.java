class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {

        // Create adjacency list
        ArrayList<Integer>[] graph = new ArrayList[numCourses];

        for (int i = 0; i < numCourses; i++) {
            graph[i] = new ArrayList<>();
        }

        // Calculate indegree
        int[] indegree = new int[numCourses];

        for (int[] pair : prerequisites) {
            int course = pair[0];
            int prerequisite = pair[1];

            graph[prerequisite].add(course);
            indegree[course]++;
        }

        // Add courses having no prerequisites
        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < numCourses; i++) {
            if (indegree[i] == 0) {
                q.offer(i);
            }
        }

        // Process courses
        int count = 0;

        while (!q.isEmpty()) {

            int curr = q.poll();
            count++;

            for (int next : graph[curr]) {

                indegree[next]--;

                if (indegree[next] == 0) {
                    q.offer(next);
                }
            }
        }

        // Did we complete all courses?
        return count == numCourses;
    }
}
import java.util.*;

class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        // int n = room.size();
        Queue<Integer> q = new LinkedList<>();

        boolean[] vis = new boolean[rooms.size()];

        q.add(0);

        while(!q.isEmpty()){
            int curr = q.poll();

            if(!vis[curr]){
                vis[curr] = true;
                for(int i : rooms.get(curr)){
                    if(!vis[i]){
                        q.add(i);
                    }
                }
            }
        }
        
        for(int i=0; i<vis.length; i++){
            if(!vis[i]) return false;
        }
        return true;

    }
}
import java.util.*;

class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> list = new ArrayList<>();

        backtrack(n, k, 1, new ArrayList<>(), list);
        return list;
    }

    public static void backtrack(int n, int k,int start ,List<Integer> tempList, List<List<Integer>> list){
        if(n < 0) return;
        if(tempList.size() == k) {
            list.add(new ArrayList<>(tempList));
            return;
        }

        for(int i=start; i<=n; i++){
            tempList.add(i);
            backtrack(n, k, i+1,tempList, list);
            tempList.remove(tempList.size() - 1);
        }
    }
}
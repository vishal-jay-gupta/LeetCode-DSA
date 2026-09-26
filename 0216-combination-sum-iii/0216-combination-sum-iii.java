import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> list = new ArrayList<>();
        recursion(list, new ArrayList<>(), n, k, 1, 0);
        return list;
    }


    private void recursion(List<List<Integer>> list, ArrayList<Integer> tempList, int n, int k, int start, int sum){
        if(tempList.size() == k){
            if(sum == n){
                list.add(new ArrayList<>(tempList));
            }
        }

        for(int i=start; i<=9; i++){
            tempList.add(i);
            recursion(list, tempList, n, k, i+1, sum + i);
            tempList.remove(tempList.size() - 1);
        }
    }
}


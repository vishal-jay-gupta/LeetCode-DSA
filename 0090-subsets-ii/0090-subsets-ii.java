import java.util.*;

class Solution {
    private void recursion(int[] nums, List<List<Integer>> list, ArrayList<Integer> tempList, int i){
        if(i == nums.length){
            list.add(new ArrayList<>(tempList));
            return;
        }

        // Include nums[i]
        tempList.add(nums[i]);
        recursion(nums, list, tempList, i+1);
        
        // Backtracking
        tempList.remove(tempList.size()-1);

        // bypassing same element
        int idx = i + 1;
        while(idx < nums.length && nums[i] == nums[idx]) idx++;

        // Exclude nums[i]
        recursion(nums, list, tempList, idx);
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        recursion(nums, list, new ArrayList<Integer>(), 0);
        return list;
    }
}
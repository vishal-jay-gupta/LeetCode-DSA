import java.util.*;

class Solution {
    private void backtrack(int[] nums, List<List<Integer>> list, ArrayList<Integer> tempList, boolean[] used){
        if(nums.length == tempList.size()){
            list.add(new ArrayList<>(tempList));
            return;
        }else{
            for(int i=0; i<nums.length; i++){
                // if(i > 0 && nums[i] == nums[i-1]) tempList.add(nums[i]);
                if(used[i]) continue;
                if(i>0 &&nums[i-1]==nums[i] && !used[i-1]) continue;

                used[i] = true;
                tempList.add(nums[i]);
                backtrack(nums, list, tempList, used);
                tempList.remove(tempList.size() - 1);
                used[i] = false;
            }
        }
    }

    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        boolean[] used = new boolean[nums.length];
        backtrack(nums, list, new ArrayList<Integer>(), used);
        return list;
    }
}
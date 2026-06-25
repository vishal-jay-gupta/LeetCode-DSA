import java.util.*;

class Solution {
    private void backtrack(int[] nums, List<List<Integer>> list, ArrayList<Integer> tempList){
        if(nums.length == tempList.size()) {
            list.add(new ArrayList<>(tempList));
            return;
        }else{
            for(int i=0; i<nums.length; i++){
                if(tempList.contains(nums[i])) continue;

                tempList.add(nums[i]);
                backtrack(nums, list, tempList);
                tempList.remove(tempList.size()-1);
            }
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(nums, list, new ArrayList<Integer>());
        return list;
    }
}
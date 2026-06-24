import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();

        Arrays.sort(candidates);

        backtrack(candidates, list, new ArrayList<>(), target, 0);

        return list;
    }

    private void backtrack(int[] nums,
                           List<List<Integer>> list,
                           List<Integer> tempList,
                           int remain,
                           int start) {

        if (remain == 0) {
            list.add(new ArrayList<>(tempList));
            return;
        }

        if (remain < 0) {
            return;
        }

        for (int i = start; i < nums.length; i++) {

            // Skip duplicates
            if (i > start && nums[i] == nums[i - 1]) {
                continue;
            }

            tempList.add(nums[i]);

            backtrack(nums, list, tempList,
                     remain - nums[i], i + 1);

            tempList.remove(tempList.size() - 1);
        }
    }
}
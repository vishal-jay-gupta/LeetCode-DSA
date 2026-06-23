class Solution {
    public void recursion(int[] nums,List<List<Integer>> list ,ArrayList<Integer> tempList,int i){
        if(i == nums.length) {
            list.add(new ArrayList<>(tempList));
            return;
        }

        //Include nums[i]
        tempList.add(nums[i]);
        recursion(nums, list, tempList, i+1);

        // Backtrack
        tempList.remove(tempList.size()-1);

        // Exclude nums[i]
        recursion(nums, list, tempList, i+1);
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList();
        
        recursion(nums, list, new ArrayList<Integer>(), 0);
        return list;
    }
}
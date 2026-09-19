class Solution {
    public int singleNonDuplicate(int[] nums) {
        int i = 1;
        int n = nums.length;

        if(n == 1) return nums[0];
        
        while(i < n-1){
            int curr = nums[i];
            if(nums[i-1] != curr & nums[i+1] != curr){
                return curr;
            }
            i++;
        }

        if(nums[0] != nums[1]){
            return nums[0];
        }
        return nums[n-1];
    }
}
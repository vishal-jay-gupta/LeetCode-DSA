class Solution {
    public int minMoves(int[] nums) {
        int n = nums.length;
        int maxVal = nums[0];
        int ans = 0;

        for(int i=1; i<n; i++){
            if(maxVal < nums[i]) maxVal = nums[i];
        }

        for(int num : nums){
            ans += maxVal - num;
        }
        return ans;
    }
}
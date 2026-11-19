class Solution {
    public int minimizeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

        if(n < 3){
            return 0;
        }

        int firstMin = nums[n-1] - nums[2];
        int secMin = nums[n-3] - nums[0];
        int thirdMin = nums[n-2] - nums[1];

        return Math.min(firstMin, Math.min(secMin, thirdMin));
    }
}
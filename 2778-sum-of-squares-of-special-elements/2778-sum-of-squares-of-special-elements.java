class Solution {
    public int sumOfSquares(int[] nums) {
        int ans = 0;
        int idx = 1;
        int n = nums.length;
        for(int i=0; i<n; i++){
            if(n % idx == 0){
                ans += (nums[i] * nums[i]);
            }
            idx++;
        }

        return ans;
    }
}
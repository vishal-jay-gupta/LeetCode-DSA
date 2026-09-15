class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int ans = 0;

        for(int i=0; i<n; i++){
            int temp = k;
            int curr = 0;

            for(int j=i; j<n; j++){
                
                if(nums[j] == 0){
                    if(temp == 0) break;
                    temp--;
                }
                curr++;
            }

            ans = Math.max(curr, ans);


        }

        return ans;
    }
}
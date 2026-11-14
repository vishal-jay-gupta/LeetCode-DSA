class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int n = nums.size();
        int ans = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            int len = 1;
            int sum = 0;
            for(int j=i; j<n; j++){
                sum += nums.get(j);
                if(len >= l && len <= r){
                    if(sum > 0){
                        ans = Math.min(sum, ans);
                    }
                }
                len++;
            }
        }

        return ans >= Integer.MAX_VALUE ? -1 : ans;
    }
}
class Solution {

    // public int longestMonotonicSubarray(int[] nums) {
    //     int n = nums.length;

    //     if(n == 1) return 1;

    //     int inc = 0;
    //     for(int i=0; i<n; i++){
    //         int prev = nums[i];
    //         int count = 1;
    //         for(int j=i+1; j<n; j++){
    //             if(prev < nums[j]){
    //                 count++;
    //             }else{
    //                 count = 1;
    //             }
    //             inc = Math.max(count, inc);
    //             prev = nums[j];
    //         }
    //     }

        
    //     int dec = 0;
    //     for(int i=0; i<n; i++){
    //         int prev = nums[i];
    //         int count = 1;
    //         for(int j=i+1; j<n; j++){
    //             if(prev > nums[j]){
    //                 count++;
    //                 System.out.println(count);
    //             }else{
    //                 count = 1;
    //             }
    //             dec = Math.max(count, dec);
    //             prev = nums[j];
    //         }
    //     }


    //     return Math.max(inc, dec);
    // }


    public int longestMonotonicSubarray(int[] nums) {
        int curI = 1;
        int curD = 1;
        int ans = 1;
        for(int i = 1;i<nums.length;i++){
            if(nums[i]> nums[i-1]){
                curI++;
                curD = 1;
            }
            else if(nums[i]< nums[i-1]){
                curD++;
                curI = 1;
            }
            else{
                curI=1;
                curD=1;
            }
            ans = Math.max(ans,Math.max(curI,curD));
        }
        return ans;
    }
}
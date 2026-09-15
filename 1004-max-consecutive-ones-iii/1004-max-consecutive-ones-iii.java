class Solution {
    /*---------------------------------------------------------------------------------------------------------
            Time Complexity = O(n^2)
            Space Complexity = O(1)
    --------------------------------------------------------------------------------------------------------*/

    // public int longestOnes(int[] nums, int k) {
    //     int n = nums.length;
    //     int ans = 0;

    //     for(int i=0; i<n; i++){
    //         int temp = k;
    //         int curr = 0;

    //         for(int j=i; j<n; j++){
                
    //             if(nums[j] == 0){
    //                 if(temp == 0) break;
    //                 temp--;
    //             }
    //             curr++;
    //         }

    //         ans = Math.max(curr, ans);


    //     }

    //     return ans;
    // }

    /*---------------------------------------------------------------------------------------------------------
            Time Complexity = O(2n) = O(n)
            Space Complexity = O(1)
    --------------------------------------------------------------------------------------------------------*/


    public int longestOnes(int[] nums, int k) {
        
        int i=0; 
        int j=0;
        int zeros = 0;
        int maxLength = 0;

        while(j<nums.length){
            if(nums[j] == 0) zeros++;

            while(zeros > k){
                if(nums[i] == 0) zeros--;
                i++;
            }

            if(zeros <= k){
                maxLength = Math.max(maxLength, j-i+1);
            }
            j++;
        }

        return maxLength;
    }


    /*---------------------------------------------------------------------------------------------------------
            Time Complexity = O(n)
            Space Complexity = O(1)
    --------------------------------------------------------------------------------------------------------*/


    // public int longestOnes(int[] nums, int k) {
        
    //     int i=0; 
    //     int j=0;
    //     int zeros = 0;
    //     int maxLength = 0;

    //     while(j<nums.length){
    //         if(nums[j] == 0) zeros++;

    //         while(zeros > k){
    //             if(nums[i] == 0) zeros--;
    //             i++;
    //         }

    //         if(zeros <= k){
    //             maxLength = Math.max(maxLength, j-i+1);
    //         }
    //         j++;
    //     }

    //     return maxLength;
    // }
}
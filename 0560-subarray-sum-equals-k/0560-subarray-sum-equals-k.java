class Solution {
    /*-------------------------------------------------------------------------------------------
            Time Complexity = O(n ^ 3)
            Space Complexity = O(1)
    ------------------------------------------------------------------------------------------*/

    // public int subarraySum(int[] nums, int k) {
    //     int n = nums.length;
    //     int count = 0;

    //     for(int i=0; i<n; i++){
    //         for(int j=i; j<n; j++){
    //             int start = i;
    //             int end = j;
    //             int sum = 0;
    //             while(start <= end){
    //                 sum += nums[start];
    //                 start++;
    //             }

    //             if(sum == k){
    //                 count++;
    //             }

    //         }
    //     }

    //     return count;
    // }


    public int subarraySum(int[] nums, int k) {
        int n = nums.length;

        int count = 0;
        for(int i=0; i<n; i++){
            int sum = 0;
            for(int j=i; j<n; j++){
                sum += nums[j];
                if(sum == k){
                    count++;
                }
            }
        }

        return count;
    }
}
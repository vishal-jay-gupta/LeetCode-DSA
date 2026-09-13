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


    /*-------------------------------------------------------------------------------------------
            Time Complexity = O(n ^ 2)
            Space Complexity = O(1)
    ------------------------------------------------------------------------------------------*/
    // public int subarraySum(int[] nums, int k) {
    //     int n = nums.length;

    //     int count = 0;
    //     for(int i=0; i<n; i++){
    //         int sum = 0;
    //         for(int j=i; j<n; j++){
    //             sum += nums[j];
    //             if(sum == k){
    //                 count++;
    //             }
    //         }
    //     }

    //     return count;
    // }

    /*-------------------------------------------------------------------------------------------
            Time Complexity = O(n)
            Space Complexity = O(n)
    ------------------------------------------------------------------------------------------*/
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> hMap = new HashMap<>();

        hMap.put(0, 1);
        int prefixSum = 0;
        int count = 0;
        for(int i=0; i<nums.length; i++){
            prefixSum += nums[i];
            int remove = prefixSum - k;

            if(hMap.containsKey(remove)){
                count += hMap.get(remove);
            }

            hMap.put(prefixSum, hMap.getOrDefault(prefixSum, 0) + 1);
        }

        return count;
    }
}
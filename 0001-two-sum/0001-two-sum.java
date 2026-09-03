import java.util.*;

class Solution {
    /*-------------------------------------------------------------------------------------
        Time Comlexity = O(n^2)
        Space Complexity = O(2) = O(1)
    -------------------------------------------------------------------------------------*/

    // public static int[] twoSum(int[] nums, int target) {
    //     int[] ans = new int[2];

    //     for(int i=0; i<nums.length; i++){
    //         int rem = target - nums[i];
    //         for(int j=i+1; j<nums.length; j++){
    //             if(rem == nums[j]) {
    //                 ans[0] = i;
    //                 ans[1] = j;
    //             }
    //         }
    //     }

    //     return ans;
    // }


    /*-------------------------------------------------------------------------------------
        Time Comlexity = O(n)
        Space Complexity = O(n)
    -------------------------------------------------------------------------------------*/

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            int temp = target - nums[i];
            if(hm.containsKey(temp) ){
                if(hm.get(temp) != i){
                    return new int[]{i, hm.get(temp)};
                }
            }
            hm.put(nums[i], i);
        }

        return new int[]{};
    }

}

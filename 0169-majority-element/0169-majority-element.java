import java.util.*;
class Solution {
    /*------------------------------------------------------------------------------------------
            Time Comlexity = O(n)
            Space Comlexity = O(n)
    -------------------------------------------------------------------------------------------*/

    // public int majorityElement(int[] nums) {

    //     int n = nums.length;
    //     HashMap<Integer, Integer> count = new HashMap<>();
    //     for(int i=0; i<n; i++){
    //         count.put(nums[i], count.getOrDefault(nums[i], 0) + 1);
    //     }

    //     for(Map.Entry<Integer, Integer> entry: count.entrySet()){
    //         if(entry.getValue() > n / 2){
    //             return entry.getKey();
    //         }
    //     }
    //     return -1;
    // }


    /*------------------------------------------------------------------------------------------
            Boyer-Moore Voting Algorithm
            
            Time Comlexity = O(n)
            Space Comlexity = O(1)
    -------------------------------------------------------------------------------------------*/

    public int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;
        
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            
            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }
        
        return candidate;
    }
}
import java.util.*;

class Solution {
    /*----------------------------------------------------------------------------------------------------
            Time Complexity = O(n log n);
            Space Complexity = O(1);
    -----------------------------------------------------------------------------------------------------*/
    // public int findDuplicate(int[] nums) {
    //     Arrays.sort(nums);

    //     for(int i=1; i<nums.length; i++){
    //         if(nums[i] == nums[i-1]){
    //             return nums[i];
    //         }
    //     }
    //     return -1;
    // }


    /*----------------------------------------------------------------------------------------------------
            Time Complexity = O(n);
            Space Complexity = O(n);
    -----------------------------------------------------------------------------------------------------*/
    // public int findDuplicate(int[] nums) {
    //     Map<Integer, Integer> hMap = new HashMap<>();
    //     int n = nums.length;

    //     for(int i=0; i<n; i++){
    //         if(!hMap.containsKey(nums[i])){
    //             hMap.put(nums[i], i);
    //         }else{
    //             return nums[i];
    //         }
    //     }

    //     return -1;
    // }


    /*----------------------------------------------------------------------------------------------------
        Optimal Approach: ->
            Floyd's Cycle Detection
                Time Complexity = O(n);
                Space Complexity = O(1);
    -----------------------------------------------------------------------------------------------------*/
    public int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];

        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        }while(slow != fast);

        slow = nums[0];
        while(slow != fast){
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
    }
}
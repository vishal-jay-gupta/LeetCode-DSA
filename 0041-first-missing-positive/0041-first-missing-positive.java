import java.util.*;

/*-------------------------------------------------------------------------------------------------------------
    1. make n size hashmap
    2. mark key 1 to n and true that number is in array
    3. travers on hashMap then if any value in hashmap is fasle that is the ans

    -------------------------------------------------------------------------------
    Optime approach
    1. all elements that are negative in array write down +maxNumber
    2. travers to arrays. if each element make their index value in array in negative
    3. traver to array if any element is in positive that index + 1 number is missing

--------------------------------------------------------------------------------------------------------------*/

class Solution {
    /*------------------------------------------------------------------------------------------------------
            Time Complexity = O(2N) = O(n)
            Space Complexity = O(n)
    ------------------------------------------------------------------------------------------------------*/


    // public int firstMissingPositive(int[] nums) {
    //     Map<Integer, Boolean> hMap = new HashMap<>();
    //     int n = nums.length;

    //     for(int i=0; i<n; i++){
    //         hMap.put(nums[i], true);
    //     }

    //     for(int x=1; x<=n; x++){
    //         if(!hMap.containsKey(x)){
    //             return x;
    //         }
    //     }

    //     return n+1;
    // }

    /*------------------------------------------------------------------------------------------------------
            Time Complexity = O(3N) = O(n)
            Space Complexity = O(1)
    ------------------------------------------------------------------------------------------------------*/


    public int firstMissingPositive(int[] nums) {
        int n = nums.length; 

        // Clean the array
        for(int i=0; i<nums.length; i++){
            if(nums[i] <= 0 || nums[i] > n){
                nums[i] = n+1;;
            }
        }


        // Mark the present
        for(int i=0; i<nums.length; i++){
            int num = Math.abs(nums[i]);

            if(num > n) continue;
            
            if(nums[num - 1] > 0){
                nums[num - 1] = -nums[num - 1];
            }
        }

        for(int i=0; i<n; i++){
            if(nums[i] > 0){
                return i + 1;
            }
        }

        return n + 1;
    }
}
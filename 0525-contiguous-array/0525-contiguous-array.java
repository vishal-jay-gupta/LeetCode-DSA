import java.util.*;

class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> hMap = new HashMap<>();
        hMap.put(0, -1);
        int currSum = 0;
        int maxLength = 0;

        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0){
                currSum++;
            }else{
                currSum--;
            }

            if(!hMap.containsKey(currSum)){
                hMap.put(currSum , i);
            }else{
                maxLength = Math.max(maxLength, i - hMap.get(currSum));
            }
        }

        return maxLength;
    }
}
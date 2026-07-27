import java.util.*;
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num: nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int[] ans = new int[k];

        for(int i=0; i<k; i++){
            int maxElement = 0;
            int element = 0;

            for(Map.Entry<Integer, Integer> entry: map.entrySet()){
                if(entry.getValue() > maxElement){
                    maxElement = entry.getValue();
                    element = entry.getKey();
                }
            }

            ans[i] = element;
            map.remove(element);
        }

        return ans;
    
    }
} 
import java.util.*;
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        // ArrayList<Double> list = new ArrayList<>();

        int i = 0;
        int j = 0;

        int curr = 0;
        while(j < k){
            curr += nums[j];
            j++;
        }

        double max = curr;
        while(j < nums.length){
            curr = curr - nums[i] + nums[j];
            i++;
            j++;
            max = Math.max(curr, max);
        }
 
        double op = (double) max/k;
        return op;
    }
}
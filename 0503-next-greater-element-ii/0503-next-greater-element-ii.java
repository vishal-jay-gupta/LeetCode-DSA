import java.util.*;

class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        Map<Integer, Integer> hMap = new HashMap<>();
        int[] list = new int[nums.length];
        int n = nums.length;
        
        for(int i=(n*2)-1; i>=0; i--){
            while(stack.size() > 0 && stack.peek() <= nums[(i % n)]) stack.pop();

            if(stack.isEmpty()) list[(i % n)] = -1;
            else list[(i % n)] = stack.peek();
            stack.push(nums[(i % n)]);
        }

        return list;
    }
}
import java.util.*;
class Solution {

/*-------------------------------------------------------------------------------------
            Time Complexity = O(nlogn)​
            Space Complexity = O(n)
--------------------------------------------------------------------------------------*/


    // public int findKthLargest(int[] nums, int k) {
    //     PriorityQueue<Integer> maxHeap = new PriorityQueue(Collections.reverseOrder());

    //     for(int i=0; i<nums.length; i++){
    //         maxHeap.offer(nums[i]);
    //     }

    //     int i = 1;
    //     while(k != i){
    //         maxHeap.poll();
    //         i++;
    //     }

    //     return maxHeap.poll();
    // }




/*-------------------------------------------------------------------------------------
            Time Complexity = O(nlogn)​
            Space Complexity = O(1)
--------------------------------------------------------------------------------------*/


    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue();

        for(int i=0; i<nums.length; i++){
            minHeap.offer(nums[i]);
            if(minHeap.size() > k){
                minHeap.poll();
            }
        }

        

        return minHeap.peek();
    }
}
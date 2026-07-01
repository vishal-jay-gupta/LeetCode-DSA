class Solution {
    /*-------------------------------------------------------------------------------
            Time Comlexity = O(n^2)
    -------------------------------------------------------------------------------*/
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] list = new int[nums1.length];

        for(int i=0; i<nums1.length; i++){
            int j = nums2.length-1;
            int ans = -1;
            while(j >= 0){
                if(nums1[i] == nums2[j]){
                    list[i] = ans;
                    break;
                }
                if(nums2[j] > nums1[i]){
                    ans = nums2[j];
                }
                j--;
            }
            
        }
        return list;
    }

    
    /*-------------------------------------------------------------------------------
            Time Comlexity = O(n)
    -------------------------------------------------------------------------------*/

    // public int[] nextGreaterElement(int[] nums1, int[] nums2) {
    //     int[] list = new int[nums1.length];
    //     Stack<Integer> s = new Stack<>();
    //     HashMap<Integer, Integer> hMap = new HashMap();

    //     for(int i=0; i<nums2.length; i++){
    //         if(s.isEmpty()){
    //             s.push(nums2[i]);
    //         }else{
    //             if(s.peek() < nums2[i]){
    //                 hMap.put(s.peek(), nums2[i]);
    //                 s.pop();
    //             }
    //             s.push(nums2[i]);
    //         }
    //     }

    //     while(!s.isEmpty()){
    //         hMap.put(s.pop(), -1);
    //     }

    //     for(int i=0; i<nums1.length; i++){
    //         list[i] = hMap.get(nums1[i]);
    //     }

    //     return list;
    // }
}
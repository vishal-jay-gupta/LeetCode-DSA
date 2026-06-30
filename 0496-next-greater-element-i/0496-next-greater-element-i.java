class Solution {
    /*-------------------------------------------------------------------------------
            Time Comlexity = O(n^2)
    -------------------------------------------------------------------------------*/
    // public int[] nextGreaterElement(int[] nums1, int[] nums2) {
    //     int[] list = new int[nums1.length];

    //     for(int i=0; i<nums1.length; i++){
    //         int j = nums2.length-1;
    //         int ans = -1;
    //         while(j >= 0){
    //             if(nums1[i] == nums2[j]){
    //                 list[i] = ans;
    //                 break;
    //             }
    //             if(nums2[j] > nums1[i]){
    //                 ans = nums2[j];
    //             }
    //             j--;
    //         }
            
    //     }
    //     return list;
    // }

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
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
}
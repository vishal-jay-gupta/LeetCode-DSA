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

    
    /*-------------------------------------------------------------------------------
            Time Comlexity = O(n) solve question by this aproach
    -------------------------------------------------------------------------------*/

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] list = new int[nums1.length];
        Stack<Integer> s = new Stack<>();
        HashMap<Integer, Integer> hMap = new HashMap();

        int n = nums2.length-1;
        System.out.println(n);
        for(int i=n; i>=0; i--){
            while(s.size() > 0 && s.peek() <= nums2[i]) s.pop();
            if(s.isEmpty()){
                hMap.put(nums2[i], -1);
            }else{
                // list[i] = s.peek();
                hMap.put(nums2[i], s.peek());
            }

            s.push(nums2[i]);
        }

        for(int i=0; i<nums1.length; i++){
            list[i] = hMap.get(nums1[i]);
        }

        return list;
    }
}
class Solution {

    public int longestMonotonicSubarray(int[] nums) {
        int n = nums.length;

        if(n == 1) return 1;

        int inc = 0;
        for(int i=0; i<n; i++){
            int prev = nums[i];
            int count = 1;
            for(int j=i+1; j<n; j++){
                if(prev < nums[j]){
                    count++;
                }else{
                    count = 1;
                }
                inc = Math.max(count, inc);
                prev = nums[j];
            }
        }

        
        int dec = 0;
        for(int i=0; i<n; i++){
            int prev = nums[i];
            int count = 1;
            for(int j=i+1; j<n; j++){
                if(prev > nums[j]){
                    count++;
                    System.out.println(count);
                }else{
                    count = 1;
                }
                dec = Math.max(count, dec);
                prev = nums[j];
            }
        }


        return Math.max(inc, dec);
    }
}
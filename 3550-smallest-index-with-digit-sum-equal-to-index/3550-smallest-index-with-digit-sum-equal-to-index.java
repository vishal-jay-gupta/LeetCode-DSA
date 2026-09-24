class Solution {
    public int smallestIndex(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];

        for(int i=0; i<n; i++){
            int sum = 0;
            int num = nums[i];
            while(num > 0){
                int rem = num % 10;
                sum += rem;
                num = num / 10;
            }

            if(sum == i) return i;
        }

        return -1;
    }
}
class Solution {
    public int findGCD(int[] nums) {
        int max = -1;
        int min = 1001;

        for(int num : nums){
            max = Math.max(max, num);
            min = Math.min(min, num);
        }

        int temp = min;
        while(temp > 0){
            if(max % temp == 0 && min % temp == 0) return temp;
            temp--;
        }

        return 0;
    }
}
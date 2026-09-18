class Solution {
    public int searchVal(int nums[], int target, int si, int ei){
        if(si > ei){
            return -1;
        }

        int mid = si + (ei - si)/2;
        if(nums[mid] == target){
            return mid;
        }

        if(nums[si] <= nums[mid]){
            if((nums[si] <= target) && (target <= nums[mid])){
                return searchVal(nums, target, si, mid-1);
            }else{
                return searchVal(nums, target, mid+1, ei);
            }
        }else{
            if((nums[mid] <= target) && (target <= nums[ei])){
                return searchVal(nums, target, mid+1, ei);
            }else{
                return searchVal(nums, target, si, mid-1);
            }
        }
    }
    public int search(int[] nums, int target) {
        // return searchVal(nums, target, 0, nums.length-1);

        // Write this code without using recurision
        int n = nums.length;

        int start = 0;
        int end = n-1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(nums[mid] == target) return mid;

            if(nums[start] <= nums[mid]){
                if(nums[start] <= target && target <= nums[mid]){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }else{
                if(nums[mid] <= target && target <= nums[end]){
                    start = mid + 1;
                }else{
                    end = mid-1;
                }
            }
        }

        return -1;
    }
}
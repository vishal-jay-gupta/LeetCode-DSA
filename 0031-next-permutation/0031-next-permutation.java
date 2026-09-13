class Solution {
    public void nextPermutation(int[] nums) {
        int pivot = -1;
        int n = nums.length;

        // Find Pivot
        for(int i=n-2; i>=0; i--){
            if(nums[i] < nums[i+1]){
                pivot = i;
                break;
            }
        }

        // edge case if nums is in decending order so arrange it in accending order.
        if(pivot == -1){
            reverse(nums, 0, n-1);
            return;
        }

        // Find Right most element then swap
        for(int i=n-1; i>pivot; i--){
            if(nums[i] > nums[pivot]){
                swap(nums, i, pivot);
                break;
            }
        }

        reverse(nums, pivot+1, n-1);

    }

    public static void reverse(int[] nums, int start, int end){
        while(start < end){
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    public static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
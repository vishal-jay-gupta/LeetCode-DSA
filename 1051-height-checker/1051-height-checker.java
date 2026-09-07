class Solution {
    public int heightChecker(int[] heights) {
        int[] sortedArray = new int[heights.length];

        for(int i=0; i<heights.length; i++){
            sortedArray[i] = heights[i];
        }
        Arrays.sort(sortedArray);
        int count = 0;
        for(int i=0; i<sortedArray.length; i++){
            if(heights[i] != sortedArray[i]) count++;
        }

        return count;
    }
}
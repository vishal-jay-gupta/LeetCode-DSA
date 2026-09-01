class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxValue = Integer.MIN_VALUE;
        ArrayList<Boolean> ans = new ArrayList<>();

        for(int candie : candies){
            if(maxValue < candie){
                maxValue = candie;
            }
        }
        for(int candie : candies){
            int allCandies = candie + extraCandies;
            if(allCandies >= maxValue){
                ans.add(true);
            }else{
                ans.add(false);
            }
        }

        return ans;
    }
}
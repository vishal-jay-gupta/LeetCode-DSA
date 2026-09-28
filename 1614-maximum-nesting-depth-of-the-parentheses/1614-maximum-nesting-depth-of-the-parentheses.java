class Solution {
    public int maxDepth(String s) {
        int curr = 0;
        int maxLength = 0;

        for(char ch : s.toCharArray()){
            if(ch == '(') curr++;
            if(ch == ')') curr--;
            maxLength = Math.max(maxLength, curr);
        }

        return maxLength;
    }
}
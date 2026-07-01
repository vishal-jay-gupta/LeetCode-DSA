class Solution {
    public int firstUniqChar(String s) {
        for(int i=0; i<s.length(); i++){
            for(int j=0; j<=s.length(); j++){
                if(j == s.length()){
                    return i;
                }
                if(i == j) continue;
                if(s.charAt(i) == s.charAt(j)) break;
            }
        }
        return -1;
    }
}
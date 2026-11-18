class Solution {
    public int minChanges(String s) {
        // int totalZero = 0;
        // int totalOne = 0;

        // for(int i=0; i<s.length(); i++){
        //     if(s.charAt(i) == 1) totalOne++;
        //     else totalZero++;
        // }

        // if(totalOne == s.length() || totalZero == s.length()) return 0;

        int count = 0;
        int left = 1;
        int right = s.length();
        while(left < right){
            if(s.charAt(left) != s.charAt(left-1)) count++;
            left += 2;
        }


        return count;
    }
}
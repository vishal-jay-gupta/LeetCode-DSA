class Solution {
    // public void reverseString(char[] s) {
    //     int n = s.length;
    //     for(int i=0; i<n/2; i++){
    //         char temp = s[i];
    //         s[i] = s[n-1-i];
    //         s[n-1-i] = temp;
    //     }
        
    // }

    /*------------------------------------------------------------------------------------------
            Time Complexity = O(n/2)  => O(n)
            Space Complexit = O(n/2)  => O(n)
    ------------------------------------------------------------------------------------------*/
    public void reverseString(char[] s) {
        
        recursion(s, 0, s.length-1);
    }

    public static void recursion(char[] s, int start, int end){
        if(start > end){
            return;
        }

        char temp = s[start];
        s[start] = s[end];
        s[end] = temp;

        recursion(s, start+1, end-1);
    }
}
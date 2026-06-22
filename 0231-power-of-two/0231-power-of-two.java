class Solution {
    // Bit Manipulation.
    // public boolean isPowerOfTwo(int n) {
    //     if(n <= 0) return false;
    //     return (n & (n-1)) == 0;
    // }


    public boolean isPowerOfTwo(int n) {
        if(n <= 0) return false;
        if(n == 1) return true;
        while(n > 1){
            if(n % 2 == 0){
                n = n / 2;
            }else{
                return false;
            }
        }

        return true;
    }
}
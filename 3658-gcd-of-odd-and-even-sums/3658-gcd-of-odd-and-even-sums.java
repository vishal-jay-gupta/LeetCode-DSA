class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumOdd = 0;
        int sumEven = 0;
        int odd = 1;
        int even = 2;

        while(0 < n){
            sumEven += even;
            sumOdd += odd;
            n--;
        }
        return sumEven - sumOdd;
    }
}
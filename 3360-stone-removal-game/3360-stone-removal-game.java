class Solution {
    public boolean canAliceWin(int n) {
        boolean aliceWin = false;
        int prev = 10;
        while(n >= prev){
            n = n - prev;
            prev--;
            if(aliceWin) aliceWin = false;
            else aliceWin = true;
        }

        return aliceWin;
    }
}
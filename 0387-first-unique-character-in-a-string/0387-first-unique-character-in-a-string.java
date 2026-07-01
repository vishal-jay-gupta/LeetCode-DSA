class Solution {
    /*-----------------------------------------------------------------------------
                Time Complexity = O(n^2)
                Space Complexity = O(1)
    ------------------------------------------------------------------------------*/


    // public int firstUniqChar(String s) {
    //     for(int i=0; i<s.length(); i++){
    //         for(int j=0; j<=s.length(); j++){
    //             if(j == s.length()){
    //                 return i;
    //             }
    //             if(i == j) continue;
    //             if(s.charAt(i) == s.charAt(j)) break;
    //         }
    //     }
    //     return -1;
    // }



    /*-----------------------------------------------------------------------------
                Time Complexity = 
                Space Complexity =
    ------------------------------------------------------------------------------*/

    public int firstUniqChar(String s) {
        int[] freq = new int[27];
        // HashMap<String, Integer> hMap = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            int later = s.charAt(i) - 'a';
            freq[later]++;
        }

        for(int i=0; i<27; i++){
            System.out.println(freq[i]);
        }

        for(int i=0; i<s.length(); i++){
            int later = s.charAt(i) - 'a';
            if(freq[later] == 1){
                return i;
            }
        }

        return -1;


    }
}
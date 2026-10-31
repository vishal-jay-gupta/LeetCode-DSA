class Solution {

    // public String longestCommonPrefix(String[] strs) {
    //     Arrays.sort(strs);
    //     // System.out.println(strs[0]);
    //     // System.out.println(strs[1]);
    //     // System.out.println(strs[strs.length-1]);
    //     String first = strs[0];
    //     String last = strs[strs.length-1];
    //     String ans = "";
    //     for(int i=0; i<first.length(); i++){
    //         if(first.charAt(i) != last.charAt(i)){
    //             break;
    //         }
    //         ans += first.charAt(i);
    //     }
    //     return ans;
    // }


    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);

                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }
}

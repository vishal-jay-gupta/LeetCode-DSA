
import java.util.*;

class Solution {

    /*---------------------------------------------------------------------------------------------------------
            Time Complexity = O(n * k log k)
            Space Complexity: O(n × k)
    ----------------------------------------------------------------------------------------------------------*/


    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> hMap = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {

            String curr = strs[i];

            // Sort the string
            char[] temp = curr.toCharArray();  // O(k) -> k = string length
            Arrays.sort(temp);  // sort string O(k log k)

            String key = new String(temp);

            // Create a list if key doesn't exist
            hMap.putIfAbsent(key, new ArrayList<>()); // avarage case O(k)

            // Add the original string to the group
            hMap.get(key).add(curr);   // avarage case O(k)
        }

        List<List<String>> ans = new ArrayList<>();

        for (Map.Entry<String, List<String>> entry : hMap.entrySet()) {//O(g)=>g = number of unique anagram groups.
            ans.add(entry.getValue());
        }

        return ans;
    }
}
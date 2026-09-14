import java.util.*;

class Solution {
    /*-------------------------------------------------------------------------------------------------------
            Time Complexity = O(n^2)
            Space Complexity = O(n)
    -------------------------------------------------------------------------------------------------------*/

    public String removeOccurrences(String s, String part) {
        while(s.contains(part)){
            int index = s.indexOf(part);

            s = s.substring(0, index) + s.substring(index + part.length());
        }

        return s;
    }
}
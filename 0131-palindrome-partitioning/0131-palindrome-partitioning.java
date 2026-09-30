import java.util.*;

class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();

        backtrack(s, 0, new ArrayList<>(), ans);

        return ans;
    }

    public void backtrack(String s, int start,
                          List<String> current,
                          List<List<String>> ans) {

        // All characters are used
        if (start == s.length()) {
            ans.add(new ArrayList<>(current));
            return;
        }

        for (int i = start; i < s.length(); i++) {

            String str = s.substring(start, i + 1);

            // Only choose palindrome substrings
            if (isPalindrome(str)) {

                current.add(str);

                backtrack(s, i + 1, current, ans);

                current.remove(current.size() - 1);
            }
        }
    }

    public boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
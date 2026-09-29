class Solution {
    public List<String> letterCombinations(String digits) {

        List<String> str = new ArrayList<>();
        List<String> ans = new ArrayList<>();

        if (digits.length() == 0) {
            return ans;
        }

        for (char ch : digits.toCharArray()) {

            if (ch == '2') {
                str.add("abc");
            } else if (ch == '3') {
                str.add("def");
            } else if (ch == '4') {
                str.add("ghi");
            } else if (ch == '5') {
                str.add("jkl");
            } else if (ch == '6') {
                str.add("mno");
            } else if (ch == '7') {
                str.add("pqrs");
            } else if (ch == '8') {
                str.add("tuv");
            } else {
                str.add("wxyz");
            }
        }

        findCombination(str, ans, "", 0);

        return ans;
    }

    public void findCombination(
        List<String> str,
        List<String> ans,
        String temp,
        int index
    ) {

        // Base case
        if (index == str.size()) {
            ans.add(temp);
            return;
        }

        String letters = str.get(index);

        for (int i = 0; i < letters.length(); i++) {

            // Choose
            temp += letters.charAt(i);

            // Explore
            findCombination(str, ans, temp, index + 1);

            // Backtrack
            temp = temp.substring(0, temp.length() - 1);
        }
    }
}
import java.util.*;

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();

        recurse(n, 0, 0, "", res);
        return res;
    }

    public static void recurse(int n, int open, int close, String s, List<String> res){
        if(s.length() == n * 2){
           res.add(s);
           return;
        }
        if(open < n){
            recurse(n, open+1, close, s + "(", res);
        }

        if(open > close){
            recurse(n, open, close+1, s + ")", res);
        }
    }
}
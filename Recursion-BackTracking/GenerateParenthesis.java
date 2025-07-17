import java.util.*;
public class GenerateParenthesis {
        public List<String> generateParenthesis(int n) {
          StringBuilder curr = new StringBuilder("");
          List<String> ans = new ArrayList<>();
          generate(n,0,0,curr,ans);
          return ans;
    }

        private void generate(int n, int open, int close, StringBuilder curr, List<String> ans) {
            if (curr.length()== 2*n ) {
                ans.add(curr.toString());
                return;
            }
            if (open<n) {
                curr.append("(");
                generate(n, open+1, close, curr, ans);
                curr.deleteCharAt(curr.length()-1);
            }
            if (close<open) {
                curr.append(")");
                generate(n, open, close+1, curr, ans);
                curr.deleteCharAt(curr.length()-1);
            }
        }

}

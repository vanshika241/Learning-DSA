import java.util.*;

public class PalindromePartioning {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        makePartiton(0,s,new ArrayList<>(),ans);
        return ans;
    }

    private void makePartiton(int idx, String s, ArrayList<String> curr, List<List<String>> ans) {
        if (idx == s.length()) {
            ans.add(new ArrayList<>(curr));
            return;
        }
        for(int i=idx;i<s.length();i++){
            if(isPal(s,idx,i+1)){
            curr.add(s.substring(idx,i+1));
            makePartiton(idx+1, s, curr, ans);
            curr.remove(curr.size()-1);
            }
        }
    }

    private boolean isPal(String s, int start, int end) {
         while (start <end) {
            if (s.charAt(start++) != s.charAt(end--) ) {
                return false;
            }
         }
         return true;
    }

    
}

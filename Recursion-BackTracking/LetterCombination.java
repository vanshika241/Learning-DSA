import java.util.ArrayList;
import java.util.List;

public class LetterCombination {
    public static String[] all = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    
    public void generate(int idx,String digits,String  curr,List<String>  ans ){
        if(idx == digits.length()){
            ans.add(curr.toString());
            return;
        }
        String currletters = all[digits.charAt(idx)-'0'];
        for(char ch : currletters.toCharArray()){
            generate(idx+1,digits,curr+ch,ans);
        }
    }
    public List<String> letterCombinations(String digits) {
         List<String>  ans = new ArrayList<>();
                 if(digits.length() == 0){
            return ans;
                 }
         generate(0,digits,"",ans);
         return ans;
    }
}

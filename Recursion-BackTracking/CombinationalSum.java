import java.util.*;

public class CombinationalSum {

        public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        getCombinatation(0,target,candidates,new ArrayList<>(),ans);
        return ans;
    }
    
        private void getCombinatation(int idx, int target, int[] candidates, ArrayList<Integer> curr,
                List<List<Integer>> ans) {
            if (target == 0) {
                ans.add(new ArrayList<>(curr));
                return ;
            }
            if (target<0) {
                return;
            }
            for(int i=idx;i<candidates.length;i++){
                curr.add(candidates[i]);
                getCombinatation(i, target-candidates[i], candidates, curr, ans);
                curr.remove(curr.size()-1);
            }
        }

}
import java.util.*;

public class CombinationalSum2 {

            public List<List<Integer>> combinationSum2(int[] candidates, int target) {
            Arrays.sort(candidates);
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
            for(int i=idx;i<candidates.length;i++){
                if(i>idx && candidates[i] == candidates[i-1])continue;
                if(target-candidates[i]<0)break;
                curr.add(candidates[i]);
                getCombinatation(i+1, target-candidates[i], candidates, curr, ans);
                curr.remove(curr.size()-1);
            }
        }


}
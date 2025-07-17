import java.util.ArrayList;
import java.util.List;

public class Subset {
    public void generateSubset(int idx , int nums[], ArrayList<Integer>curr,  List<List<Integer>> ans){
        if (idx == nums.length) {
            ans.add(new ArrayList<>(curr));
            return;
        }
        curr.add(nums[idx]);
        generateSubset(idx+1, nums, curr, ans);
        curr.remove(curr.size()-1);
        generateSubset(idx+1, nums, curr, ans);
    }
        public List<List<Integer>> subsets(int[] nums) {
          List<List<Integer>> ans = new ArrayList<>();
          generateSubset(0,nums, new ArrayList<>(),ans);
          return ans;
    }

    public static void main(String[] args) {
        
    }
}

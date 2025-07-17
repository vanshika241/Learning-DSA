import java.util.*;

public class Subset2 {
        public void generateUniqueSubset(int idx, int nums[], ArrayList<Integer> curr, List<List<Integer>> ans){
                ans.add(new ArrayList<>(curr));
                for(int i=idx;i<nums.length;i++){
                    if(i> idx && nums[i]==nums[i-1])continue;
                  curr.add(nums[i]);
                generateUniqueSubset(i+1, nums, curr, ans);
                curr.remove(curr.size()-1);
                }
                
            
        }
        public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        generateUniqueSubset(0, nums, new ArrayList<>(), ans);
        return ans;

    }

}

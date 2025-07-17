import java.util.*;

public class Permutations {
        public List<List<Integer>> permute(int[] nums) {
        boolean used[] = new boolean[nums.length];
        List<List<Integer>> ans = new ArrayList<>();
        generatePermuations(used,nums,new ArrayList<>(),ans);
        return ans;
    }

        private void generatePermuations(boolean[] used, int[] nums, ArrayList<Integer> curr, List<List<Integer>> ans) {
            if (curr.size() == nums.length ) {
                ans.add(new ArrayList<>(curr));
                return;
            }
            for(int i=0;i<nums.length;i++){
                if (used[i] == false) {
                    curr.add(nums[i]);
                    used[i] = true;
                    generatePermuations(used, nums, curr, ans);
                    used[i] = false;
                    curr.remove(curr.size()-1);
                }
            }
        }

}

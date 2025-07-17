import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Permuations2 {
    public List<List<Integer>> permuteUnique(int[] nums) {
        boolean used[] = new boolean[nums.length];
        HashSet<List<Integer>> s = new HashSet<>();
        generatePermuations(used,nums,new ArrayList<>(),s);
        List<List<Integer>> ans = new ArrayList<>(s);
        return ans;
    }

        private void generatePermuations(boolean[] used, int[] nums, ArrayList<Integer> curr, HashSet<List<Integer>> s) {
            if (curr.size() == nums.length ) {
                s.add(new ArrayList<>(curr));
                return;
            }
            for(int i=0;i<nums.length;i++){
                if (used[i] == false) {
                    curr.add(nums[i]);
                    used[i] = true;
                    generatePermuations(used, nums, curr, s);
                    used[i] = false;
                    curr.remove(curr.size()-1);
                }
            
        }
        }
}

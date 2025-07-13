public class MaxConsecutiveOnes {
     public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int zeros = 0;
        int i=0;
        int j=0;
        int maxlen = 0;
        while (j<n) {
            if (nums[j] == 0) {
                zeros++;
            }
            while (zeros>k) {
                if (nums[i] == 0) {
                    zeros--;
                }
                i++;

            }

            maxlen = Math.max(j-i+1, maxlen);
            j++;
        }
        return maxlen;
    }

}

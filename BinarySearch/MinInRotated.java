public class MinInRotated {
        public int findMin(int[] nums) {
           int n = nums.length;
           int start = 0;
           int end = n-1;
           int ans = nums[0];
           if (n == 0) {
            return 0;
           }
           if (nums[start]<nums[end]) {
            return nums[0];
           }
           while (start<=end) {
              int mid = start+(end-start)/2;
              
                 if (nums[mid]>=nums[0]) {
                    start = mid+1;
                 }
                 else if(nums[mid]<nums[0]){
                    ans = nums[mid];
                    end = mid-1;
                 }
              
           }
           return ans;
            
        }
}

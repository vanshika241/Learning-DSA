public class Occurrence {
        public int findFirst(int nums[], int target){
          int n = nums.length;
          int start = 0;
          int end = n-1;
          int ans = -1;
          while (start<=end) {
            int mid = start+(end-start)/2;
            if (nums[mid] == target) {
                ans =  mid;
                end = mid-1;
            }
            else if(nums[mid]>target){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
          }
          return ans;

    }

        public int findLast(int nums[], int target){
          int n = nums.length;
          int start = 0;
          int end = n-1;
          int ans = -1;
          while (start<=end) {
            int mid = start+(end-start)/2;
            if (nums[mid] == target) {
                ans =  mid;
                start = mid+1;
            }
            else if(nums[mid]>target){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
          }
          return ans;

    }
    int countFreq(int[] arr, int target) {
      int ans1 = findFirst(arr, target);
      int ans2 = findLast(arr, target);
      if (ans1 == -1 || ans2 == -1) {
        return 0;
      }
      return ans2-ans1+1;
    }
    public static void main(String[] args) {
        
    }
}

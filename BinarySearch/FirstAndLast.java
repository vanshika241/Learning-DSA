import java.util.ArrayList;

public class FirstAndLast {
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

    public ArrayList<Integer> find(int arr[], int x) {
         ArrayList<Integer> ans = new ArrayList<>();
         ans.add(findFirst(arr, x));
         ans.add(findLast(arr, x));
         return ans;
    }

}

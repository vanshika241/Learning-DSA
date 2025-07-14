public class KokoEatingBananas {
       public boolean isValid(int arr[], int mid, int h ){
         int n = arr.length;
         int hours = 0;
         for(int i=0;i<n;i++){
            hours += (arr[i]+mid-1)/mid;
         }
         return (h<hours)?false:true;
       }
        public int minEatingSpeed(int[] arr, int h) {
          int start = 1;
          int end = arr[0];
          int ans = -1;
          for(int num:arr)end = Math.max(num, end);
          while (start<=end) {
            int mid = start+(end-start)/2;
            if (isValid(arr,mid,h)) {
                ans = mid;
                end = mid-1;
            }
            else{
                start = mid+1;
            }
          }
          return ans;
        }
}

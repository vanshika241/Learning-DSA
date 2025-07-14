public class BookAllocation {

       public static boolean isValid(int arr[], int k , int mid){
        int n = arr.length;
        int s = 1;
        int sum = 0;
        for(int i=0;i<n;i++){
            sum += arr[i];
            if (sum>mid) {
                s++;
                sum = arr[i];
            }
        }
        return (s >k) ? false:true;
       }
        public static int findPages(int[] arr, int k) {
          int n = arr.length;
          int start = 0;
          int end = 0;
          int ans = -1;
          if (k>n) {
            return -1;
          }
          for(int num:arr){
            start = Math.max(num, start);
            end += num;
          }
           while (start<=end) {
            int mid = start+(end-start)/2;
            if (isValid(arr,k,mid)) {
                ans = mid;
                end = mid-1;
            }
            else{
                start  =mid+1;
            }
           }

           return ans;

        }
}

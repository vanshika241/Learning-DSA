public class MaxCircularSubarray {
        public int getMaxSubarray(int arr[]){
        int maxSum = arr[0];
        int sum = arr[0];
        int n = arr.length;
        for(int i=0;i<n;i++){
            sum = Math.max(sum+arr[i],arr[i]);
            maxSum = Math.max(maxSum,sum);
        }
        return maxSum;
            
        }

        public int getMinSubarray(int arr[]){
        int minSum = arr[0];
        int sum = arr[0];
        int n = arr.length;
        for(int i=0;i<n;i++){
            sum = Math.min(sum+arr[i],arr[i]);
            minSum = Math.min(minSum,sum);
        }
        return minSum;
            
        }
        public int circularSubarraySum(int arr[]) {
           int tsum = 0;
           for(int num :  arr )tsum += num;
           int minSum = getMinSubarray(arr);
           int maxSum = getMaxSubarray(arr);
           int cirSum = tsum-minSum;
           if (maxSum<0) {
            return maxSum;
           }
           return Math.max(cirSum, maxSum);
        }
}

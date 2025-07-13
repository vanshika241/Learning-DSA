public class KadanesAlgo{
        int maxSubarraySum(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        int n = arr.length;
        for(int i=0;i<n;i++){
            sum = Math.max(sum+arr[i],arr[i]);
            maxSum = Math.max(maxSum,sum);
        }
        return maxSum;
    }

}

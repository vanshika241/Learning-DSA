import java.util.Arrays;

public class MinimizeHeights {
        int getMinDiff(int[] arr, int k) {
             int n = arr.length;
             Arrays.sort(arr);
             int max = arr[n-1];
             int min = arr[0];
             int res = max-min;
             for(int i=1;i<n;i++){
                min = Math.min(arr[0]+k, arr[i+1]-k);
                max = Math.max(arr[n-1]-k, arr[i-1]+k);
                if (min<0) {
                    continue;
                }
                res = Math.min(res, max-min);
             }
             return res;
        }
}

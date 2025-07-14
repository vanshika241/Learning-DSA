package TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumPairCloset {
        public List<Integer> sumClosest(int[] arr, int target) {
        // code here
        List<Integer>  ans = new ArrayList<>();
        Arrays.sort(arr);
        int a = -1;
        int b = -1;
        int n = arr.length;
        int i=0;
        int j = n-1;
        int mini = Integer.MAX_VALUE;
        while(i<j){
            int curr = Math.abs(target-arr[i]-arr[j]);
            if(curr<mini ){
                mini = curr;
                a = arr[i];
                b = arr[j];
            }
            else if(curr == mini){
                if(b-a < arr[j]-arr[i]){
                    a = arr[i];
                    b = arr[j];
                }
            }
            if(arr[i]+arr[j]<=target){
                i++;
            }
            else{
                j--;
            }
        }
        if(a != -1 && b != -1){
            ans.add(a);
            ans.add(b);
           
        }
         return ans;
    }

}

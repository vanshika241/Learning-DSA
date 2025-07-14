package TwoPointers;

import java.util.Arrays;

public class CountPairs {
        int countPairs(int arr[], int target) {
        Arrays.sort(arr);
        int n = arr.length;
        int i=0;
        int j = n-1;
        int cnt = 0;
        while(i<j){
            if(arr[i]+arr[j]<target){
                cnt += j-i;
                i++;
            }
            else{
                j--;
            }
        }
        return cnt;
    }

}

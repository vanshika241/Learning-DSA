import java.util.*;

public class SplitSubarray {

        public List<Integer> findSplit(int[] arr) {
          List<Integer> ans = new ArrayList<>();
          int n = arr.length;
          int tsum = 0;
          for(int num:arr){
            tsum += num;
          }
          if (tsum % 3 != 0){
            return new ArrayList<>(Arrays.asList(-1,-1));
          }
          int target = tsum/3;
          int sum = 0;
          int cnt = 0;
          for(int i=0;i<n;i++){
            sum += arr[i];
            if (sum == target) {
                ans.add(i);
                cnt++;
                sum = 0;
                if (cnt==2 && i<n-1) {
                    return ans;
                }
            }
          }
          return ans;
        }
}
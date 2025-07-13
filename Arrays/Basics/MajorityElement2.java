import java.util.*;

public class MajorityElement2 {
        public ArrayList<Integer> findMajority(int[] arr) {
         int n = arr.length;
         int cnt1= 0;
         int cnt2 = 0;
         int el1 = Integer.MIN_VALUE;
         int el2 = Integer.MIN_VALUE;
         for(int i=0;i<n;i++){
            if (cnt1 == 0 && el2 != arr[i]) {
                cnt1 = 1;
                el1 = arr[i];
            }
            else if (cnt2 == 0 && el1 != arr[i]) {
                cnt2 = 1;
                el2 = arr[i];
            }
            else if (el1 == arr[i]) {
                cnt1 += 1;
            }
            else if (el2 == arr[i]) {
                cnt2 += 1;
            }
            else{
                cnt1--;
                cnt2--;
            }

         }

         cnt1 = 0;
         cnt2 = 0;
         for(int i=0;i<n;i++){
            if(arr[i] == el1)cnt1++;
            if(arr[i] == el2)cnt2++;
         }
         ArrayList<Integer> ans = new ArrayList<>();
         if (cnt1 >n/3) {
            ans.add(el1);
         }
         if (cnt2 > n/3) {
            ans.add(el2);
         }
         Collections.sort(ans);
         return ans;
         
    }

}

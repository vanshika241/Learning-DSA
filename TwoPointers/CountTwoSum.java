package TwoPointers;

public class CountTwoSum {
        int countPairs(int arr[], int target) {
        // Complete the function
        int n = arr.length;
        int cnt = 0;
        int i=0;
        int j = n-1;
        while(i<j){
            int sum = arr[i]+arr[j];
            if(sum == target){
                if(arr[i] == arr[j]){
                    int len = j-i+1;
                    cnt += (len*(len-1))/2;
                    break;
                }
                else{
                    int lc = 1;
                    int rc = 1;
                    while(i+1<j && arr[i] == arr[i+1]){
                        lc++;
                        i++;
                    }
                     while(j-1>i && arr[j] == arr[j-1]){
                        rc++;
                        j--;
                    }
                    cnt += lc*rc;
                }
                i++;
                j--;
            }
            else if(sum<target){
                i++;
            }
            else{
                j--;
            }
            
        }
        return cnt;
    }

}

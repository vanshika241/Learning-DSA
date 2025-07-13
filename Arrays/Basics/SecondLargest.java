public class SecondLargest {
    public int getSecondLargest(int[] arr) {
       int n = arr.length;
       int max = arr[0];
       int smax = -1;
       for(int i=1;i<n;i++){
        if (arr[i]>max) {
            smax = max;
            max = arr[i];
        }
        else if(arr[i]<max && arr[i]>smax){
            smax = arr[i];
        }
       }
       return smax;
    }
}

public class ReverseArray{

        public void reverseArray(int arr[]) {
           // inplace 
           //arr traverse  - half 
           //swap fisrt and last 
           int n = arr.length;
           for(int i=0;i<n/2;i++){
            int temp = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-1-i] = temp;
           }
           
        }
}
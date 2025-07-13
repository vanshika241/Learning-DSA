public class NextPermutation {
        void rev(int arr[], int i, int j){
        while(i<j){
            int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
        }
    }
    void nextPermutation(int[] arr) {
        // code here
        int pivot = -1;
        int n = arr.length;
        for(int i=n-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                pivot = i;
                break;
            }
        }
        if(pivot == -1){
            rev(arr,0,n-1);
            return;
        }
        
        for(int i=n-1;i>=pivot;i--){
            if(arr[i]>arr[pivot]){
                int temp = arr[i];
                arr[i] = arr[pivot];
                arr[pivot] = temp;
                break;
            }
        }
        
        rev(arr,pivot+1,n-1);
        
        
    }

}

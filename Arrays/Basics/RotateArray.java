public class RotateArray {
        static void rev(int arr[], int i, int j){
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        i++;
        j--;
        }
    }
    static void rotateArr(int arr[], int d) {
        int n = arr.length;
        d = d%n;
        if(d == 0)return;
        rev(arr,0,d-1);
        rev(arr,d,n-1);
        rev(arr,0,n-1);
        
        
    }

}

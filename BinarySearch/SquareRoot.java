public class SquareRoot {
        public int mySqrt(int x) {
        int start = 1;
        int end = x;
        int ans = 0;
        while (start<=end) {
            int mid = start+(end-start)/2;
            if (mid == x/mid) {
                ans =  mid;
                break;
            }
            else if (mid>x/mid) {
                end = mid-1;
            }
            else{
                ans = mid;
                start = mid+1;
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        
    }
}

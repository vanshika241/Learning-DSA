import java.util.Arrays;

public class FibonacciNumber{
    public int fibRecursive(int n){
        if(n == 0)return 0;
        if (n== 1)return 1;
        return fibRecursive(n-1)+fibRecursive(n-2);
    }

    public int fibMemo(int n, int dp[]){
        if(n == 0)return 0;
        if (n== 1)return 1;
        if (dp[n] != -1) { // calculated already
            return dp[n];
        }
        return dp[n] = fibMemo(n-1,dp) + fibMemo(n-2,dp);
    }
        public int fib(int n) {
        int dp[] = new int[n+1];
        Arrays.fill(dp, -1);
        return fibMemo(n,dp);
        }
    public static void main(String[] args) {

    }
}

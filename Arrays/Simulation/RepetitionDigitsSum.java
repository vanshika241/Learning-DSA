public class RepetitionDigitsSum {
        public int singleDigit(int n) {
            int sum = 0;
          while (n>=10) {
            while (n>0) {
                sum += n%10;
                n/=10;
            }
            n = sum;
          }
          return n;
        }

}

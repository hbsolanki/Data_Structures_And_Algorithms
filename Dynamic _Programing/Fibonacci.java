class Fibonacci {

    public static int memoization(int n, int f[]) {
        if (n == 0 || n == 1) {
            return n;
        }
        if (f[n] == 0) {
            f[n] = memoization(n - 1, f) + memoization(n - 2, f);
        }
        return f[n];
    }
    
    public static int tabulation(int n) {
        int dp[] = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i < n + 1; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }


        return dp[n];
    }
    public static void main(String[] args) {
        System.out.println(memoization(6, new int[7]));
        System.out.println(tabulation(6));
    }
}
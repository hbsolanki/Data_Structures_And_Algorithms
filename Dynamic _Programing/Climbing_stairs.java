// Count Ways to reach the nth stair. The person can climb either 1 stair  or 2 stair at a time 

class Climbing_stairs {
    
    public static int memoization(int n, int ways[]) {
        if (n == 0) {
            return 1;
        }

        if (n < 0) {
            return 0;
        }
       
        if (ways[n] == -1) {
            ways[n] = memoization(n - 1, ways) + memoization(n - 2, ways);
        }

        return ways[n];
    }
    
    public static int tabulation(int n) {
        int dp[] = new int[n + 1];
        dp[0] = 1;

        for (int i = 1; i < n + 1; i++) {
            
        }


        return dp[n];
    }

    public static void main(String[] args) {
        int n=4;
        int ways[] = new int[n + 1];
        for(int i=0;i<n+1;i++){
            ways[i]=-1;
        }
        System.out.println(memoization(4, ways));
        System.out.println(tabulation(6));
    }
}

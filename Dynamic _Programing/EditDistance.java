import java.util.*;

class EditDistance {

    public static int editDistance(String str1,String str2){
        int n = str1.length();
        int m = str2.length();

        int dp[][]=new int[n+1][m+1];

        //initialization
        for(int i=0;i<n+1;i++){
            dp[i][0]=i;
        }
        for(int j=0;j<n+1;j++){
            dp[0][j]=j;
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                if (str1.charAt(i) == str2.charAt(j)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    int add = dp[i][j - 1];
                    int remove = dp[i - 1][j];
                    int replace = dp[i - 1][j - 1];

                    dp[i][j] = Math.min(add, Math.max(remove, replace));
                }
            }
        }
        
        return dp[n][m];
    }
    
    public static void main(String[] args) {
        String str1 = "ABCD";
        String str2 = "BDAD";

        System.out.println(editDistance(str1, str2) );
    }
}

package Algorithm;

/**
 * Created by deepak on 3/7/17.
 */
public class MCMDP {
    public static void main(String[] args) {

        int dims[] = {10,20,30,40,50,60};
        int n = dims.length;
        int[][] dp = new int[n][n];
        for (int i = 0; i < n; i++){
            dp[i][i] = 0;
        }

        for (int L=2; L<n; L++)
        {
            for (int i=1; i<n-L+1; i++)
            {
                int j = i+L-1;
                dp[i][j] = Integer.MAX_VALUE;
                for (int k=i; k<=j-1; k++)
                {
                    // q = cost/scalar multiplications
                    int q = dp[i][k] + dp[k+1][j] + dims[i-1]*dims[k]*dims[j];
                    if (q < dp[i][j])
                        dp[i][j] = q;
                }
            }
        }

        System.out.println(dp[1][n-1]);
    }


}

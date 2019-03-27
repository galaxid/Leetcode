class Solution {

    public int numTilings(int N) {
        long[] dp = new long[N+1];
        dp[0] = 1;
        dp[1] = 1;
        if(N>1)dp[2] = 2;
        if(N>2)dp[3] = 5;
        for(int i=4;i<=N;i++)
            dp[i] = (2* dp[i-1] + dp[i-3])%1000000007;
        return (int)dp[N];
    }
}

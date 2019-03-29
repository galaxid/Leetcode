class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        int dp[][]=new int[m+1][n+1];
        if(m==0||n==0)
            return 0;
        if(obstacleGrid[0][0]!=1)
            dp[1][1]=1;
        else dp[1][1]=0;
        for(int i=1;i<=m;i++)
            for(int j=1;j<=n;j++){
                if(i==1&&j==1)continue;
                 if(obstacleGrid[i-1][j-1]!=1)
                    dp[i][j]=dp[i][j-1]+dp[i-1][j];
                 else dp[i][j]=0;
            }               
        return dp[m][n];
        
    }
}

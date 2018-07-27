class Solution {
    public boolean PredictTheWinner(int[] nums) {
        int n=nums.length;
        int [][]dp=new int[n][n];
        for (int i=0;i<n;i++) dp[i][i]=nums[i];
        int len=n-1;
        while(len>0){
            for(int i=0,j=i+n-len;i<len;i++,j++){
                dp[i][j]=Math.max(nums[i]-dp[i+1][j],nums[j]-dp[i][j-1]);
            }
            len--;
        }
        return (dp[0][n-1]>=0);
    }
}
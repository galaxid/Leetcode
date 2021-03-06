class Solution {
    public int numTrees(int n) {
        int[]ans=new int[n+3];
        ans[0]=1;
        ans[1]=1;
        ans[2]=2;
        for(int i=3;i<=n;i++){
            for(int j=0;j<i;j++) ans[i]+=ans[j]*ans[i-j-1];
        }
        return ans[n];
    }
}
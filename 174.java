class Solution {
    public int calculateMinimumHP(int[][] dungeon) {
        int[][]ans=new int[dungeon.length+1][dungeon[0].length+1];
        for(int i=0;i<=dungeon[0].length;i++)ans[dungeon.length][i]=Integer.MAX_VALUE;
        for(int i=0;i<=dungeon.length;i++)ans[i][dungeon[0].length]=Integer.MAX_VALUE;
        ans[dungeon.length][dungeon[0].length-1]=1;
        ans[dungeon.length-1][dungeon[0].length]=1;
        for(int i=dungeon[0].length-1;i>=0;i--)
            for(int j=dungeon.length-1;j>=0;j--){
                int a=(dungeon[j][i]*(-1))+Math.min(ans[j+1][i],ans[j][i+1]);
                ans[j][i]=Math.max(a,1);
            }
        return ans[0][0];
    }
}
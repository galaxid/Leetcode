class Solution {
    public int maximalRectangle(char[][] matrix) {
        int[][]ans=new int[matrix.length][matrix[0].length];
        for(int i=0;i<ans.length;i++)
            for(int j=ans[0].length-1;j>=0;j--){
                if(matrix[i][j]=='1'){
                    if(j==ans[0].length-1||matrix[i][j+1]=='0') ans[i][j]=1;
                    else ans[i][j]=ans[i][j+1]+1;
                }
            }
        int max=0;
        for(int j=0;j<ans[0].length;j++){
            int len=Integer.MAX_VALUE;
            int line=1;
            int cur=0;
            for(int i=0;i<ans.length;i++){ 
                if(ans[i][j]>0){
                    len=Math.min(len,ans[i][j]);
                    cur=line*len;
                    line++;
                }
                else if(cur!=Integer.MAX_VALUE){
                    max=Math.max(max,cur);
                    line=1;
                }
            }
        }
        return max;
    }
}
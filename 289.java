class Solution {
    public void gameOfLife(int[][] board) {
        int m = board.length;
        if(m==0)return;
        int n = board[0].length;
        if(n==0)return;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int num =0;
                for(int a=-1;a<2;a++){
                  for(int b=-1;b<2;b++){
                      if(a==0&&b==0||i+a<0||j+b<0||i+a==m||j+b==n) continue;
                      if(board[i+a][j+b]%2==1)num++;
                  }
                }
                if((num<2||num>3)&&board[i][j]==1)board[i][j]=1;
                else if(board[i][j]==1)board[i][j]=3;
                else if(num==3)board[i][j]=2;
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]>1)board[i][j]=1;
                else board[i][j]=0;
            }
        }
    }
}
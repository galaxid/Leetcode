class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        if(m==0) return false;
        int n = matrix[0].length;
        if(n==0 )return false;   //  [[]]
        if(matrix[0][0]>target||matrix[m-1][n-1]<target){
            return false;
        }
        int i=m-1,j=0;
        while(i>=0&&j<n){
            int val = matrix[i][j];
            if(target>val) j++;
            else if(target<val) i--;
            else return true;
        }
        return false;
    }
}
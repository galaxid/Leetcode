class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int [][]order ={{0,1},{1,0},{0,-1},{-1,0}};
        List<Integer> ans= new ArrayList<>();
        int m=matrix.length;
        if(m==0) return ans;
        int n=matrix[0].length;
        int i=0,j=-1,k=0;           //not int i=0,j=0,k=0;
        while(true){
            int step=(k%2==0?n:m);
            step -=(k+1)/2;
            if(step==0)break;
            for(int l=0;l<step;l++){
                i+=order[k%4][0];
                j+=order[k%4][1];
                ans.add(matrix[i][j]); //must be here
            }
            k++;
        }
        return ans;
    }
}


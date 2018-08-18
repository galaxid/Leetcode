class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        Stack<int[]>stack=new Stack<>();
        int[]start={sr,sc};
        int oldcolor=image[sr][sc];
        image[sr][sc]=newColor;
        if(oldcolor==newColor)return image;
        stack.push(start);
        while(!stack.empty()){
            int i=stack.peek()[0],j=stack.peek()[1];
            stack.pop();
            if(i-1>=0&&image[i-1][j]==oldcolor){
                image[i-1][j]=newColor;
                int[]cur={i-1,j};
                stack.push(cur);               
            }
            if(j-1>=0&&image[i][j-1]==oldcolor){
                image[i][j-1]=newColor;
                int[]cur={i,j-1};
                stack.push(cur);               
            }
            if(i+1<image.length&&image[i+1][j]==oldcolor){
                image[i+1][j]=newColor;
                int[]cur={i+1,j};
                stack.push(cur);               
            }
            if(j+1<image[0].length&&image[i][j+1]==oldcolor){
                image[i][j+1]=newColor;
                int[]cur={i,j+1};
                stack.push(cur);               
            }
        }
        return image;
    }
}
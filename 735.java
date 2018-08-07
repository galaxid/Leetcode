class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        int n=asteroids.length;
        for(int i=0;i<asteroids.length;i++){
            if(stack.empty()||stack.peek()*asteroids[i]>0||stack.peek()<0&&asteroids[i]>0)stack.push(asteroids[i]);
            else if(stack.peek()+asteroids[i]==0) {stack.pop();n-=2;}
            else if(stack.peek()+asteroids[i]<0) {stack.pop();n--;i--;}
            else n--;
        }
        int[]ans=new int[n];
        while(!stack.empty()){
            ans[n-1]=stack.pop();
            n--;
        }
        return ans;
    }
}
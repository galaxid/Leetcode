class Solution {
    public int[] exclusiveTime(int n, List<String> logs) {
        int []ans=new int[n];
        Stack<Integer>stack=new Stack();
        int[]cur=helper(logs.get(0));
        stack.push(cur[0]);
        for(int i=1;i<logs.size();i++){
            int[]cur1=helper(logs.get(i-1));
            int[]cur2=helper(logs.get(i));
            if(cur1[1]+cur2[1]==0){
                ans[cur1[0]]+=(cur2[2]-cur1[2]);
            }
            else if(cur1[1]+cur2[1]==2){
                ans[cur2[0]]+=(cur2[2]-cur1[2]);
            }
            else if(cur1[1]==0){
                ans[cur1[0]]+=(cur2[2]-cur1[2]+1);
            }
            else if(cur2[2]-cur1[2]>1){
                ans[stack.peek()]+=(cur2[2]-cur1[2]-1);
            }
            if(cur2[1]==0)stack.push(cur2[0]);
            else stack.pop();
        }
        return ans;
    }
    public int[] helper(String str){
        int []ans=new int[3];
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==':'&&i<4){
                ans[0]=Integer.valueOf(str.substring(0,i));
                ans[1]=(str.charAt(i+1)=='s')?0:1;
            }
            else if(str.charAt(i)==':'){
                ans[2]=Integer.valueOf(str.substring(i+1));
                break;
            }                   
        }
        return ans;
    }
}
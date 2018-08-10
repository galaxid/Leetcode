class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer>stack = new Stack<>();
        for(String i:tokens){
            switch(i.charAt(0)){
                case '+':{
                    int a=stack.pop();
                    int b=stack.pop();
                    stack.push(a+b);
                    break;
                }
                case '*':{
                    int a=stack.pop();
                    int b=stack.pop();
                    stack.push(a*b);
                    break;
                }
                 case '/':{
                    int a=stack.pop();
                    int b=stack.pop();
                    stack.push(b/a);
                    break;
                }
                case '-':{
                    if(i.length()==1){
                        int a=stack.pop();
                        int b=stack.pop();  
                        stack.push(b-a);
                    }
                    else stack.push(Integer.valueOf(i));
                    break;
                }
                default:{
                    stack.push(Integer.valueOf(i));
                }
                    
            }
        }
        return stack.pop();
    }
}
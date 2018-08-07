class Solution {
    public int calculate(String s) {
        Queue<String> stack1 = new LinkedList<>();
        Stack<Character> stack2 = new Stack<>();
        Stack<Integer> stack3 = new Stack<>();
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)-'0'<=9&&s.charAt(i)-'0'>=0){
                String cur="";
                while(i>=0&&s.charAt(i)-'0'<=9&&s.charAt(i)-'0'>=0){
                    cur=s.charAt(i)+cur;
                    i--;
                }
                i++;
                stack1.offer(cur);
            }
            else if(s.charAt(i)==')'||s.charAt(i)=='+'||s.charAt(i)=='-')stack2.push(s.charAt(i));
            else if(s.charAt(i)=='('){
                while(stack2.peek()!=')') stack1.offer(""+stack2.pop());
                stack2.pop();
            }      
        }
        while(!stack2.empty()) stack1.offer(""+stack2.pop());
        while(stack1.peek()!=null){
            if(stack1.peek().charAt(0)-'0'<=9&&stack1.peek().charAt(0)-'0'>=0)stack3.push(Integer.valueOf(stack1.poll()));
            else if(stack1.peek().charAt(0)=='+'){
                int a=stack3.pop();
                a+=stack3.pop();
                stack3.push(a);
                stack1.poll();
            }
            else if(stack1.peek().charAt(0)=='-'){
                int a=stack3.pop();
                a-=stack3.pop();
                stack3.push(a);
                stack1.poll();
            }
        } 
        return stack3.pop();
    }
}

/*class Solution {
    public int calculate(String s) {
        Queue<Character> stack1 = new LinkedList<>();
        Stack<Character> stack2 = new Stack<>();
        Stack<Integer> stack3 = new Stack<>();
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)-'0'<=9&&s.charAt(i)-'0'>=0) stack1.offer(s.charAt(i));
            if(s.charAt(i)==')'||s.charAt(i)=='+'||s.charAt(i)=='-')stack2.push(s.charAt(i));
            if(s.charAt(i)=='('){
                while(stack2.peek()!=')') stack1.offer(stack2.pop());
                stack2.pop();
            }      
        }
        while(!stack2.empty()) stack1.offer(stack2.pop());
        while(stack1.peek()!=null){
            if(stack1.peek()-'0'<=9&&stack1.peek()-'0'>=0)stack3.push(stack1.poll()-'0');
            else if(stack1.peek()=='+'){
                int a=stack3.pop();
                a+=stack3.pop();
                stack3.push(a);
                stack1.poll();
            }
            else if(stack1.peek()=='-'){
                int a=stack3.pop();
                a-=stack3.pop();
                stack3.push(a);
                stack1.poll();
            }
        } 
        return stack3.pop();
    }
}*/
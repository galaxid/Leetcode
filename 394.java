import java.util.*;
class Solution {
public String decodeString(String s) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<String> stack2 = new Stack<>();
        int count=0;
        String temp="";
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                count=count*10+(s.charAt(i)-'0');
            }
            else if(s.charAt(i)=='['){
                stack1.push(count);
                count=0;
                stack2.push(temp);
                temp="";
            } 
            else if(s.charAt(i)==']'){
                int a=stack1.pop();
                for(int j=0;j<a;j++){
                    String top=stack2.pop();
                    top+=temp;
                    stack2.push(top);               
                } 
                temp=stack2.pop();
            }
            else temp+=s.charAt(i);
        }
        if(!stack2.empty())
            return stack2.pop();
        return temp;
    }
};

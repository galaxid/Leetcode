import java.util.*;  //long long way to go...... 
@SuppressWarnings("unchecked")
class Solution {
    public String removeDuplicateLetters(String s) {
       String ans="";
       if(s.equals(ans))return ans; //important
       ArrayList[] ar = new ArrayList[26];
       for(int i=0;i<26;i++) ar[i] = new ArrayList<Integer>();//? ? ?
       for(int i=0;i<s.length();i++) ar[s.charAt(i)-'a'].add(i);
       int flag=1;
       int i=0;
       while(flag>0){
         for(;ar[i].size()==0;i++);
         int j;
         for(j=i+1;j<26;j++){
           if(ar[j].size()>0){
             int a=Integer.parseInt(ar[j].get(ar[j].size()-1).toString());//? ? ?
             int b=Integer.parseInt(ar[i].get(0).toString());
             if(a<b) break;
           }
         }
         if(j==26){
           for(int k=0;k<26;k++)
            while(ar[k].size()>0){
              int a=Integer.parseInt(ar[k].get(0).toString());
              int b=Integer.parseInt(ar[i].get(0).toString());
              if(a<b)ar[k].remove(0);
              else break;
            }
           ar[i].clear();                         //important
           char letter='a';
           letter+=i;
           ans=ans + letter; 
           i=0;
         }
         else i++;
         flag=0;
         for(j=0;j<26;j++) flag+=ar[j].size();
       }
	return ans;        
    }
   
}

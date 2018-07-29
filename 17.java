class Solution {
    char[][] letter={{},{},{'a','b','c'},{'d','e','f'},{'g','h','i'},{'j','k','l'},{'m','n','o'},{'p','q','r','s'},{'t','u','v'},{'w','x','y','z'}};
    int[] num={0,0,3,3,3,3,3,4,3,4};
    List<String> ans=new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        int n=digits.length();
        if(n==0)  return ans;
        char[] cur=new char[n];
        Helper(0,cur,n,digits);
        return ans;
        
    }
    public void Helper(int a,char[] cur,int n,String digits){
         if(a==n){
            ans.add(String.copyValueOf(cur));
            return;
        }
        for(int i=0;i<num[digits.charAt(a)-'0'];i++){
            cur[a]=letter[digits.charAt(a)-'0'][i];
            Helper(a+1,cur,n,digits);
        }       
    }
}
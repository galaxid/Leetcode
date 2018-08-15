class Solution {
    Set<List<Integer>> list=new HashSet<>();
    public List<List<Integer>> palindromePairs(String[] words) {
        List<List<Integer>>ans= new ArrayList<>();
        for(int i=0;i<words.length;i++)
             for(int j=0;j<words.length;j++){
                 if(helper(i,j,words[i],words[j])){
                     List<Integer>cur= new ArrayList<>();
                     cur.add(i);
                     cur.add(j);
                     ans.add(cur);
                     list.add(cur);
                 }
             }
        return ans;
    }
    public boolean helper(int a,int b,String word1,String word2){
        if(b==a)return false;
        List<Integer>cur= new ArrayList<>();
        cur.add(b);
        cur.add(a);
        if(list.contains(cur)&&word1.length()==word2.length()) return true;
        String word=word1+word2;
           /* if(word.length()==1) return true;                     
            if(word.length()%2!=0)return false;*/          
        if(ispal(word))return true;
        return false;
    }
    public boolean ispal(String word){
        int i=0,j=word.length()-1;
        while(i<=j){
            if(word.charAt(i)!=word.charAt(j))return false;
            i++;j--;
        }
        return true;
    }
}
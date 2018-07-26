class Solution {
    public String crackSafe(int n, int k) {
        String ans="";
        for(int i=0;i<n;i++) ans+='0';
        Set<String> a=new HashSet<>();
        a.add(ans);
        int pow=1;
        for(int i=0;i<n;i++)pow*=k;
        for (int i=0;i<pow;i++) {
            String pre = ans.substring(ans.length()-n+1);
            for (int j=k-1;j>=0;j--) {
                String cur=pre+j;
                if (a.contains(cur)==false) {
                    a.add(cur);
                    ans += j;
                    break;
                }
            }
        }
        return ans;
    }
}
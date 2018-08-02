class Solution {
    public int titleToNumber(String s) {
        int ans=0,a=1;
        for(int i=s.length()-1;i>=0;i--){
            ans+=(s.charAt(i)-'A'+1)*a;
            a*=26;
        }
        return ans;
    }
}
class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n=s.length();
        if(n<=1) return false;
        for(int i=2;i<=n;i++){
            int len=n/i;
            if(n%i==0){
                int flag=1;
                for(int j=1;j<i;j++){
                    String str1=s.substring((j-1)*len,j*len);
                    String str2=s.substring(j*len,(j+1)*len);
                    if(!str1.equals(str2))flag=0;
                }
                if(flag==1)return true;
            }
        }
        return false;
    }
}
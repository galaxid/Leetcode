class Solution {
    public String addBinary(String a, String b) {
        int la=a.length();
        int lb=b.length();
        char[]aa,bb;
        if(lb>la){
            la=lb;
            lb=a.length();
            aa=b.toCharArray();
            bb=a.toCharArray();
        }
        else{
            aa=a.toCharArray();
            bb=b.toCharArray();
        }
        int inc=0;
        for(int i=la-1;i>=0;i--){
            int j=i-la+lb;
            int cur=0;
            if(j>=0) cur+=bb[j]-'0';
            cur=cur+aa[i]-'0'+inc;
            inc=0;
            if(cur>=2)inc=1;
            aa[i]=(char)('0'+cur%2);
        }
        String ans =String.copyValueOf(aa);
        if(inc==1) ans="1"+ans;
        return ans;
    }
}
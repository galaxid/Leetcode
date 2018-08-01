class Solution {  //long "1 2147483647 2147483648"
    int len;
    public boolean isAdditiveNumber(String num) {
        len=num.length();
        return Helper(num,1,0,0,1);
    }
    public boolean Helper(String num,int n,long a,long b,int d){
        boolean ans=false;
        if(num.equals("")&&n>3)return true;           //&&n>3 111  
        int range=(n<=3)?len/2:d+1;          //num.length()/3 ||n==3 199111992
        if(range>num.length())range=num.length();
        if(n==2) d=1;                             // 199111992
        for(int i=d;i<=range;i++){
            String cur=num.substring(0,i);
            if(num.charAt(0)=='0'&&i>1)continue;                             //1203  101
            long c= Long.parseLong(cur);
            if(n==1) b=c;
            else if(n>2&&c!=a+b)continue;
            ans|=Helper(num.substring(i),n+1,b,c,i);
            if(ans)break;
        }
        return ans;
    }
}
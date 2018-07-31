class Solution {
    public int numDecodings(String s) {
        int n=s.length();
        if(n==0) return 0;
        int ans[]=new int[n];
        int a=s.charAt(0)-'0';
        if(a>0) ans[0]=1;
        if(n==1) return ans[0];
        int b=s.charAt(1)-'0';
        if(b>0) ans[1]+=ans[0];
        if(a*10+b<=26&&a>0) ans[1]++;
        for(int i=2;i<n;i++){
            a=s.charAt(i-1)-'0';
            b=s.charAt(i)-'0';
            if(b>0) ans[i]+=ans[i-1];
            if((a*10+b<=26)&&a>0) ans[i]+=ans[i-2];         
        }
        return ans[n-1];
    }
}




/*class Solution {
    public int numDecodings(String s) {
        return Helper(s);
    }
    public int Helper(String s){
        if(s.length()==0) return 1;
        int a=s.charAt(0)-'0';
        int ans=0;
        if(a>0){                           //if(a>0)
            ans+=Helper(s.substring(1));        
            if(s.length()>1){  
                int b=a*10+s.charAt(1)-'0';
                if(b<27)
                ans+=Helper(s.substring(2));
            }
        }
        return ans;
    }
}*/
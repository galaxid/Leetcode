class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend==Integer.MIN_VALUE&&divisor==(-1)||divisor==0)return Integer.MAX_VALUE;
        long a=Math.abs(dividend),b=Math.abs(divisor);
        if(dividend==Integer.MIN_VALUE)a=(long)Integer.MAX_VALUE+1;
        if(divisor==Integer.MIN_VALUE)b=(long)Integer.MAX_VALUE+1;
        long c=b;
        long ans=0;
        while(a>=b){
            long i=1;
            while(a>=(b<<1)){
                i<<=1;
                b<<=1;
            }
            ans+=i;
            a-=b;
            b=c;
        }
        
        int ans1=(int)ans;
        return ((dividend<0)^(divisor<0))?(-1)*ans1:ans1;
    }
}
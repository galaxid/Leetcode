class Solution {
    public int findNthDigit(int n) {
        
        long a=1,b=1,c=0;
        while(c<=n){
            c+=a*9*b;
            a*=10;
            b++;
        }
        a/=10;
        b-=1;
        c-=a*9*b;
        n-=c;
        a=a+(n+b-1)/b-1;
        c=(n%b==0)?b:n%b;
        b-=c;
        for(int i=0;i<b;i++) a/=10;
        return (int)a%10;
        
    }
}
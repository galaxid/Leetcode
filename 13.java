class Solution {
    public int romanToInt(String s) {
        int ans=0;
        for(int i=s.length()-1;i>=0;i--){
            int val=value(s.charAt(i));
            if(i>0) {
              int val2=value(s.charAt(i-1));
              if(val>val2) {
                  ans=ans+val-val2;
                  i--;
              }
              else ans+=val;
            }
            else ans+=val;
        }
        return ans;
    }
    public int value(char a){
        if(a=='I')return 1;
        if(a=='V')return 5;
        if(a=='X')return 10;
        if(a=='L')return 50;
        if(a=='C')return 100;
        if(a=='D')return 500;
        if(a=='M')return 1000;
        return 0;
    }
}
class Solution {
    public String intToRoman(int num) {
        int a=1000;
        String ans="";
        for(int i=0;i<7;i++){
            ans +=helper(num/a,i);
            num%=a;
            if(i%2==0&&(num+a/10)/a==1){
                ans+=helper(9,i);
                num-=9*(a/10);
            }
            if(i%2==0)a/=2;
            else a/=5;
        }
        return ans;
    }
    public String helper(int num,int i){
        char[] roman={'M','D','C','L','X','V','I'};
        String ans="";
        for(int j=0;j<4;j++){
            if(j==num)return ans;
            ans+=roman[i];
        }
        if(num==4)return ""+roman[i]+roman[i-1];
        return ""+roman[i+2]+roman[i];
    }
}
class Solution {
    public String numberToWords(int num) {
        String ans="";
        if(num==0)return"Zero";
        for(int i=0;num>0;i++){
            ans=helper(num%1000,i)+ans;
            num/=1000;
        }
        ans=ans.substring(1);
        //if(ans.substring(0,4).equals("and ")) ans=ans.substring(4);
        return ans;
    }
    public String helper(int num,int i) {
        String ans="";
        String []number={""," One"," Two"," Three"," Four"," Five"," Six"," Seven"," Eight"," Nine"," Ten"," Eleven"," Twelve"," Thirteen"," Fourteen"," Fifteen"," Sixteen"," Seventeen"," Eighteen"," Nineteen"," Twenty"};
        String []post={""," Thousand"," Million"," Billion"," Trillion"};
        String []tens={""," Ten"," Twenty"," Thirty"," Forty"," Fifty"," Sixty"," Seventy"," Eighty"," Ninety"};
        if(num==0) return ans;
        if(num/100>0){
            ans =ans+number[num/100]+" Hundred";
        }
        num%=100;
        //if(num/10==0&&num%10!=0) ans+=" and";
        if(num<21)ans+=number[num];
        else{
            ans+=tens[num/10];
            ans+=number[num%10];
        }
        ans+=post[i];
        return ans;
    }
}
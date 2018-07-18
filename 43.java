class Solution {
    public String multiply(String num1, String num2) {
        int []mul= new int[num1.length()+num2.length()];
        String ans="";
        for(int i=0;i<num2.length();i++){
            for(int j=0;j<num1.length();j++){
                int a=num1.charAt(num1.length()-1-j)-'0';
                int b=num2.charAt(num2.length()-1-i)-'0';
                mul[i+j]+=a*b;
            }
                
        }
        for(int i=0;i<mul.length;i++){
            if(mul[i]>=10){                     //>=!
                mul[i+1]+=mul[i]/10;
                mul[i]%=10;
            }
        }
        int j;
        for(j=mul.length-1;mul[j]==0&&j>0;j--);   //&&j>0!
        for(int i=j;i>=0;i--){
            ans=ans+mul[i];
        }
        return ans;
    }

}
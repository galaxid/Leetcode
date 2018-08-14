class Solution {
    public int maximumSwap(int num) {
        if(num<10) return num;
        int []num2=new int[9];
        int i=0,ans=num;
        while(num>0){
            num2[i]=num%10;
            num/=10;
            i++;
        }
        int max=-1;
        for(int j=i-1;j>0;j--){
            for(int k=j-1;k>=0;k--){
                if(max==-1&&num2[k]>num2[j]) max=k;
                else if(max!=-1&&num2[k]>=num2[max]) max=k;
            }
            if(max!=-1){
                int temp=num2[j];
                num2[j]=num2[max];
                num2[max]=temp;
                break;
            }
        }
        if(max==-1)return ans;
        else{
            ans=0;
            for(int j=i-1;j>=0;j--){
                ans+=num2[j];
                ans*=10;
            }
        }
        return ans/10;
    }
}
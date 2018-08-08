class Solution {
    public int nextGreaterElement(int n) {
        int len=0;
        if(n<=10)return -1;
        else {
            int a=0,b=n,flag=0;
            while(b>0){
                if(b%10<a)flag=1;
                a=b%10;
                b=b/10;
                len++;
            }
            if(flag==0) return -1;
        }
        int []num=new int[len];
        int a=0;int b=n;
        while(b>0){
                a=b%10;
                b=b/10;
                num[--len]=a;
            }
        for(int i=num.length-1;i>0;i--){
            if(num[i-1]<num[i]){
                int temp=num[i-1];
                for(int j=num.length-1;j>i-1;j--){
                    if(num[j]>num[i-1]){
                        num[i-1]=num[j];
                        num[j]=temp;
                        break; 
                    }
                }
                for(int j=i;j<num.length;j++)
                    for(int k=i;k<num.length-j+i-1;k++){
                        if(num[k]>num[k+1]){
                            temp=num[k];
                            num[k]=num[k+1];
                            num[k+1]=temp;
                        }
                    }
                break;
            }
        }
        long ans=0,temp=1;
        for(int i=num.length-1;i>=0;i--){
            ans+=num[i]*temp;
            temp*=10;
        }
        if(ans>2147483647)return -1;
        return (int)ans;
    }
}
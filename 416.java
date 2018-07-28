class Solution {
    boolean ans=false;
    public boolean canPartition(int[] nums) {
        int n=nums.length;
        int sum=0;
        for(int i:nums) sum+=i;
        if(sum%2==1) return false;
        sum/=2;
        int[]sums=new int[n];
        BackTrace(0,sums,nums,sum);
        return ans;
    }
    public void BackTrace(int t,int[]sums,int[]nums,int sum){
        int n=nums.length;
        if(t>=n){
            if(sums[n-1]==sum) ans=true;
            return;
        }
        else{
            for(int i=0;i<=1;i++){
                if(t==0)sums[t]=i*nums[t];
                else sums[t]=i*nums[t]+sums[t-1];
                if(sums[t]<sum) BackTrace(t+1,sums,nums,sum);
                if(sums[t]==sum) ans=true;
            }
        }
    }
}
class Solution {
    public int findPeakElement(int[] nums) {
        int n=nums.length;
        return find(0,n-1,nums);
    }
    public int find(int a,int b,int[]nums){
        if(a==b)return a;
        else{
            int c=(a+b)/2;
            int d=c+1;
            if(nums[c]>nums[d])return find(a,c,nums);
            else return find(d,b,nums);
        }
    }
}
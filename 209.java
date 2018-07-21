class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        int left=0,right=0;
        int min = nums.length+1;
        if(min==1) return 0;
        if(s==0) return 1;
        int sum=nums[0];
        while(left<nums.length){
            while(sum<s&&right<nums.length-1) sum+=nums[++right];
            if(sum<s) break;
            min = (right-left+1)<min ? right-left+1:min;
            sum-=nums[left++];
            if(right==nums.length-1&&sum<s)break;
        }
        if(min==nums.length+1)return 0;
        return min;
    }
}
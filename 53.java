class Solution {
    public int maxSubArray(int[] nums) {
        int max=nums[0], cur=nums[0];
        for (int i=1;i<nums.length;i++){
    	    max= Math.max(max+nums[i],nums[i]);
    	    cur=Math.max(cur, max);	
        }
        return max;
    }
}
class Solution {
    public int maxArea(int[] height) {
        if(height.length<2) return 0;       
        int left=0,right=height.length-1;
        int max=0;
        while(left<right) {
            int cur= Math.min(height[left],height[right])*(right-left);
            max= Math.max(max,cur);
            if(height[left]<=height[right]) {
                left++;
            }
            else {
                right--;
            }
        }
        return max;
    }
}
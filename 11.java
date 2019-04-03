/*class Solution {
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
}*/


class Solution {
    public int maxArea(int[] height) {
        int i=0,j=height.length-1;
        int res=0;
        while(i<j){
            res=Math.max(res,(j-i)*Math.min(height[j],height[i]));
            if(height[i]<height[j])
                i++;
            else j--;
            
        }
        return res;
    }
}

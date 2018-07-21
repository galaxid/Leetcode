class Solution {
      public boolean find132pattern(int[] nums) {
      int min=0;
      for (int i=0;i<nums.length;i++) {
          if(i==0) min=nums[i];
          else min= nums[i]<min ? nums[i]: min;
          if (min==nums[i]) continue;
          for (int j=nums.length-1;j>i;j--) {
             if (min<nums[j]&&nums[j]<nums[i]) return true;
         }
     }   
     return false;
   }  
}
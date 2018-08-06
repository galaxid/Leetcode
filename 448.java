class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer>ans=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]<nums.length+1&&nums[nums[i]-1]<nums.length+1){
                int val=nums[i];
                nums[i]=nums[nums[i]-1];
                nums[val-1]=nums.length+1;
                i--;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]<nums.length+1)ans.add(i+1);
        }
        return ans;
    }
}
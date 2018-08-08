/*class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        Set<Integer> set=new HashSet<>();
        for(int i:nums){
            sum+=i;
            int cur=sum%k;
            if(set.contains(cur))return true;
            set.add(cur);
        }
        return false;
    }
}*/
class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        Set<Integer> set=new HashSet<>();
        int sum=0;
        for(int i=0;i<nums.length;i++){
            int cur;
            sum+=nums[i];
            if(k!=0){
                cur=sum%k;
                if(i>0){
                    if(set.contains(cur)||cur==0&&sum!=0)return true;
                }
                set.add(cur);
            }
        }
        if(sum==0&&nums.length>1)return true;
        return false;
    }
}

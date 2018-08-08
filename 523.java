class Solution {
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
}
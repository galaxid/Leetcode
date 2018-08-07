class Solution {
    public int singleNonDuplicate(int[] nums) {
        int a=0;
        for(int i:nums)a^=i;
        return a;
    }
}
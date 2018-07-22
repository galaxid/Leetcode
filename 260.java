class Solution { //too hard
    public int singleNumber(int[] nums) {
        int a = 0;
        for(int i:nums){
            a^=i;
        }
        a &=-a;
        int[]ans={0,0};
        for (int num : i){
            if ((i & a) == 0){
                ans[0] ^= i;
            }
            else {
                ans[1] ^= i;
            }
        }
        return ans;
    }
}
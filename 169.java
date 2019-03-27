import java.util.*;
class Solution {
    public int majorityElement(int[] nums) {
        Set<Integer> set = new HashSet<>();
        Map<Integer,Integer> map = new HashMap<>();
        for(int i:nums){
            if(map.get(i)!=null){
                map.put(i,map.get(i)+1);
            }
            else {
                map.put(i,1);
                set.add(i);
            }
        }
        int ans=nums[0];
        for(int i:set){
            if(map.get(i)>map.get(ans))
                ans=i;
        }
        return ans;
    }
}

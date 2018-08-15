class Solution {
    List<List<Integer>> ans =new ArrayList<>();
    Set<List<Integer>> set =new HashSet<>();
    
    public List<List<Integer>> findSubsequences(int[] nums) {
        for(int i=0;i<nums.length;i++){
            List<Integer> cur=new ArrayList<>();
            cur.add(nums[i]);
            helper(i+1,cur,nums);
        }
        return ans;        
    }
    public void helper(int start,List<Integer> cur,int[] nums){
        if(cur.size()>1&&!set.contains(cur)){
            ans.add(cur);
            set.add(cur);
        }
        for(int i=start;i<nums.length;i++){
            if(nums[i]>=cur.get(cur.size()-1)){
                List<Integer> cur1=new ArrayList<>();
                for(int j=0;j<cur.size();j++)cur1.add(cur.get(j));
                cur.add(nums[i]);
                helper(i+1,cur,nums);
                cur=cur1;
            }
        }
    }
}
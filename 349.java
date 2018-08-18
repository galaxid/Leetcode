class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer>set=new HashSet<>();
        Set<Integer>set2=new HashSet<>();
        List<Integer>list =new ArrayList();
        for(int i:nums1){
            set.add(i);
        }
        for(int i:nums2){
            if(set.contains(i)&&!set2.contains(i)){
                list.add(i);
                set2.add(i);
            }
        }
        int[] ans=new int[list.size()];
        for(int i=0;i<list.size();i++){
            ans[i]=list.get(i);
        }
        return ans;
    }
}
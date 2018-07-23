class Solution {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        Map<Integer, Integer> ans=new HashMap<>();
        for(int i:A){
            for(int j:B){
                if(ans.get(i+j)==null) ans.put(i+j,1);
                else ans.put(i+j,ans.get(i+j)+1);
            }
        }
        int num=0;
        for(int i:C){
            for(int j:D){
                if(ans.get(-1*(i+j))!=null) num+=ans.get(-1*(i+j));
            }
        }
        return num;
    }
}
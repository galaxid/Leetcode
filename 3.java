class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> map = new HashMap<>();
        int start=0,end=0,res=0;
        for(int i=0;i<s.length();i++){
            end=i;
            if(map.containsKey(s.charAt(i))&&map.get(s.charAt(i))>=start){
                start=map.get(s.charAt(i))+1;
                res=Math.max(res,end-start+1);
            }
            res=Math.max(res,end-start+1);
            map.put(s.charAt(i),i);  
        }
        return res;
    }
}

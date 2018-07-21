class Solution {   //the length of anagrams is not a constant
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<List<String>>();
        if(strs.length==0) return ans;
        List<String> ana = new ArrayList<String>();
        for(int i=0;i<strs.length;i++){
            int []letters = new int[26];
            for(int j=0;j<strs[i].length();j++){
                int a=strs[i].charAt(j)-'a';
                letters[a]++;
            }
            int j=0;
            String cur=Arrays.toString(letters);
            for(j=0;j<ana.size();j++){
                if(ana.get(j).equals(cur))break;  
            }
            if(j==ana.size()){
                ana.add(cur);
                List<String> cur1 = new ArrayList<String>();
                cur1.add(strs[i]);
                ans.add(cur1);
            }
            else ans.get(j).add(strs[i]);
        }
        return ans;
    }
}
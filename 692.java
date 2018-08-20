class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String,Integer>map=new HashMap<>();
        List<String>ans = new ArrayList<>();
        for(String i:words){
            if(!map.containsKey(i)){
                map.put(i,1);
                ans.add(i);
            }
            else map.put(i,map.get(i)+1);
        }
        Collections.sort(ans, new Comparator<String>() {
            public int compare(String o1, String o2) {
                int a=map.get(o1),b=map.get(o2);
                if(a-b!=0) return b-a;
                else return o1.compareTo(o2);               
            }
        });
        ans.subList(k,ans.size()).clear();
        return ans;
    }
}
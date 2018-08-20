class Solution {
    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        List<List<String>>ans=new ArrayList<>();
        Map<String,Integer>map=new HashMap<>();
        int num=0;
        for(int i=0;i<accounts.size();i++){
            List<String> cur=accounts.get(i);
            int flag=0;
            for(int j=1;j<cur.size();j++){
                if(map.containsKey(cur.get(j))){
                    flag=1;
                    for(int k=1;k<cur.size();k++){
                        if(!map.containsKey(cur.get(k))){
                            ans.get(map.get(cur.get(j))).add(1,cur.get(k));
                            map.put(cur.get(k),map.get(cur.get(j)));
                        }
                    }
                    break;
                }
            }
            if(flag==0){
                ans.add(cur);
                for(int j=1;j<cur.size();j++)map.put(cur.get(j),num);
                num++;
            }
            
        }
        return ans;
    }
}
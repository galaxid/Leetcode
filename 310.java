class Solution {         //681 ms (> _ <)
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        List<Integer> v = new ArrayList<>();
        for(int i=0;i<n;i++){
            v.add(i);
        }
        if (n == 1) return v;
        int []count=new int[n];
        int length=edges.length;  //reduce the number of the edges and luckily it passed
        while(v.size()>2){
            for(int i=0;i<n;i++)count[i]=0;
            for(int i=0;i<length;i++){
                if(edges[i][0]<n) count[edges[i][0]]++;
                if(edges[i][1]<n) count[edges[i][1]]++;
            }
            for(int i=0;i<n;i++){
                if(count[i]==1){
                    for(int j=0;j<v.size();j++){
                        int a=v.get(j);
                        if(a==i)v.remove(j);
                    }
                    for(int j=0;j<length;j++){   //too complicated
                        if(edges[j][0]==i||edges[j][1]==i) {
                            edges[j][0]=edges[length-1][0];
                            edges[j][1]=edges[length-1][1];
                            length--;
                            j--;
                        }     
                    }
                }    
            }
        }
        return v;
    }
}
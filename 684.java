class Solution {
    int[]v =new int[1001];
    public int[] findRedundantConnection(int[][] edges) {
        for (int i=0;i<edges.length;i++) {
            int x = root(edges[i][0]), y=root(edges[i][1]);
            if (x==y) return edges[i];
            v[y] = x;
        }
        int[]ans={0,0};
        return ans;
    }
    int root(int i) {
        while (v[i] !=0){
            i=v[i];
        }
        return i;
    }
}
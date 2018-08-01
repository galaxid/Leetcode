class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int n=citations.length;
        int a=0,b=0; 
        for(int i=0;i<n;i++){
            a=n-i;
            if(citations[i]>=a){
                b=a;
                break;
            }
        }
        return b;
    }
}
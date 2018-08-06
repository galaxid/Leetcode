/*class Solution {
    public int maxEnvelopes(int[][] envelopes) {
        Arrays.sort(envelopes,new MyComprator());
        int len=0;
        int[] dp=new int[envelopes.size];
        for (int i=0;i<envelopes.size();i++){
            for (int j=0; j<i;j++){
                if (envelopes[i][1]>envelopes[j][1]){
                    dp[i] = max(dp[i], dp[j]+1);
                }
            }
            len = Math.max(len, dp[i]);
        }
        return len;
        
    }
}

class MyComprator implements Comparator {
    public int compare(int[] a, int[] b) {
        if(a[0]==b[0])
            return b[1]-a[1];
        else
            return a[0]-b[0];
    }
}*/
class Solution {
    public int maxEnvelopes(int[][] envelopes) {
        if(envelopes.length==0)return 0;
        Arrays.sort(envelopes,new Comparator<int[]>(){
            public int compare(int[] a, int[] b) {
                if(a[0]==b[0])
                    return b[1]-a[1];
                else
                    return a[0]-b[0];
            }
        });
        int len=0;
        int[] dp=new int[envelopes.length];
        for (int i=0;i<envelopes.length;i++){
            for (int j=0; j<i;j++){
                if (envelopes[i][1]>envelopes[j][1]){
                    dp[i] = Math.max(dp[i], dp[j]+1);
                }
            }
            len = Math.max(len, dp[i]);
        }
        return len+1;
        
    }
}


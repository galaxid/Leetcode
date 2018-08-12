class Solution {
    int ans=0;
    public int countArrangement(int N) {
        int[] numbers=new int[N+1];
        helper(N,numbers,1);
        return ans;
    }
    public void helper(int N,int[] numbers,int f) {
        if (f>N) {
            ans++; 
            return;
        }
        for (int i=1;i<=N;i++){
            if (numbers[i]==0&&(i%f== 0||f%i== 0)){
                numbers[i] = 1;
                helper(N, numbers,f+1);
                numbers[i] = 0;
            }
        }
    }
}
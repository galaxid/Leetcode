class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total=0;
        for(int i=0;i<gas.length;i++){
            total+=gas[i];
            total-=cost[i];
        }
        if(total<0) return -1;
        int n=0,sum=0,start=0;
        while(true){
            if(n-start==gas.length)break;
            sum+=gas[n%gas.length];
            sum-=cost[n%gas.length];
            if(sum<0){
                sum=0;
                start=n+1;
            }
            n++;
        }
        return n%gas.length;
    }
}
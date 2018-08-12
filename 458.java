class Solution {
    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        if(buckets==1) return 0;
        int times=minutesToTest/minutesToDie;
        int num=1;int ans=1;
        while(true){  
            num=1;
            for(int i=0;i<ans;i++)num*=(times+1);
            if(num>=buckets) break;
            ans++;
        }
        return ans;
    }
}
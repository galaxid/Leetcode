class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(houses);
        Arrays.sort(heaters); // Unordered
        int ans=0;
        int j=0;
        for(int i=0;i<houses.length;i++){
            int min=Integer.MAX_VALUE;
            while(j<heaters.length){
                int cur=Math.abs(houses[i]-heaters[j]);
                if(cur<=min) min=cur;   // repeated heater <=
                else{
                    j--;
                    break;
                }
                j++;
            }
            if(j>0)j--;
            ans=ans>min?ans:min;
        }
        return ans; 
    }
}
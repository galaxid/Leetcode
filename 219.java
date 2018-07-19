class Solution {  
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(k<=0) return false;
        ArrayList<Integer>number = new ArrayList<>();
        for(int i:nums){         //no index in for each
            for(int j=0;j<number.size();j++){
                int a=number.get(j);
                if(i==a) return true;
            }
            if(number.size()==k) number.remove(0);
            number.add(i);
        }
        return false;
    }
}

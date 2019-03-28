class Solution {
    public int nthSuperUglyNumber(int n, int[] primes) {
        TreeSet<Integer> set = new TreeSet<Integer>();
        int i=0;
        Integer[] b;
        set.add(1);
        while(i<n){
            b=(Integer[])set.toArray(new Integer[n]);
            int a=b[i];
            if(set.size()>=n&&a*primes[0]>b[n-1])
                break;
            for(int j:primes){
                set.add(a*j);
            }
            i++;
        }
        b=(Integer[])set.toArray(new Integer[n]);
        //for(int c:b) System.out.println(c);
        return b[n-1];
    }
}

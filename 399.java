class Solution {
    public double[] calcEquation(String[][] equations, double[] values, String[][] queries) {
        List<String>arr=new ArrayList<>();
       HashMap<String,Double> map=new HashMap<>();
        for(int i=0;i<equations.length;i++){
            String str1=""+equations[i][0]+equations[i][1];
            String str2=""+equations[i][1]+equations[i][0];
            map.put(str1,values[i]);
            map.put(str2,1/values[i]);
            arr.add(str1);
            arr.add(str2);
            for(int j=0;j<arr.size();j++){
                if(arr.get(j).charAt(1)==str1.charAt(0)){
                    String str3=""+arr.get(j).charAt(0)+str1.charAt(1);
                    if(map.get(str3)==null){
                        map.put(str3,values[i]*map.get(arr.get(j)));
                        arr.add(str3);
                    } 
                }
                if(arr.get(j).charAt(1)==str2.charAt(0)){
                    String str3=""+arr.get(j).charAt(0)+str2.charAt(1);
                    if(map.get(str3)==null){
                        map.put(str3,1/values[i]*map.get(arr.get(j)));
                        arr.add(str3);
                    } 
                }
            }
        }
        double[] ans=new double[queries.length];
        for(int i=0;i<queries.length;i++){
            String str=""+queries[i][0]+queries[i][1];
            if(map.get(str)!=null) ans[i]=map.get(str);
            else ans[i]=-1;
        }
        return ans;
    }
}
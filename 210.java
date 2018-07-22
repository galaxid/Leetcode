class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] ans=new int[numCourses];
        if(numCourses==1) return ans;
        for(int i=0;i<numCourses;i++) ans[i]=numCourses;
        int length=prerequisites.length;  
        int loop =0;
        while(loop<numCourses){
            int count[] =new int[numCourses];
            int flag=0;
            for(int i=0;i<length;i++){
                count[prerequisites[i][0]]++;
            }
            for(int i=0;i<numCourses;i++){
                if(count[i]==0){
                    int j=0;
                    for(j=0;j<numCourses;j++){
                        if(ans[j]==i)break;
                    }
                    if(j==numCourses){
                        flag=1;
                        ans[loop++]=i;
                        for(int k=0;k<length;k++){  
                            if(prerequisites[k][1]==i) {
                                prerequisites[k][0]=prerequisites[length-1][0];
                                prerequisites[k][1]=prerequisites[length-1][1];
                                length--;
                                k--;
                            }
                        }
                    }
                }
            }
            if(flag==0){
            int[] ans1=new int[0];  
            return ans1;    
            }
        }
    return ans;   
    }
}
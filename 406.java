class Solution {  // too complicated
  public int[][] reconstructQueue(int[][] people) {
	int n = people.length;
        int[][] ans = new int[n][2];
        int[][]copy = new int[n][2];
        for(int i=0;i<n;i++){
        copy[i][0]=people[i][0];
        copy[i][1]=people[i][1];
        }
        while(n>0){
          int min = -1;
          for(int i=0;i<n;i++){
	    if(copy[i][1] == 0){
              if(min==-1){
                min = i;
              }
              else{
                min = copy[i][0] < copy[min][0] ?  i : min;
              }
	    }
          }
          ans[people.length-n][0] = people[min][0];
          ans[people.length-n][1] = people[min][1];
          int a = people[min][0];
          people[min][0] = people[n-1][0];
          people[min][1] = people[n-1][1];
          copy[min][0] = copy[n-1][0];
          copy[min][1] = copy[n-1][1];
          n--;
          for(int i=0;i<n;i++){
          if(people[i][0]<=a) copy[i][1]--;//forgot to save a£¬if(people[i][0]<=people[n][0]) 
          }
        }
  return ans;
  }
};



//int[][] ans = Arrays.copyOf(people,people.length); https://blog.csdn.net/muziyu2015/article/details/79232810
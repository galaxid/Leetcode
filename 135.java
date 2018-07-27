class Solution {
    public int candy(int[] ratings) {
        int n=ratings.length;
        int[]ans=new int[n];
        if(n==1) return 1;
        if(n==2&&ratings[0]==ratings[1]) return 2;
        if(n==2) return 3;
        List<Integer>cur1=new ArrayList<>();
        if(ratings[1]>=ratings[0])cur1.add(0);
        if(ratings[n-2]>=ratings[n-1])cur1.add(n-1);
        for(int i=1;i<n-1;i++){
            if(ratings[i+1]>=ratings[i]&&ratings[i-1]>=ratings[i]) cur1.add(i);
        }
        for(int i=0;i<cur1.size();i++){
            ans[cur1.get(i)]=1;
        }
        while(true){
            List<Integer>cur=new ArrayList<>();
            if(ans[1]!=0&&ans[0]==0) cur.add(0);
            if(ans[n-2]!=0&&ans[n-1]==0) cur.add(n-1);
            for(int i=1;i<n-1;i++)
                if((ans[i+1]!=0||ans[i-1]!=0)&&ans[i]==0) cur.add(i);
            if(cur.size()==0) break;
            for(int i=0;i<cur.size();i++){
                int a=cur.get(i);int b;int c;
                if(a==0||a==n-1){
                    if(a==0)b=1;
                    else b=n-2;
                    ans[a]=ans[b]+1;
                }
                else if(ans[a-1]*ans[a+1]==0){
                    b=ans[a-1]>ans[a+1]?a-1:a+1;
                    c=(b==a-1)?a+1:a-1;
                    if(ratings[a]>ratings[c]) continue;
                    else if(ratings[a]>ratings[b]) ans[a]=ans[b]+1;
                }
                else{
                    b=ratings[a-1]>ratings[a+1]?a-1:a+1;
                    c=(b==a-1)?a+1:a-1;
                    if(ratings[a]==ratings[b]) ans[a]=ans[c]+1;
                    else ans[a]=(ans[b]>ans[c]?ans[b]:ans[c])+1;
                }
            }
        }
        int sum=0;
        for(int i=0;i<n;i++) sum+=ans[i];
        return sum;
    }
}
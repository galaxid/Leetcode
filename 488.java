class Solution {
    public int findMinStep(String board, String hand) {
        int[]balls=new int[5];
        for(char i:hand.toCharArray()){
            balls[value(i)]++;
        }
        List<String>boards=new ArrayList<>();
        int []cur=new int[2];
        for(char i:board.toCharArray()){
            if(cur[1]==0){
                cur[0]=value(i);
                cur[1]=1;
            }
            else if(cur[0]==value(i)) cur[1]++;
            else {
                boards.add(""+cur[0]+cur[1]);
                cur[0]=value(i);
                cur[1]=1;
            }
        }
        boards.add(""+cur[0]+cur[1]);
        int ans=Helper(boards,balls,0);
        return ans<Integer.MAX_VALUE?ans:-1;
    }
    public int value(char a){
        if(a=='R')return 0;
        if(a=='Y')return 1;
        if(a=='B')return 2;
        if(a=='G')return 3;
        else return 4;
    }
    public List<String>edit(List<String>board){
        int a=board.size()+1;
        while(a!=board.size()){
            a=board.size();
            for(int i=0;i<board.size();i++){
                String cur=board.get(i);
                if(cur.charAt(1)-'0'>=3){
                    board.remove(i);
                    break;
                }
            }
            for(int i=0;i<board.size()-1;i++){
                String cur=board.get(i);
                if(board.size()==1)break;
                String cur1=board.get(i+1);
                if(cur.charAt(0)==cur1.charAt(0)){
                    int temp=cur.charAt(1)-'0'+cur1.charAt(1)-'0';
                    cur=""+cur.charAt(0)+temp;
                    board.remove(i);
                    board.remove(i);
                    board.add(i,cur);
                    i--;
                 }
            }
        }
        return board;
    }
    public int Helper(List<String>board,int[]balls,int n){
        int min=Integer.MAX_VALUE;
        if(board.size()==0) return n;
        for(int i=0;i<board.size();i++){
            List<String>board2=new ArrayList<>();
            for(int j=0;j<board.size();j++){
               board2.add(board.get(j));
            }
            int[]balls2=Arrays.copyOf(balls,5);
            String cur=board.get(i);
            if(cur.charAt(1)-'0'+balls[cur.charAt(0)-'0']>=3){
                int temp=cur.charAt(1)-'0';
                balls2[cur.charAt(0)-'0']-=(3-temp);
                cur=""+cur.charAt(0)+'3';
                board2.remove(i);
                board2.add(i,cur);
                min=Math.min(min,Helper(edit(board2),balls2,n+3-temp));
            }
        }
        return min;
    }
}

























/*class Solution {
    public int findMinStep(String board, String hand) {
        int[]balls=new int[5];
       /* for(char i:board.toCharArray()){
            balls[value(i)]++;
        }*/
        for(char i:hand.toCharArray()){
            balls[value(i)]++;
        }
        //for(int i:balls) if(i<3&&i!=0) return -1;
        List<Integer[]>boards=new ArrayList<>();
        for(char i:board.toCharArray()){
            int []cur=new int[2];
            if(cur[1]==0){
                cur[0]=value(i);
                cur[1]=1;
            }
            else if(cur[0]==value(i)) cur[1]++;
            else {
                boards.add(cur);
                cur[0]=value(i);
                cur[1]=1;
            }
        }
        return Helper(boards,balls,0);
    }
    public int value(char a){
        if(a=='R')return 0;
        if(a=='Y')return 1;
        if(a=='B')return 2;
        if(a=='G')return 3;
        else return 4;
    }
    public List<Integer[]>edit(List<Integer[]>board){
        int a=board.size()+1;
        while(a!=board.size()){
            a=board.size();
            for(int i=0;i<board.size();i++){
                int[]cur=board.get(i);
                if(cur[1]>=3){
                    board.remove(i);
                    break;
                }
            }
            for(int i=0;i<board.size()-1;i++){
                int[]cur=board.get(i);
                if(board.size()==1)break;
                int[]cur1=board.get(i+1);
                if(cur[0]==cur1[0]){
                    cur[1]+=cur1[1];
                    board.remove(i);
                    board.remove(i);
                    board.add(i,cur);
                 }
            }
        }
    }
    public int Helper(List<Integer[]>board,int[]balls,int n){
        int min=Integer.MAX_VALUE;
        if(board.size()==0) return n;
        for(int i=0;i<board.size();i++){
            List<Integer[]>board2=new ArrayList<>();
            for(int j=0;j<board.size();j++){
               board2.add(board.get(i));
            }
            int[]balls2=Arrays.copyOf(balls,5);
            int[]cur=board.get(i);
            if(cur[1]+balls[cur[0]]>=3){
                balls2[cur[0]]-=(3-cur[1]);
                cur[1]=3;
                board2.remove(i);
                board2.add(i,cur);
                min=Helper(board2,balls2,n+3-cur[1]);
            }
        }
        return min<Integer.MAX_VALUE?min:-1;
    }
}*/
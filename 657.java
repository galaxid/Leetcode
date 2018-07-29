class Solution {
    public boolean judgeCircle(String moves) {
        int a=0,b=0;
        for(int i=0;i<moves.length();i++){
            if(moves.charAt(i)=='U')a++;
            if(moves.charAt(i)=='D')a--;
            if(moves.charAt(i)=='L')b++;
            if(moves.charAt(i)=='R')b--;
        }
        if(a==0&&b==0)return true;
        return false;
    }
}
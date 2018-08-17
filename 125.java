class Solution {
    public boolean isPalindrome(String s) {
        int i=0,j=s.length()-1;
        while(i<=j){
            while(!ischar(s.charAt(i)))i++;
            while(!ischar(s.charAt(j)))j--;
            if(!equal(s.charAt(i),s.charAt(j)))return false;
            i++;j--;
        }
        return true;
    }
    public boolean ischar(char i){
        if(i-'A'>=0&&i-'A'<26||i-'a'>=0&&i-'a'<26)return true;
        return false;
    }
    public boolean equal(char i,char j){
        int a=(i-'A'>=0&&i-'A'<26)?i-'A':i-'a';
        int b=(j-'A'>=0&&j-'A'<26)?j-'A':j-'a';
        if(a==b)return true;
        return false;
    }
}
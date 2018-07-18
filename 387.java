class Solution {
    public int firstUniqChar(String s) {
        int [][] letters= new int[26][2];
        int min=s.length();
        for(int i=0;i<26;i++){
            letters[i][1]=min;
        }
        for(int i=0;i<s.length();i++){
            int a =s.charAt(i)-'a';
            letters[a][0]++;
            if(i<letters[a][1]) letters[a][1]=i;
        }
         for(int i=0;i<26;i++){
            if(letters[i][0]==1){
                min=min<letters[i][1] ? min:letters[i][1];
            }
        } 
        if(min==s.length())return -1;
        return min;
    }
}
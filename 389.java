class Solution {
    public char findTheDifference(String s, String t) {
        char[] let=new char[26];
        char ans='a';
        for(int i=0;i<s.length();i++){
            let[s.charAt(i)-'a']++;
        }
        for(int i=0;i<t.length();i++){
            let[t.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++){
            if(let[i]>0) ans= (char)('a'+i);
        }
        return ans;
    }
}
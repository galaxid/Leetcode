class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int []a=new int[26];
        int n1=s1.length();
        int n2=s2.length();
        int ans=1;
        if(n1>n2) return false;
        for(int i=0;i<s1.length();i++){
            a[s1.charAt(i)-'a']++;
        }
        for(int i=0;i<s1.length();i++){
            a[s2.charAt(i)-'a']--;
        }
        for(int i:a)if(i!=0)ans=0;
        if(ans==1)return true;
        ans=1;
        for(int i=s1.length();i<s2.length();i++){
            a[s2.charAt(i-s1.length())-'a']++;
            a[s2.charAt(i)-'a']--;
            for(int j:a)if(j!=0)ans=0;
            if(ans==1)return true;
            ans=1;
        }
        return false;
    }
}
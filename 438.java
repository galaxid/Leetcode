class Solution {                                                  //my first java program

    public List<Integer> findAnagrams(String s, String p) {

      int[] letters = new int[26];                               //for(int i=0;i<26;i++) letters[i]=0; not necessary
      List<Integer> ans = new ArrayList<Integer>();
      for(int i=0;i<p.length();i++){
      letters[p.charAt(i)-'a']++;
      } 
      for(int i=0;i<s.length()-p.length()+1;i++){
        String cur =s.substring(i,i+p.length());
        if(i==0){
          for(int j=0;j<p.length();j++){
            letters[cur.charAt(j)-'a']--;
          }
        }
              else{
        letters[s.charAt(i-1)-'a']++;                          //not cur.charAt(i-1)-'a'
        letters[cur.charAt(p.length()-1)-'a']--;                
        }
        int sum=0;
        for(int j=0;j<26;j++){
          sum+=Math.abs(letters[j]);                                     //cbaebabacd
        }
        if(sum==0){
	  ans.add(i);
	}
      }
      return ans; 
    }


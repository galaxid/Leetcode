public class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> ans = new ArrayList<String>();
        rec(s, 0, "", ans);
        return ans;
    }
    public void rec(String s, int n, String ip, List<String> ans) {
       if (n == 4) {
          if (s.length()==0) ans.add(ip);
          return;
       }
       for (int i = 1; i < 4; i++) {
          if (s.length() < i) break;
          int a = Integer.parseInt(s.substring(0, i));
          if (a>255||s.charAt(0)=='0'&&i>1) continue;
          rec(s.substring(i), n+1, ip+s.substring(0, i) + (n == 3 ? "" : "."), ans);
       }
    }
}

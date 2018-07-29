public class Codec {
    static Map<String,Integer>map=new HashMap<>();
    static Map<String,String>map2=new HashMap<>();
    static int num=0;
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        String ans;
        if(map.get(longUrl)==null) {
            ans="http://tinyurl.com/"+String.valueOf(num);
            map.put(longUrl,num);
            map2.put(ans,longUrl);
            num++;
        }
        else ans="http://tinyurl.com/"+String.valueOf(map.get(longUrl));
        return ans;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return map2.get(shortUrl);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));
/*
 * [535] Encode and Decode TinyURL
 *
 * https://leetcode.com/problems/encode-and-decode-tinyurl/description/
 *
 * algorithms
 * Medium (73.81%)
 * Total Accepted:    34.4K
 * Total Submissions: 46.7K
 * Testcase Example:  '"https://leetcode.com/problems/design-tinyurl"'
 *
 * Note: This is a companion problem to the System Design problem: Design
 * TinyURL.
 * 
 * TinyURL is a URL shortening service where you enter a URL such as
 * https://leetcode.com/problems/design-tinyurl and it returns a short URL such
 * as http://tinyurl.com/4e9iAk.
 * 
 * Design the encode and decode methods for the TinyURL service. There is no
 * restriction on how your encode/decode algorithm should work. You just need
 * to ensure that a URL can be encoded to a tiny URL and the tiny URL can be
 * decoded to the original URL.
 */
class Codec {
    Map<Integer, String> map1 = new HashMap<Integer, String>();
    Map<String, Integer> map2 = new HashMap<String, Integer>();
    String s = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        if(!map2.containsKey(longUrl)){
            map1.put(map1.size()+1, longUrl);
            map2.put(longUrl, map2.size()+1);
        }
        int n = map2.get(longUrl);
        StringBuilder sb = new StringBuilder();
        //每个longUrl的索引n是不同的，可以用n对62的商和余数来取响应位置的字符组成shortUrl
        while(n>0){
            int r = n%62;
            n /= 62;
            sb.insert(0, s.charAt(r));
        }
        return sb.toString();
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        int val = 0;
        int n = shortUrl.length();
        for(int i = 0; i < n; i++){
            val = val * 62 + s.indexOf(shortUrl.charAt(i));
        }
        return map1.get(val);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));

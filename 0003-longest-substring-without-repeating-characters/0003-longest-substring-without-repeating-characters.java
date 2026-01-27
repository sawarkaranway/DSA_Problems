class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] a = s.toCharArray();
        int maxi = 0;
        int m =0;
        int l =0;
        HashMap<Character,Integer> p = new HashMap<>();
        for (int i = 0; i < a.length; i++) {

            if (p.containsKey(a[i]) && p.get(a[i]) >= m) {
                m = p.get(a[i]) + 1;   
                l = i - m + 1;
            } else {
                l++;
            }

            p.put(a[i], i);            
            maxi = Math.max(maxi, l);
        }
        return maxi;


        
    }
}
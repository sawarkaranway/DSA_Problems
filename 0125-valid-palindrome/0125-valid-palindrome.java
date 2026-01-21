class Solution {
    public boolean isPalindrome(String s) {
        boolean ans = true;
        String clean = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        for(int i=0;i<clean.length();i++){
            if(clean.charAt(i)==clean.charAt(clean.length()-1-i)){
                ans = true;
            }
            else{
                ans=false;
                break;
            }
        }
        return ans;
    }
}
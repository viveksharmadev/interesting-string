https://leetcode.com/problems/longest-palindromic-substring/
class Solution {
    // tc -> n^2, sc-> n
    int low, maxLength;
    public String longestPalindrome(String s) {
        low = 0; maxLength = 0;
        if(s==null || s.length()==0) return "";
        
        for(int i=0; i<s.length(); i++){
            extend(s, i, i); // odd length
            extend(s,i,i+1); // even length
        }
        
        return s.substring(low, low+maxLength);
    }
    
    private void extend(String s, int start, int end){
        while(start>=0 && end<s.length() && s.charAt(start)==s.charAt(end)){
            start--; end++;
        }
        if(maxLength < end-start-1){
            maxLength = end-start-1;
            low = start+1;
        }
    }
}

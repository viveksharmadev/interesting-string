// https://leetcode.com/problems/longest-palindrome/
class Solution {
    // tc -> n, sc-> n
    public int longestPalindrome(String s) {
        int count = 0;
        if(s==null || s.length()==0) return count;
        Set<Character> set = new HashSet<>();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(set.contains(c)){
                set.remove(c);
                count++;
            }else{
                set.add(c);
            }
        }
        return set.isEmpty() ? count*2 : count*2 + 1;
    }
}

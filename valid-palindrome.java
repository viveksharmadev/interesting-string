// https://leetcode.com/problems/valid-palindrome/
class Solution {
   // tc-> n, sc-> n
   public boolean isPalindrome(String s) {
       StringBuilder sb = new StringBuilder();
       for(int i=0; i<s.length(); i++){
           if(Character.isLetterOrDigit(s.charAt(i)))
               sb.append(s.charAt(i));
       }
       StringBuilder rev = new StringBuilder();
       for(int i=0; i<s.length(); i++){
           if(Character.isLetterOrDigit(s.charAt(i)))
           rev.append(s.charAt(i));
       }
       //System.out.println(rev.toString());
       //System.out.println(sb.toString());
       return rev.toString().toLowerCase()
           .equals(sb.reverse().toString().toLowerCase());
   }
}
// Better
class Solution {
   // tc -> n, sc-> 1
   public boolean isPalindrome(String s) {
       int start = 0, end = s.length()-1;
       s = s.toLowerCase();
       while(start < end){
           if(!Character.isLetterOrDigit(s.charAt(start))){
               start++;
           }else if(!Character.isLetterOrDigit(s.charAt(end))){
               end--;
           }else{
               if(s.charAt(start)!=s.charAt(end)){
                   return false;
               }else{
                   start++; end--;
               }
           }
       }
       return true;
   }
}

// Another way
class Solution {
    // tc -> n, sc-> 1
    public boolean isPalindrome(String s) {
        int start = 0, end = s.length()-1;
        while(start < end){
            while(start < s.length()-1 && !Character.isLetterOrDigit(s.charAt(start))){
                start++;
            }
            while(end > 0 && !Character.isLetterOrDigit(s.charAt(end))){
                end--;
            }
            if(start < end && Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end)))
                return false;            
            start++; end--;
        }
        return true;
    }
}

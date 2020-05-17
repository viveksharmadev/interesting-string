// https://leetcode.com/problems/valid-anagram/

class valid-anagram {
   // tc -> n, sc-> 1
   public boolean isAnagram(String s, String t) {
       if(s.length()!=t.length()) return false;
       int[] map = new int[26];
       for(int i=0; i<s.length(); i++){
           map[s.charAt(i)-'a']++;
       }
       for(int i=0; i<t.length(); i++){
           map[t.charAt(i)-'a']--;            
       }
       
       for(int i=0; i<map.length; i++){
           if(map[i]!=0){
               return false;
           }
       }
       
       return true;
   }

   // tc -> n, sc-> 1
   public boolean isAnagram(String s, String t) {
       if(s.length()!=t.length()) return false;
       int[] map = new int[26];
       for(int i=0; i<s.length(); i++){
           map[s.charAt(i)-'a']++;
       }
       for(int i=0; i<t.length(); i++){
           map[t.charAt(i)-'a']--;  
           if(map[t.charAt(i)-'a']<0) 
               return false;
       }
       
       return true;
   }
}

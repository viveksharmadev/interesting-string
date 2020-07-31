// https://leetcode.com/problems/verifying-an-alien-dictionary/
class verifying-an-alien-dictionary {
    // tc -> n, sc-> 1
    int[] map = new int[26];
    public boolean isAlienSorted(String[] words, String order) {        
        for(int i=0; i<order.length(); i++)
            map[order.charAt(i)-'a'] = i;
        
        for(int i=1; i<words.length; i++){
            if(isBigger(words[i-1], words[i])){
                return false;
            }
        }
        return true;
    }
    
    private boolean isBigger(String word1, String word2){
        int l1 = word1.length(), l2 = word2.length();
        int i=0, j = 0;
        while(i<l1 && j<l2){
            int diff = map[word1.charAt(i++)-'a'] - map[word2.charAt(j++)-'a'];
            if(diff < 0) return false;
            else if(diff > 0) return true;
        }
        return l1>=l2;
    }
}

// https://leetcode.com/problems/detect-capital/
class Solution {
    // tc -> n, sc-> 1
    public boolean detectCapitalUse(String word) {
        if(word.equals(word.toUpperCase())){
            return true;
        }else if(word.equals(word.toLowerCase())){
            return true;
        }else{
            String newString = word.substring(1);
            if(newString.equals(newString.toLowerCase()))
                return true;
        }
        return false;
    }
}

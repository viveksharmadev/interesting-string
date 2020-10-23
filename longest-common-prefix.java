// https://leetcode.com/problems/longest-common-prefix/
class Solution {
    // tc -> I think it will be roughly n^2 because of startsWith and substring
    // sc -> 1
    public String longestCommonPrefix(String[] strs) {
        if(strs==null || strs.length==0)
            return "";
        
        String prefix = strs[0];
        
        for(int i=1; i<strs.length; i++){
            
            // this is trimming prefix from backside 
            // to make it longest common prefix
            while(!strs[i].startsWith(prefix)){
                prefix = prefix.substring(0, prefix.length()-1);
            }
        }
        
        return prefix;
    }
}

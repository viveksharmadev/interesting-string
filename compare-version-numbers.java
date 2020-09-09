// https://leetcode.com/problems/compare-version-numbers/
class Solution {
    // String will handle the case of leading 0, that would be a bit tricky with character
    // tc -> m+n+Max(m,n), sc-> m+n
    public int compareVersion(String version1, String version2) {
        String[] ver1 = version1.split("\\.");
        String[] ver2 = version2.split("\\.");
        
        int n = ver1.length > ver2.length ? ver1.length : ver2.length;
        
        for(int i=0; i<n; i++){
            int a = i < ver1.length ? Integer.parseInt(ver1[i]) : 0;
            int b = i < ver2.length ? Integer.parseInt(ver2[i]) : 0;
            
            if(a < b) return -1;
            else if(a > b) return 1;
            else continue;            
        }
        
        return 0;
    }
}

class Solution {
    // tc -> m+n, sc-> 1
    public int compareVersion(String version1, String version2) {
        int m = version1.length(), n = version2.length();
        
        int i = 0, j = 0;
        
        int num1 = 0, num2 = 0;
        while(i < m || j < n){
            num1 = 0;
            num2 = 0;
            
            while(i < m && version1.charAt(i)!='.'){
                num1 = num1*10 + version1.charAt(i++) - '0';
            }
            
            while(j < n && version2.charAt(j)!='.'){
                num2 = num2*10 + version2.charAt(j++) - '0';
            }
            
            if(num1 < num2){
                return -1;  
            }else if(num1 > num2){
                return 1;
            }else{
                i++; j++;
            }
        }
        
        return 0;
    }
}

// https://leetcode.com/problems/find-permutation/
class Solution {
    // tc -> n, sc-> 1 (10,000 because of given constraint)
    public int[] findPermutation(String s) {
        int n = s.length();
        int[] res = new int[n+1];
        for(int i=0; i<=n; i++) res[i] = i+1;
        
        for(int i=0; i<n; i++){
            if(s.charAt(i)=='D'){
                int start = i;
                while(i<n && s.charAt(i)=='D'){
                    i++;
                }
                swap(res, start, i);
            }
        }
        return res;
    }
    
    private void swap(int[] res, int start, int end){
        while(start < end){
            int temp = res[start];
            res[start] = res[end];
            res[end] = temp;
            start++; end--;
        }        
    }
}

// https://leetcode.com/problems/reverse-string/
class reverse-string {
    public void reverseString(char[] s) {
        // tc -> n, sc-> 1
        int start = 0, end = s.length-1;
        while(start < end){
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++; end--;
        }
    }
}

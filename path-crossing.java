// https://leetcode.com/problems/path-crossing/
class path-crossing {
    // tc -> n, sc-> 1
    public boolean isPathCrossing(String path) {
        int x = 0, y = 0;
        Set<String> visited = new HashSet<>();
        visited.add(x + "" + y);
        for(int i=0; i<path.length(); i++){
            if(path.charAt(i)=='N'){
                y++;
            }else if(path.charAt(i)=='S'){
                y--;
            }else if(path.charAt(i)=='E'){
                x++;
            }else{
                x--;
            }
            String key = x +""+ y;
            if(visited.contains(key)) return true;
            visited.add(key);
        }
        return false;
    }
}

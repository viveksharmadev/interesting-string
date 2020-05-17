// https://leetcode.com/problems/find-all-anagrams-in-a-string/
class find-all-anagrams-in-a-string {
    // tc-> n, sc-> 1 (Because HashMaps do not contain more than 26 characters)
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new LinkedList<>();
        if(p.length() > s.length()) return res;
        
        Map<Character, Integer> countMap = new HashMap<>();
        for(int i=0; i<p.length(); i++){
            char c = p.charAt(i);
            countMap.put(c, countMap.getOrDefault(c,0)+1);
        }
        
        int start = 0, end = 0, mapSize = countMap.size();
        while(end < s.length()){
            char cEnd = s.charAt(end);
            if(countMap.containsKey(cEnd)){
                countMap.put(cEnd, countMap.get(cEnd)-1);
                if(countMap.get(cEnd)==0) mapSize--;
            }
            end++;
            while(mapSize==0){
                char cStart = s.charAt(start);
                if(countMap.containsKey(cStart)){
                    if(countMap.get(cStart)==0) mapSize++;
                    countMap.put(cStart, countMap.get(cStart)+1);                    
                }
                if(end-start==p.length()) res.add(start);
                start++;
            }
        }
        
        return res;
    }
}

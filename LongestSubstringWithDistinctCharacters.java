class LongestSubstringWithDistinctCharacters {
    public int longestUniqueSubstr(String s) {
        HashMap<Character, Integer> lastSeenMap = new HashMap<>();
        int length = 0;
        int start = 0;
        
        for(int i = 0; i< s.length(); i++) {
            char currentChar = s.charAt(i);
            
            if(lastSeenMap.containsKey(currentChar) &&
            lastSeenMap.get(currentChar) >= start) {
                start = lastSeenMap.get(currentChar) + 1;
            }
            
            lastSeenMap.put(currentChar, i);
            
            length = Math.max(length, i - start + 1);
        }
        
        return length;
    }
}

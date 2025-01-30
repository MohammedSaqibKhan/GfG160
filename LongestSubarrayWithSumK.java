class LongestSubarrayWithSumK {
    public int longestSubarray(int[] arr, int k) {
        Map<Integer, Integer> prefixMap = new HashMap<>();
        int prefixSum = 0, maxLength = 0;
        
        for(int i=0; i< arr.length; i++) {
            prefixSum += arr[i];
            
            if(prefixSum == k) {
                maxLength = i + 1;
            }
            
            if(prefixMap.containsKey(prefixSum - k)) {
                maxLength = Math.max(maxLength, i - prefixMap.get(prefixSum - k));
            }
            
            if(!prefixMap.containsKey(prefixSum)) {
                prefixMap.put(prefixSum, i);
            }
        }
        
        return maxLength;
    }
}

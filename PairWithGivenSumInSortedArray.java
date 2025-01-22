class PairWithGivenSumInSortedArray {
 
    int countPairs(int arr[], int target) {
        
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for(int num : arr) {
            int complement = target - num;
            
            if(map.containsKey(complement)) {
                count += map.get(complement);
            }
            
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        return count;
    }
}

class CountDistinctElementsInEveryWindow {
    ArrayList<Integer> countDistinct(int arr[], int k) {
        ArrayList<Integer> result = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        
        int n = arr.length;
        
        for(int i=0;i<k;i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        result.add(map.size());
        
        for(int i=k;i<n;i++) {
            int toRemove = arr[i - k];
            if(map.get(toRemove) == 1) {
                map.remove(toRemove);
            } else {
                map.put(toRemove, map.get(toRemove) - 1);
            }
            
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            
            result.add(map.size());
        }
        
        return result;
    }
}

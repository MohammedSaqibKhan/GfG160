import java.util.HashMap;
import java.util.Map;

public class CountPairsWithGivenSum {

    int countPairs(int arr[], int target) {

        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for(int i=0;i<arr.length;i++) {
            int complement = target - arr[i];
            if(map.containsKey(complement)) {
                count += map.get(complement);
            }
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        return count;
    }
}

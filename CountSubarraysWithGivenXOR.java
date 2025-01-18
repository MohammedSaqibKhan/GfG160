import java.util.HashMap;
import java.util.Map;

public class CountSubarraysWithGivenXOR {

    public long subarrayXor(int arr[], int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int curr = 0;
        long count = 0;
        map.put(0, 1);
        for(int num: arr) {
            curr ^= num;

            int target = curr ^ k;
            if(map.containsKey(target)) {
                count += map.get(target);
            }

            map.put(curr, map.getOrDefault(curr, 0) + 1);
        }

        return count;
    }
}

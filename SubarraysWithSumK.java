import java.util.HashMap;

public class SubarraysWithSumK {

    public int countSubarrays(int arr[], int k) {
        // code here

        int count = 0, currentSum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        for(int num : arr) {
            currentSum += num;
            if(map.containsKey(currentSum - k)) {
                count += map.get(currentSum - k);
            }

            map.put(currentSum, map.getOrDefault(currentSum, 0) + 1);
        }
        return count;
    }
}

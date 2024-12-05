import java.util.*;

public class MajorityElementII {

    public List<Integer> findMajority(int[] nums) {

        Map<Integer, Integer>  hmap = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if(hmap.containsKey(nums[i])) {
                hmap.put(nums[i], hmap.get(nums[i]) + 1);
            } else hmap.put(nums[i], 1);
        }


        int n = nums.length / 3;
        List<Integer> ans = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : hmap.entrySet()) {
            if(entry.getValue() > n) ans.add(entry.getKey());
        }

        Collections.sort(ans);
        return ans;
    }

}

import java.util.HashSet;

public class TwoSum {

    boolean twoSum(int arr[], int target) {
        HashSet<Integer> set = new HashSet<>();
        int len = arr.length;

        if(len == 1) return false;

        for(int i=0;i<len;i++){
            if(set.contains(target - arr[i])) return true;
            set.add(arr[i]);
        }

        return false;
    }
}

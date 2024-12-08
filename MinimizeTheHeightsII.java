import java.util.Arrays;
import java.util.Collections;

public class MinimizeTheHeightsII {

    int getMinDiff(int[] arr, int k) {
        int n = arr.length;
        Arrays.sort(arr);
        int diff = arr[n - 1] - arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] - k < 0) continue;
            int newMin = Math.min(arr[0] + k, arr[i] - k);
            int newMax = Math.max(arr[n - 1] - k, arr[i - 1] + k);
            diff = Math.min(diff, newMax - newMin);
        }

        return diff;
    }
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OverlappingIntervals {

    public List<int[]> mergeOverlap(int[][] arr)  {
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> merged = new ArrayList<>();

        // Step 2: Initialize the current interval with the first interval
        int[] currentInterval = arr[0];
        merged.add(currentInterval);

        for (int[] interval : arr) {
            int currentStart = currentInterval[0];
            int currentEnd = currentInterval[1];
            int nextStart = interval[0];
            int nextEnd = interval[1];

            if (currentEnd >= nextStart) {
                // Overlapping intervals, merge them
                currentInterval[1] = Math.max(currentEnd, nextEnd);
            } else {
                // Non-overlapping interval, add it to the list
                currentInterval = interval;
                merged.add(currentInterval);
            }
        }

        return merged;
    }
}

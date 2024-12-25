import java.util.Arrays;

public class NonOverlappingIntervals {

    static int minRemoval(int intervals[][]) {

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));
        int overlappingCount = 0;
        int lastEnd = Integer.MIN_VALUE;

        for(int[] interval : intervals) {
            if(interval[0] < lastEnd) overlappingCount++;
            else lastEnd = interval[1];
        }
        return overlappingCount;
    }
}

public class NumberOfOccurrence {
    int countFreq(int[] arr, int target) {
        // code here
        int count = 0;
        boolean isTarget = false;
        for(Integer num : arr) {
            if(num == target) {
                count++;
                isTarget = true;
            } else if(num != target && isTarget) break;
        }

        return count;
    }
}

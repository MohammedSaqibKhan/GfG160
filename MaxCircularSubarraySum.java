public class MaxCircularSubarraySum {
    public int circularSubarraySum(int arr[]) {

        int maxKadane = kadane(arr);

        if (maxKadane < 0) {
            return maxKadane;
        }

        int totalSum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
            arr[i] = -arr[i];
        }

        int invertedKadane = kadane(arr);
        int maxCircular = totalSum + invertedKadane;

        return Math.max(maxKadane, maxCircular);
    }


    private static int kadane(int[] arr) {
        int currentMax = arr[0];
        int globalMax = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currentMax = Math.max(arr[i], currentMax + arr[i]);
            globalMax = Math.max(globalMax, currentMax);
        }

        return globalMax;
    }
}


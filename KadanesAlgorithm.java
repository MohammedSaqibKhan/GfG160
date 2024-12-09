public class KadanesAlgorithm {

    int maxSubarraySum(int[] arr) {


        int currentMaximum = arr[0];
        int overallMaximum = arr[0];

        for(int i = 1; i < arr.length; i++) {
            currentMaximum = Math.max(arr[i], currentMaximum + arr[i]);
            if(currentMaximum > overallMaximum) overallMaximum = currentMaximum;

        }

        return overallMaximum;
    }
}

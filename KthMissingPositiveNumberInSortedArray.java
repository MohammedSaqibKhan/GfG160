public class KthMissingPositiveNumberInSortedArray {

    public int kthMissing(int[] arr, int k) {
        // code here

        int n = arr.length;
        int low = 0, high = n - 1;

        while(low <= high) {
            int mid = low + (high - low) / 2;
            int missingCount = arr[mid] - (mid + 1);
            if(missingCount >= k) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        int missingCountAtLow = (low > 0 ? arr[low - 1] - low : 0);
        return (low > 0 ? arr[low - 1] : 0) + (k - missingCountAtLow);
    }
}

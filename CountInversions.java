public class CountInversions {

    public static int mergeAndCount(int[] arr, int[] temp, int left, int right) {
        int mid = (left + right) / 2;
        int i = left;
        int j = mid + 1;
        int k = left;
        int invCount = 0;

        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];

            }
        }


        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // Copy remaining elements from the right subarray
        while (j <= right) {
            temp[k++] = arr[j++];
        }

        // Copy sorted elements back into the original array
        for (i = left; i <= right; i++) {
            arr[i] = temp[i];
        }

        return invCount;
    }


    public static int mergeSortAndCount(int[] arr, int[] temp, int left, int right) {
        int invCount = 0;

        if (left < right) {
            int mid = (left + right) / 2;

            // Count inversions in the left half
            invCount += mergeSortAndCount(arr, temp, left, mid);

            // Count inversions in the right half
            invCount += mergeSortAndCount(arr, temp, mid + 1, right);

            // Count cross inversions during merge
            invCount += mergeAndCount(arr, temp, left, right);
        }

        return invCount;
    }

    static int inversionCount(int arr[]) {

        int[] temp = new int[arr.length];
        return mergeSortAndCount(arr, temp, 0, arr.length - 1);
    }
}

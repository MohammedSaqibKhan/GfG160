public class SortedAndRotatedMinimum {

    public int findMin(int[] arr) {
        int left = 0, right = arr.length - 1;


        if (arr[left] < arr[right]) {
            return arr[left];
        }

        while (left < right) {
            int mid = left + (right - left) / 2;


            if (arr[mid] > arr[right]) {

                left = mid + 1;
            } else {

                right = mid;
            }
        }

        return arr[left];
    }
}


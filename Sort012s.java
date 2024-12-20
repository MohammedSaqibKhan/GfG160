public class Sort012s {

    public void sort012(int[] arr) {
        int low = 0, mid = 0, high = arr.length - 1;

        while (mid <= high) {
            switch (arr[mid]) {
                case 0:
                    // Swap arr[low] and arr[mid], then increment low and mid
                    int temp0 = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp0;
                    low++;
                    mid++;
                    break;

                case 1:
                    // Move mid pointer
                    mid++;
                    break;

                case 2:
                    // Swap arr[mid] and arr[high], then decrement high
                    int temp2 = arr[high];
                    arr[high] = arr[mid];
                    arr[mid] = temp2;
                    high--;
                    break;
            }
        }
    }
}

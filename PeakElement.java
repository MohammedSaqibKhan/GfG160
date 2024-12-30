public class PeakElement {

    public int peakElement(int[] arr) {

        int len = arr.length;

        if(len == 1) return 0;

        if(arr[0] > arr[1]) return 0;

        if(arr[len - 1] > arr[len - 2]) return len - 1;

        int low = 1, high = len - 2;

        while(low <= high) {
            int mid = low + (high - low) / 2;

            if(arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                return mid;
            }

            if(arr[mid] < arr[mid + 1]) {
                low = mid + 1;
            }

            else {
                high = mid - 1;
            }
        }

        return -1;
    }


    public static void main(String[] args) {
        PeakElement peakElement = new PeakElement();
        System.out.println(peakElement.peakElement(new int[]{10, 20, 15, 2, 23, 90, 80}));
    }
}

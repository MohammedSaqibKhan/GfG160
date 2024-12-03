public class ReverseAnArray {

    public void reverseArray(int arr[]) {
        int i=0, j=arr.length-1;
        while(i<j) {
            swapHelper(arr, i, j);
            i++;
            j--;
        }
    }

    public void swapHelper(int arr[], int idx1, int idx2) {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }

}

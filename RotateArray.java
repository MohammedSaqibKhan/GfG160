import java.util.Arrays;

public class RotateArray {

    static void rotateArr(int arr[], int d) {

        int length = arr.length;
        int rotations = d % length;
        reverseArray(arr, 0, rotations - 1);
        reverseArray(arr, rotations, length - 1);
        reverseArray(arr, 0, length - 1);
    }


    public static void reverseArray(int arr[], int i, int j) {
        while(i<j) {
            swapHelper(arr, i, j);
            i++;
            j--;
        }
    }


    public static void swapHelper(int arr[], int idx1, int idx2) {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }
    
}

import java.util.Arrays;

public class MoveAllZeroesToEnd {

    //  [1, 2, 0, 4, 3, 0, 5, 0]
    void pushZerosToEnd(int[] arr) {
        int nonZeroIndex = 0;

        // Traverse the array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                // Swap the current element with the element at the nonZeroIndex
                int temp = arr[nonZeroIndex];
                arr[nonZeroIndex] = arr[i];
                arr[i] = temp;

                // Move the pointer to the next position
                nonZeroIndex++;
            }
        }
    }

    public static void main(String[] args) {
        MoveAllZeroesToEnd move = new MoveAllZeroesToEnd();

        move.pushZerosToEnd(new int[]{1, 2, 0, 4, 3, 0, 5, 0});
    }
}

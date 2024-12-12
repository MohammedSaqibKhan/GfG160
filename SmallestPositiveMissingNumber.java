public class SmallestPositiveMissingNumber {

    public int missingNumber(int[] arr) {
        Arrays.sort(arr);

        int result = 1;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == result) {
                result++;
            }

            else if (arr[i] > result) {
                break;
            }
        }
        return result;
    }
}

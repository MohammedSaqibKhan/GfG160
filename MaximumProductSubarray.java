public class MaximumProductSubarray {

    int maxProduct(int[] arr) {
        int result = arr[0];
        int currentMaximum = arr[0];
        int currentMinimum = arr[0];

        for(int i = 1; i < arr.length; i++) {
            if(arr[i] < 0) {
                int temp = currentMinimum;
                currentMinimum = currentMaximum;
                currentMaximum = temp;
            }

            currentMinimum = Math.min(arr[i], arr[i] * currentMinimum);
            currentMaximum = Math.max(arr[i], arr[i] * currentMaximum);

            result = Math.max(result, currentMaximum);
        }

        return result;
    }
}

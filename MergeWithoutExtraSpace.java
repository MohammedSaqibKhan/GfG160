import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeWithoutExtraSpace {

    public void mergeArrays(int a[], int b[]) {
        int n = a.length;
        int m = b.length;
        
        for (int i = n - 1, j = 0; i >= 0 && j < m; i--, j++) {

            if (a[i] > b[j]) {
                int temp = a[i];
                a[i] = b[j];
                b[j] = temp;
            }
        }

        Arrays.sort(a);
        Arrays.sort(b);
    }
}

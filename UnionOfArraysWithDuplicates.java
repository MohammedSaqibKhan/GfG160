import java.util.HashSet;
import java.util.Set;

public class UnionOfArraysWithDuplicates {

    public static int findUnion(int a[], int b[]) {

        Set<Integer> result = new HashSet<>();

        for(int num: a) {
            result.add(num);
        }

        for(int num: b) {
            result.add(num);
        }

        return result.size();
    }
}

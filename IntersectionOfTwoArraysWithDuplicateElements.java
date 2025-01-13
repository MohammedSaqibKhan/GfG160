import java.util.ArrayList;
import java.util.HashSet;

public class IntersectionOfTwoArraysWithDuplicateElements {

    public ArrayList<Integer> intersectionWithDuplicates(int[] a, int[] b) {
        // code here
        HashSet<Integer> setA = new HashSet<>();
        HashSet<Integer> res = new HashSet<>();

        for(int num : a) {
            setA.add(num);
        }

        for(int num : b) {
            if(setA.contains(num)) res.add(num);
        }

        return new ArrayList<>(res);
    }
}

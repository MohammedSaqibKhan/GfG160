import java.util.ArrayList;

public class KMPAlgorithm {

    ArrayList<Integer> search(String pat, String txt) {
        ArrayList<Integer> result = new ArrayList<>();
        int index = txt.indexOf(pat);

        while (index != -1) {
            result.add(index);
            index = txt.indexOf(pat, index + 1);
        }

        return result;
    }
}

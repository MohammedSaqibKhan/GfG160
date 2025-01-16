import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PrintAnagramsTogether {

    public ArrayList<ArrayList<String>> anagrams(String[] arr) {

        Map<String, ArrayList<String>> map = new HashMap<>();

        for(String str : arr) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);

            map.putIfAbsent(sorted, new ArrayList<>());
            map.get(sorted).add(str);
        }

        return new ArrayList<>(map.values());
    }
}

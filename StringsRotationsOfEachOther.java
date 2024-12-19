public class StringsRotationsOfEachOther {

    public static boolean areRotations(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }
        // Concatenate s1 with itself
        String concatenated = s1 + s1;
        // Use KMP algorithm to check if s2 is a substring of concatenated
        return kmpSearch(concatenated, s2);
    }

    // KMP Algorithm for substring search
    private static boolean kmpSearch(String text, String pattern) {
        int[] lps = computeLPS(pattern);
        int i = 0, j = 0; // i for text, j for pattern

        while (i < text.length()) {
            if (text.charAt(i) == pattern.charAt(j)) {
                i++;
                j++;
                if (j == pattern.length()) {
                    return true; // Match found
                }
            } else if (j > 0) {
                j = lps[j - 1];
            } else {
                i++;
            }
        }
        return false; // No match found
    }

    // Compute Longest Prefix Suffix (LPS) array for KMP
    private static int[] computeLPS(String pattern) {
        int[] lps = new int[pattern.length()];
        int length = 0;
        int i = 1;

        while (i < pattern.length()) {
            if (pattern.charAt(i) == pattern.charAt(length)) {
                length++;
                lps[i] = length;
                i++;
            } else if (length > 0) {
                length = lps[length - 1];
            } else {
                lps[i] = 0;
                i++;
            }
        }
        return lps;
    }
}

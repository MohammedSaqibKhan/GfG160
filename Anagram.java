public class Anagram {

    public static boolean areAnagrams(String s1, String s2) {


        if (s1.length() != s2.length()) {
            return false;
        }


        char[] charArray1 = s1.toCharArray();
        char[] charArray2 = s2.toCharArray();


        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }
}

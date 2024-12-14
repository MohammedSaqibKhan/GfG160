public class AddBinaryStrings {
    public String addBinary(String s1, String s2) {
        s1 = s1.replaceFirst("^0+(?!$)", "");
        s2 = s2.replaceFirst("^0+(?!$)", "");

        StringBuilder result = new StringBuilder();
        int carry = 0;


        int i = s1.length() - 1;
        int j = s2.length() - 1;

        while (i >= 0 || j >= 0 || carry == 1) {

            int bit1 = i >= 0 ? s1.charAt(i) - '0' : 0;
            int bit2 = j >= 0 ? s2.charAt(j) - '0' : 0;

            int sum = bit1 + bit2 + carry;

            result.append(sum % 2);


            carry = sum / 2;


            i--;
            j--;
        }


        return result.reverse().toString();
    }
}

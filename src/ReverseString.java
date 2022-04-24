public class ReverseString {

    public static void main(String[] args) {
        char[] h = {'H', 'a', 'n', 'n', 'a', 'h'};
        char[] b = {'A', ' ', 'm', 'f'};
        System.out.println(reverseString(b));
    }

    public static String reverseString(String str) {
        if (str == null) {
            return null;
        }

        StringBuilder strBr = new StringBuilder();
        for (int j = str.length() - 1; j >= 0; j--) {
            strBr.append(str.charAt(j));
        }

        return strBr.toString();
    }

    public static char[] reverseString(char[] str) {

        int a_pointer = 0;
        int b_pointer = str.length - 1;

        while (a_pointer <= b_pointer) {
            char temp = str[a_pointer];
            str[a_pointer] = str[b_pointer];
            str[b_pointer] = temp;

            a_pointer++;
            a_pointer--;
        }
        return null;
    }
}


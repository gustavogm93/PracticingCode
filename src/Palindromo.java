public class Palindromo {

    public static void main(String[] args) {
        boolean a = isValidPalindrome("0P");
        System.out.println(a);
    }

    //valid palindrome
    public static boolean isValidPalindrome(String str) {
        char[] cleanStr = new char[str.length()];
        int j = 0;
        for (int i = 0; i < str.length(); i++) {
            if (isLetterOrDigit(str.charAt(i))) {
                cleanStr[j] = toLowerCase(str.charAt(i));
                j++;
            }
        }
        j--;
        int k = 0;
        while (j >= 0) {
            if (cleanStr[j] != cleanStr[k]) {
                return false;
            }
            j--;
            k++;
        }

        return true;
    }

    //check if character is a letter or digit
    public static boolean isLetterOrDigit(char c) {
        return Character.isLetter(c) || Character.isDigit(c);
    }


    //convert char to lower case char
    public static char toLowerCase(char c) {
        if (c >= 'A' && c <= 'Z') {
            return (char) (c + 32);
        }
        return c;
    }

}

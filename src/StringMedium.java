import java.util.HashMap;
import java.util.Map;

public class StringMedium {

    public static void main(String[] args) {

    }

    public static String getLongestPalindrome(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        Map<Character, Integer> ubicationLeft = new HashMap<>();
        Map<Character, Integer> ubicationRigth = new HashMap<>();

        for (int i = 0, j = str.length() - 1; i != j; i++, j--) {
            if (str.charAt(i) == str.charAt(j)) {
                //do encounter
            }

            if (ubicationLeft.get(str.charAt(j)) != null) {
                //do encounter ubication VALUE + i
                String palindrome = getPalindrome(ubicationLeft.get(str.charAt(j)), j, str);
                if (palindrome.isEmpty()) {
                    ubicationLeft.remove(str.charAt(j));
                    continue;
                }
            }

            if (ubicationRigth.get(str.charAt(i)) != null) {
                //do cuentuenter

                //if() cuenter positive return else
            }
            ubicationLeft.put(str.charAt(i), i);
            ubicationRigth.put(str.charAt(j), j);
        }

        return "";
    }

    //execute encounter return word o null
    public static String getPalindrome(int a, int b, String str) {
        StringBuilder stringBuilderInit = new StringBuilder();
        StringBuilder stringBuilderEnd = new StringBuilder();
        int i = a;
        int j = b;
        while (a != j) {
            if (str.charAt(i) != str.charAt(j)) {
                return "";
            }
            stringBuilderInit.append(str.charAt(i));
            stringBuilderEnd.append(str.charAt(j));
            i++;
            j--;
        }
        stringBuilderInit.append(str.charAt(i));
        return stringBuilderInit.append(stringBuilderEnd.reverse()).toString();
    }


}


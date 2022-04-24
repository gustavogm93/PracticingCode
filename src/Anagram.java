import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {

    }


    //Valid anagram
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();
        Arrays.sort(sChar);
        Arrays.sort(tChar);
        return Arrays.equals(sChar, tChar);
    }

    public boolean isAnagramMostRobust(String str1, String str2) {
        if (str1.isEmpty() || str2.isEmpty()) {
            return false;
        }
        if (str1.length() != str2.length()) {
            return false;
        }
        int[] abcArray = new int[26];

        for (int i = 0; i < str1.length(); i++) {
            abcArray[str1.charAt(i) - 'a']++;
            abcArray[str2.charAt(i) - 'a']--;
        }

        for (int a : abcArray) {
            if (a != 0) {
                return false;
            }
        }
        return true;

    }
}

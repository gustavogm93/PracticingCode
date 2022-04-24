public class ValidAnagram {

    public static void main(String[] args) {

        //isvalidanagram test
        System.out.println(isAnagram("anagram1", "2nagaram"));
    }

    public static boolean isAnagram(String str1, String str2) {
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


public class FirstUniqueCharacterString {

    public static void main(String[] args) {
        FirstUniqueCharacterString f = new FirstUniqueCharacterString();
        System.out.println(f.firstIndexOfNonDuplicated("loveleetcode"));
    }


    public int firstIndexOfNonDuplicated(String s) {
        int result = Integer.MAX_VALUE;

        for (char c = 'a'; c <= 'z'; c++) {
            int index = s.indexOf(c);

            if (index != -1 && index == s.lastIndexOf(c)) {
                result = Math.min(result, index);
            }
        }

        if (result == Integer.MAX_VALUE) {
            return -1;
        }

        return result;
    }

}


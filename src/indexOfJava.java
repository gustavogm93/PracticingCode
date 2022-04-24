public class indexOfJava {

    public static void main(String[] args) {
        System.out.println(indexOf("mississippi", "sippi"));
    }


    //strStr()
    public static int indexOf(String s, String t) {
        if (t.length() == 0) {
            return 0;
        }
        // loop over string s until s.length-t.length+1
        for (int i = 0; i < s.length() - t.length() + 1; i++) {
            // if last character in t doesn't match with index in s, continue
            if (s.charAt(i + t.length() - 1) != t.charAt(t.length() - 1)) {
                continue;
            }

            // move a pointer j through t as long as the substring in s and
            // the entire t match
            int j = 0;
            while (j < t.length() && s.charAt(i + j) == t.charAt(j)) {
                j++;
            }

            // if we've matched the entire needle, return the index of i
            if (j == t.length()) {
                return i;
            }
        }
        return -1;
    }


}

import java.util.Arrays;

public class indexOfMultiple {

    public static void main(String[] args) {
        String[] a = new String[]{"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(a));
    }

    //sort string array by string length
    public static void sortByLength(String[] strs) {
        Arrays.sort(strs, (a, b) -> a.length() - b.length());
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        if (strs.length == 1) {
            return strs[0];
        }

        //sort str by length
        Arrays.sort(strs, (a, b) -> a.length() - b.length());

        int j = 1;
        for (int k = strs[0].length(); k >= 1; k--) {
            j = 1;
            while (j < strs.length) {
                String toFind = strs[0].substring(0, k);
                boolean index = strs[j].startsWith(toFind);
                if (index) {
                    j++;
                    if (j == strs.length) {
                        return toFind;
                    }
                } else {
                    break;
                }
            }
        }
        return "";
    }
}

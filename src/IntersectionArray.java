import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class IntersectionArray {


    public static void main(String[] args) {
        int[] ar1 = {4, 3, 2, 1};
        int[] ar2 = {4, 8, 1};
        String test1 = "pwwkew";
        String test = "abcffffabcdgfabcfgkbb";
        System.out.println(longestSubs(test1));
        IntersectionArray a = new IntersectionArray();
    }


    public static List<Integer> listOfInts(int[] ar1, int[] ar2) {
        int i = 0, j = 0;
        List<Integer> list = new ArrayList<>();
        String ar = "1234567890";

        for (Character a : ar.toCharArray()) {
            System.out.println(Integer.valueOf(a) - 48);
        }


        Arrays.sort(ar1);
        Arrays.sort(ar2);

        while (i < ar1.length && j < ar2.length) {
            if (ar1[i] > ar2[j]) {
                j++;
            } else if (ar1[i] < ar2[j]) {
                i++;
            } else {
                list.add(ar1[i]);
                i++;
                j++;
            }
        }
        return list;
    }

    public static int longestSubs(String a) {
        Set<Character> setOfChars = new HashSet<>();
        int l = 0;
        int res = 0;
        for (int i = 0; i < a.length(); i++) {
            while (setOfChars.contains(a.charAt(i))) {
                setOfChars.remove(a.charAt(i));
                l += 1;
            }
            setOfChars.add(a.charAt(i));
            res = Math.max(res, i - l + 1);
        }
        return res;

    }

    public static int longestSubstringLenght(String s) {
        int max = 0;
        int start = 0;
        int end = 0;
        Map<Character, Integer> map = new HashMap<>();
        while (end < s.length()) {
            char c = s.charAt(end);
            if (map.containsKey(c)) {
                start = Math.max(start, map.get(c) + 1);
            }
            map.put(c, end);
            end++;
            max = Math.max(max, end - start);
        }
        return max;
    }


    public int minPartitions(String n) {
        if (n.length() == 1) {
            if (n.equalsIgnoreCase("1")) {
                return 1;
            }
            return 0;
        }

        int max = Integer.MIN_VALUE;
        for (Character a : n.toCharArray()) {
            if (Integer.valueOf(a) > max) {
                max = Integer.valueOf(a);
            }
        }
        return (max - 48);

    }


}



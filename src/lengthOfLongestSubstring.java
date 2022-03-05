import java.util.HashMap;
import java.util.Map;

public class lengthOfLongestSubstring {

//    Given a string s, find the length of the longest substring without repeating characters.
//
//
//
//            Example 1:
//
//    Input: s = "abcabcbb"
//    Output: 3
//    Explanation: The answer is "abc", with the length of 3.
//    Example 2:
//
//    Input: s = "bbbbb"
//    Output: 1
//    Explanation: The answer is "b", with the length of 1.
//    Example 3:
//
//    Input: s = "pwwkew"
//    Output: 3
//    Explanation: The answer is "wke", with the length of 3.
//    Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
//
//
//            Constraints:
//
//            0 <= s.length <= 5 * 104
//    s consists of English letters, digits, symbols and spaces.
        public int lengthOfLongestSubstring(String s) {
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
}

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class twoSum {

    public static void main(String[] args) {
        int[] nums = {9, 2, 4, 108, 0, 3, 2, 7, 109};
        System.out.println(Arrays.toString(twoSum(nums, 217)));
    }

    public static int[] twoSum(int[] nums, int target) {
        {
            int n = nums.length;
            HashMap<Integer, Integer> map = new HashMap<>();
            int[] res = new int[2];
            for (int i = 0; i < n; i++) {
                int x = target - nums[i];
                if (map.containsKey(x)) {
                    res[0] = map.get(x);
                    res[1] = i;
                    return res;
                }
                map.putIfAbsent(nums[i], i);
            }
            return res;
        }
    }

    public static int[] getTwoSum(int[] nums, int target) {
        int[] res = new int[2];
        if (target == 0) {
            return null;
        }

        Map<Integer, Integer> numsMap = new HashMap<>();

        //fill HM
        for (int i = 0; i < nums.length; i++) {
            numsMap.put(nums[i], i);
        }


        for (int i = 0; i < nums.length; i++) {

            int toFind = target - nums[i];
            Integer val = numsMap.get(toFind);

            if (null != val) {
                if (i == val) {
                    continue;
                }
                res[0] = i;
                res[1] = val;
                break;
            }

        }

        return res;

    }

}

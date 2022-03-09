import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public static void main(String[] args) {

        int[] arr = {90, 91, 50, 487, 48, 50, 7, 7, 8, 9, 10};
        System.out.println(containsDuplicate2(arr));
    }


    public static boolean containsDuplicate(int[] nums) {

        if (nums == null || nums.length == 0) {
            return false;
        }

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (!set.add(nums[i])) {
                return true;
            }
        }
        return false;
    }

    public static boolean containsDuplicate2(int[] nums) {

        for (int i = 1; i < nums.length; i++) {

            int j = i - 1;
            int n = nums[i];


            while (j >= 0 && nums[j] >= n) {

                if (nums[j] == n) {
                    return true;
                }

                nums[j + 1] = nums[j];

                j--;
            }

            nums[j + 1] = n;
        }

        return false;
    }

}
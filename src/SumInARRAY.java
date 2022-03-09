import java.util.Arrays;

public class SumInARRAY {

    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 1};
        int[] nums2 = {9, 9, 9, 9};
        System.out.println(Arrays.toString(sumArray(nums2)));
    }


    public static int[] sumArray(int[] nums) {
        int nines = 0;
        boolean continueNine = false;

        for (int j = nums.length - 1; j >= 0; j--) {
            if (nums[j] != 9 && nines == 0) {
                nums[j] = nums[j] + 1;
                return nums;
            }
            if (nums[j] == 9) {
                nines++;
            } else {
                break;
            }
        }
        boolean isFullyNines = nines == nums.length;

        if (isFullyNines) {
            int[] arrayWithNinesOrZeros = new int[nums.length + 1];
            for (int i = 0; i < arrayWithNinesOrZeros.length; i++) {
                if (i == 0) {
                    arrayWithNinesOrZeros[i] = 1;
                }

                if (i != 0) {
                    arrayWithNinesOrZeros[i] = 0;
                }

            }

            return arrayWithNinesOrZeros;
        } else {

            for (int i = nums.length - 1; i >= 0; i--) {
                if (nines > 0) {
                    nums[i] = 0;

                }
                nines--;
                if (nines == -1) {
                    nums[i] = nums[i] + 1;
                }

            }
            return nums;


        }

    }
}

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {
        RemoveDuplicatesFromSortedArray r = new RemoveDuplicatesFromSortedArray();
        int[] nums = {7, 2, 3, 6, 1, 8, 2, 8, 1, 6, 4, 2, 13, 12, 9, 18, 102};
        int[] numsPar = {9, 4, 6, 8, 10, 12, 11, 3, 4, 18};
        int[] dplicateNums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(r.removeDuplicateBestSolution(numsPar));
        System.out.println(Arrays.toString(numsPar));
    }

    public int removeDuplicates(int[] nums) {
        int index = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                nums[index++] = nums[i + 1];
            }

        }
        System.out.println(index);
        return index;
    }

    public int removeDuplicates2(int[] nums) {
        int index = 0;
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] != nums[index]) {
                index++;
                nums[index] = nums[i];
            }


        }
        System.out.println(index);
        return index;
    }


    public int removeDuplicateBestSolution(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int l, r;
        for (l = 0, r = 1; r < nums.length; r++) {
            if (nums[l] < nums[r]) {
                nums[l + 1] = nums[r];
                l++;
            }
        }
        return l + 1;
    }


    //split into odd and even
    public int splitInOddAndEven(int[] nums) {
        int i = 0;
        int k = nums.length - 1;
        for (int j = 0; j < nums.length - 1 || j == k; j++) {
            if (nums[j] % 2 != 0) {
                System.out.println(Arrays.toString(nums));

                while (k > j && nums[k] % 2 != 0) {
                    k--;
                }
                if (k > j) { //one time swap
                    i++;
                    swapArray(nums, j, k);
                }

            }
        }
        return i;
    }

    public void swapArray(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

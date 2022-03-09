import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {
        RemoveDuplicatesFromSortedArray r = new RemoveDuplicatesFromSortedArray();
        int[] nums = {7, 2, 3, 6, 1, 8, 2, 8, 1, 6, 4, 2, 13, 12, 9, 18, 102};
        int[] numsPar = {9, 4, 6, 8, 10, 12, 11, 3, 4, 18};
        int[] dplicateNums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(r.sendDuplicatesToBeginArray(dplicateNums));
    }

    public static Integer mult(int i) {
        return i * 2;
    }

    public int sendDuplicatesToBeginArray(int[] nums) {
        Arrays.sort(nums);
        int i = nums.length - 1;

        for (int j = nums.length - 2; j > 0; j--) {
            if (nums[i] != nums[j]) {
                i--;
                nums[i] = nums[j];
            }
        }
        int[] numa = nums;
        numa[2] = 5;
        System.out.println(Arrays.toString(numa));
        List<Integer> a = Arrays.stream(nums).map(RemoveDuplicatesFromSortedArray::mult).boxed().collect(toList());
        // Arrays.sort(numa, Collections.reverseOrder());

        System.out.println(Arrays.toString(nums));
        return 1;
    }

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        System.out.println(Arrays.toString(nums));

        return i + 1;
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

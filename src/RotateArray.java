import java.util.Arrays;

public class RotateArray {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        RotateArray ra = new RotateArray();
        ra.rotateArrayWithExtraMemory(nums, 3);
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void reverse(int[] nums, int i, int j) {
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }

    }

    public static void fullyArray(int[] array, int[] arrayCopy) {
        if (array.length != arrayCopy.length) {
            return;
        }

        for (int i = 0; i < array.length; i++) {
            arrayCopy[i] = array[i];
        }
    }

    public int[] rotateArrayWithExtraMemory(int[] nums, int k) {
        int[] arr = new int[nums.length];

        fullyArray(nums, arr);

        int pos = 0;
        System.out.println(arr.length);
        System.out.println(nums.length);
        for (int i = 0; i < nums.length; i++) {
            pos = k + i;

            if (pos >= nums.length) {
                pos = pos - arr.length;
            }
            nums[pos] = arr[i];

        }
        return nums;
    }

    public void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }
}

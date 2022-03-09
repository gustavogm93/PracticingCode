import java.util.Arrays;

public class moveZeros {


    public static void main(String[] args) {
        int[] nums = {0, 1, 3, 0, 0, 4, 5, 0, 7};
        System.out.println(Arrays.toString(moveZeros(nums)));

    }


    public static int[] moveZeros(int[] nums) {

        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index++] = nums[i];

            }
        }

        for (int i = index; i < nums.length; i++) {
            nums[i] = 0;
        }

        return nums;

    }


}

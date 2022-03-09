import java.util.Arrays;

public class SingleNumber {


    public static void main(String[] args) {
        int[] test1 = {2, 2, 1};
        int[] test2 = {4, 1, 2, 1, 2};

        System.out.println(singleNumber3(test1));
        System.out.println(singleNumber3(test2));
    }

    public static int singleNumber(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 2; i++) {

            if (arr[i] != arr[i + 1]) {

                if (i == 0) {
                    return arr[i];
                }

                return arr[i - 1] != arr[i] ? arr[i] : arr[i + 1];
            }
            i++;
        }
        return arr[arr.length - 1];
    }


    public static int singleNumber3(int[] nums) {
        Arrays.sort(nums);

        if (nums.length == 1) {
            return nums[0];
        }

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                i++;
                continue;
            } else {
                return nums[i];
            }

        }


        return nums[nums.length - 1];
    }
}

import java.util.Arrays;

public class DuplicateNumber {

    public static void main(String[] args) {

    }


    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length == 0 || nums2.length == 0) {
            return new int[0];


        }

        int[] result = new int[nums1.length + nums2.length];
        int index = 0;
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    result[index++] = nums1[i];
                }
            }
        }

        return Arrays.copyOf(result, index);
    }

}

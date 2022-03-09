import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrayIntersection {


    public static void main(String[] args) {
        //Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
        //Output: [4,9]
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {0, 4, 1, 8, 4, 9, 8, 5};

        int[] result = intersects(nums1, nums2);
        System.out.println(Arrays.toString(result));
    }

    // Intersection of Two Arrays II
    // Given two arrays, write a function to compute their intersection.
    public static int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        HashMap<Integer, Integer> intersection = new HashMap<>();

        for (int i = 0; i < nums1.length; i++) {
            map.put(nums1[i], map.getOrDefault(nums1, 1));
        }

        System.out.println(map);
        List<Integer> list = new ArrayList<>();
        List<Integer> listTemp = new ArrayList<>();

        boolean stop = false;
        for (int j = 0; j < nums2.length; j++) {

            int val = map.getOrDefault(nums2[j], 0);
            if (val > 0) {
                stop = true;
                list.add(nums2[j]);
                map.getOrDefault(nums2[j], val--);
            }
        }

        System.out.println(list);

        return null;


    }

    public static int[] intersects(int[] nums1, int[] nums2) {
        //tecnica para ordenar array y poner el menor siempre en el nums1
        if (nums1.length > nums2.length) {
            return intersects(nums2, nums1);
        }


        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        System.out.println(map);

        List<Integer> list = new ArrayList<>();
        for (int num : nums2) {
            int counts = map.getOrDefault(num, 0);
            if (counts > 0) {
                list.add(num);
                map.put(num, counts - 1);
            }
        }
        int[] res = new int[list.size()];
        int i = 0;
        for (int num : list) {
            res[i++] = num;
        }

        return res;
    }
}
//Sort the arrays



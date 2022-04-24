import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class hackerrank {


    public static void main(String[] args) {
        List<Integer> list = List.of(8, 2, 4, 6);
        int x = 2;
        System.out.println(segment2(x, list));
    }


    public static int segment(int x, List<Integer> list) {
        if (list.size() == x) {
            return Collections.min(list);
        }
        int maxOfMin = 0;
        boolean firstChange = false;
        for (int i = 0; i <= list.size() - x; i++) {
            int minPerSegment = list.get(i);
            int length = 1;
            while (length < x) {
                int newVal = list.get(i + length);
                minPerSegment = Math.min(minPerSegment, newVal);
                length++;
            }
            maxOfMin = Math.max(minPerSegment, maxOfMin);
            firstChange = true;
        }
        return maxOfMin;
    }


    public static int segment2(int x, List<Integer> list) {
        if (list.size() == x) {
            return Collections.min(list);
        }
        int maxOfMin = 0;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i <= list.size() - x; i++) {
            List<Integer> subList = new ArrayList<>(list.subList(i, (i + x)));
            Collections.sort(subList);

            minHeap.add(subList.get(0));
        }
        maxOfMin = minHeap.poll();
        return maxOfMin;
    }


}


/*

    public static int segment(int x, List<Integer> list) {
        if (list.size() == x) {
            return Collections.min(list);
        }
        int maxOfMin = 0;
        for (int i = 0; i <= list.size() - x; i++) {
            int minPerSegment = list.get(i);
            int length = 1;
            while (length < x) {
                int newVal = list.get(i + length);
                minPerSegment = Math.min(minPerSegment, newVal);
                length++;
            }
            maxOfMin = Math.max(minPerSegment, maxOfMin);
        }
        return maxOfMin;
    }
 */
public class BinarySearch {

    public static int search(int[] a, int key) {
        int low = 0;
        int high = a.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (key < a[mid]) {
                high = mid - 1;
            } else if (key > a[mid]) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(firstBadVersion(5));
    }

    public static int firstBadVersion(int n) {
        if (n == 1) {
            return 1;
        }
        int high = n; // 10;

        int low = high / 2;  //5

        if (isBadVersion(low)) {
            if (low == 1) {
                return low;
            }

            while (isBadVersion(low)) { //1
                low = low / 2;  //2
            }

            while (!isBadVersion(low)) {

                low++;
            }
            low++;

        } else {
            while (!isBadVersion(low)) { // 1 2 3 4 5 6
                low = low * 2;
            }
            if (!isBadVersion(low - 1)) {
                return low;
            }
            while (isBadVersion(low)) {

                low--;
            }
            low--;

        }
        return low;


    }

    public static boolean isBadVersion(int i) {

        if (i >= 4) {
            return true;
        }

        return false;
    }
}

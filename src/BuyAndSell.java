public class BuyAndSell {

    public static void main(String[] args) {
        int[] nums = {7, 1, 5, 3, 6, 4};
        System.out.println(buyAndSellM(nums));
    }

    public static int buyAndSellM(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }

        int acc = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                acc += arr[i + 1] - arr[i];
            }

        }
        return acc;
    }
}

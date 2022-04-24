public class reverseInt {

    public static String minInt = "-2147483648";
    public static String maxInt = "2147483647";

    public static void main(String[] args) {
        int a = -2147483412;
        System.out.println(reverseGood(a));

    }

    public static int reverseGood(int x) {
        long ans = 0;
        while (x != 0) {
            ans = (x % 10) + ans * 10;
            x = x / 10;
            if (ans >= Integer.MAX_VALUE || ans <= Integer.MIN_VALUE) {
                return 0;
            }
        }
        return (int) ans;
    }

    public static int checkIfExcedsMaxOrMinInteger(String numStr, boolean isNegative) {
        String toCompare = isNegative ? minInt : maxInt;
        int minI = isNegative ? 1 : 0;
        for (int i = 0; i < numStr.length(); i++) {

            if (numStr.charAt(i) < toCompare.charAt(i)) {
                break;
            }

            if (numStr.charAt(i) > toCompare.charAt(i)) {
                return 0;
            }

        }
        return Integer.parseInt(numStr);
    }

    public static String reverseNumericString(String str, boolean isNegative) {
        if (str.isEmpty()) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        int minI = isNegative ? 1 : 0;
        if (isNegative) {
            stringBuilder.append("-");
        }

        for (int i = str.length() - 1; i >= minI; i--) {
            stringBuilder.append(str.charAt(i));
        }
        return stringBuilder.toString();
    }

    public static int reverse(int num) {
        if ((num < 10 && num >= 0)) {
            return num;
        }

        String numText = String.valueOf(num);
        boolean isNegative = numText.charAt(0) == '-';
        int maxLength = isNegative ? minInt.length() : maxInt.length();

        if (numText.length() > maxLength) {
            return 0;
        }
        String reversedNumText = reverseNumericString(numText, isNegative);

        if (numText.length() < maxLength) {
            return Integer.parseInt(reversedNumText);
        }
        //equals length
        return checkIfExcedsMaxOrMinInteger(reversedNumText, isNegative);
    }


}

public class StringToInt {

    public static void main(String[] args) {
        System.out.println(myAtoi("                 1"));
    }

    //String to Integer (atoi)
    public static int myAtoi(String s) {
        if (s == null) {
            return 0;
        }
        int i = 0, n = s.length();
        long result = 0, sign = 1;
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }
        if (i >= n) {
            return 0;
        }
        if (s.charAt(i) == '+' || s.charAt(i) == '-') {
            sign = (s.charAt(i) == '+') ? 1 : -1;
            i = i + 1;
        }
        if (i >= n) {
            return 0;
        }

        while (i < n && Character.isDigit(s.charAt(i)) == true) {
            result = result * 10 + (s.charAt(i++) - '0');
            if (result * sign < Integer.MIN_VALUE || result * sign > Integer.MAX_VALUE) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
        }

        return (int) (sign * result);
    }

}

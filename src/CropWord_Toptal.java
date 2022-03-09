public class CropWord_Toptal {


    public static void main(String[] args) {
        System.out.println(trimEnd2("  hello  ") + ">");

    }

    //remove all spaces from the end of the string
    public static String trimEnd2(String message) {
        int k = message.length() - 1;
        while (message.charAt(k) == ' ') {
            k--;
        }
        return message.substring(0, k + 1);
    }

    public static String cropWord(String message, int k) {

        if (k == message.length() || k > message.length() || message.charAt(k) == ' ') {
            return trimEnd2(message);
        }

        //message char at K != ' '
        if (message.charAt(k + 1) == ' ') {
            return message;
        } else {
            //message char at k + 1 != ' ' //Improve time complexity!.
            return message.substring(0, message.substring(0, k).lastIndexOf(' '));
        }

    }

}
import java.util.Arrays;

public class Codility {


    public static void main(String[] args) {

        solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});


    }


    /*
        public static String returnString(String message, int k) {
            if (message.length() < k) {
                return message;
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < k; i++) {
                sb.append(message.charAt(i));
            }

            String cropedMessage = sb.toString();

            int lastIndexOfLastSpace = cropedMessage.lastIndexOf(" ");
            String lastWordOnCroppedMessage = cropedMessage.substring(lastIndexOfLastSpace + 1);
            String lastWordOnRealMessage = message.substring(lastIndexOfLastSpace + 1);

            int lastIndexSpaceOnLeftWordMessage = lastWordOnRealMessage.indexOf(" ") + lastWordOnRealMessage.length();


            System.out.println(lastIndexSpaceOnLeftWordMessage);
            // get first word on real message
            String firstWordOnRealMessage = message.substring(0, lastIndexOfLastSpace);

            System.out.println(lastWordOnCroppedMessage);

            System.out.println(lastWordOnRealMessage);

            return sb.toString();

        }
    */
    public static int getNextSpace(String message, int index) {
        int nextSpace = message.indexOf(" ", index);
        return nextSpace;
    }

    /*
    A group of friends is going on holiday together. They have come to a meeting point (the start of
    the journey) using N cars. There are P[K]




     */
    // write a function which, given an array of Integers A of Length N, returns the minimum number of filters needed to reduce the total pollution by at least half
    public static int solution(int[] A) {
        //result sum of all numbers in array int
        int sumOfPollution = sum(A);
        int minPollution = sumOfPollution / 2;
        Arrays.sort(A);
        int accumulatedPollution = 0;
        int temporalPollution = 0;
        int filters = 0;
        int temporalReduce = 0;
        for (int i = A.length - 1; i >= 0 || temporalPollution > minPollution; i++) {

            while (temporalPollution < minPollution && i > 1) {
                i--;
                temporalPollution += (double) A[i] / 2;
                if (temporalPollution > A[i--]) {
                    accumulatedPollution += temporalPollution;
                    filters++;
                }
            }

        }


        return filters;
    }


    //result sum of all numbers in array int
    public static int sum(int[] A) {
        int result = 0;
        for (int i = 0; i < A.length; i++) {
            result += A[i];
        }
        return result;
    }

}

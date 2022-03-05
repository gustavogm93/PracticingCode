import java.util.Arrays;
import java.util.HashMap;

public class test {


    public static void main(String[] args) {
        int[] a = {-1, -3};
        int[] b = {-1, -3, -5};
        int[] c = {1, 3, 6, 4, 1, 2};
        int[] d = {-1, 4, -5, -7, -9};
        String[] input = {"word", "world", "row"};
        String order = "worldabcefghijkmnpqstuvxyz";
        isAlienSorted(input, order);
/*
        if(solution(a) == 1) {
            System.out.println("Test 1 passed");
        } else {
         System.out.println("Test 1 failed");
        }


        if(solution(b) == 1) {
            System.out.println("Test 1 passed");
        } else {
            System.out.println("Test 1 failed");
        }

        if(solution(c) == 1) {
            System.out.println("Test 1 passed");
        } else {
            System.out.println("Test 1 failed");
        }
*/
    }
/*
    //leet code minimum domino rotations for equal row
    public static int solution(int[] A) {
        int min = Integer.MAX_VALUE;
        int[] B = new int[A.length];
        int[] C = new int[A.length];

        for(int i = 0; i < A.length; i++) {
            B[i] = A[i];
            C[i] = A[i];
        }

        Arrays.sort(B);
        Arrays.sort(C);

        for(int i = 0; i < A.length; i++) {
            if(B[i] != C[i]) {
                min = Math.min(min, Math.abs(B[i] - C[i]));
            }
        }

        return min;
    }


    public static int solution(int[] numArray) {
        if(numArray.length == 0) return 0;

        if(numArray.length == 1) return numArray[0] < 1  ? 1 : numArray[0] + 1;

        int amountNegativesOrZeroValues = 0;
        Arrays.sort(numArray);
            //get two smallest number
            int min1 = Integer.MAX_VALUE;
            int min2 = Integer.MAX_VALUE;
            int resultAfterLoopingAllNumbers = 1;

            for (int j = 0, i = 1; i < numArray.length; j++, i++) {
                if(numArray[i] < 0) {
                    amountNegativesOrZeroValues++;
                    if(i + 1 == numArray.length && numArray[i] < 0) {
                        amountNegativesOrZeroValues++;
                    }
                    continue;


                }

               if(numArray[i] == numArray[j]){
                   continue;
               }
                if(numArray[j] + 1 < numArray[i]){
                    return numArray[j] + 1;
                }

            }
        resultAfterLoopingAllNumbers =  amountNegativesOrZeroValues == numArray.length ? 1 : numArray[numArray.length - 1] + 1;

        return resultAfterLoopingAllNumbers;
    }


 */

    public static boolean isAlienSorted(String[] words, String order) {
       // HashMap<String, Integer> alienOrder = new HashMap<>();
        int[] alienOrder = new int[26];
        //In order to introduce Characters in a Normally Alphabetical Order [26] you should restar con 'a' minuscula.

        for (int i = 0; i < order.length(); i++) {
            System.out.print((int) order.charAt(i) + " ");

            alienOrder[order.charAt(i) - 'a'] = i;
            //Esto tiene el orden siempre alfabetico real. pero le da la posicion en el order trucho
            //EJ: Alfabeto normal a pos = 1
            //EJ: Alfabeto trucho a pos = 5

        }

        System.out.println((int) 'a');
    /*
        for (int j = 0; j < order.length(); j++) {
            char a = (char) (alienOrder[j] + 'a');
            System.out.println(a);
        } */

        System.out.println(Arrays.toString(alienOrder));

        return true;
    }

}



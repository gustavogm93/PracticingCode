import java.util.Arrays;

public class CarsAndSeats_Toptal {

    public static void main(String[] args) {
        int[] s1 = {5, 5, 2, 5}; //3
        int[] p1 = {4, 4, 2, 4};

        int[] s2 = {2, 5, 7, 2};
        int[] p2 = {2}; //2

        int[] p3 = {1, 4, 1};
        int[] s3 = {1, 5, 1}; //2

        //System.out.println(seatsAndCars2(s1, p1));
        System.out.println(seatsAndCars2(s2, p2));
        System.out.println(seatsAndCars2(s3, p3));
    }

    public static int seatsAndCars2(int[] s, int[] p) {
        if (sumArray(s) < sumArray(p)) {
            return -1;
        }

        sortDesc(s);
        int[] replic = Arrays.copyOf(s, s.length);
        System.out.println(Arrays.toString(s));
        System.out.println(Arrays.toString(p));
        sortDesc(p);
        int car = 0;
        int i = 0;
        int j = p.length - 1;

        while (i < s.length && j >= 0) {
            if (s[i] >= p[j]) {
                s[i] = s[i] - p[j];
                p[j] = 0;

                j--;
                if (s[i] == 0) {
                    i++;
                }

            } else {
                int temp = s[i];
                s[i] = 0;
                p[j] = p[j] - temp;
                i++;

            }
        }
        System.out.println(Arrays.toString(s));
        for (int k = 0; k < s.length; k++) {
            if (replic[k] > s[k]) {
                car++;
            }
        }
        return car;
    }


    //save additional use of cars: write a function which takes P[] persons S[seats]
    public static int seatsAndCars(int[] s, int[] p) {
        if (sumArray(s) < sumArray(p)) {
            return -1;
        }
        sortDesc(s);
        sortDesc(p);
        System.out.println(Arrays.toString(s));
        System.out.println(Arrays.toString(p));
        int car = 0;
        int j = p.length - 1;
        for (int i = 0; i < s.length; i++) {
            if (p[i] == 0) {
                continue;
            }

            int left = s[i] - p[i];

            while (left > 0 && j >= 0 && p[j] > 0) {

                if (left >= p[j]) {
                    int temp = left - p[j];
                    left = left - p[j];
                    p[j] = temp - p[j];
                    j--;
                } else {
                    left = p[j] - left;
                    p[j] = left;
                }
            }
            if (left > 0 && i + 1 < s.length && p[i + 1] == 0) {
                car++;
            }

            if (left < 0) {
                int rest = p[j] - left;
                p[i + 1] += rest;
                left = 0;
            }


            if (left >= 0) {
                car++;
            }

        }
        return car;
    }


    //Arrays sort descending order
    public static int[] sortDesc(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    //Sum of array
    public static int sumArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }


}

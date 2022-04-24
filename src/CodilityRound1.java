public class CodilityRound1 {


    public static void main(String[] args) {
        String test1 = "The quick brown fox jumped over the fence";
        String test2 = "The quick brown fox jumped over the fence";
        String test3 = "The quick brown fox jumped over the fence";
        String test4 = "The              ";


        Integer[] p1 = {1, 4, 1};
        Integer[] s1 = {1, 5, 1};

        Integer[] p2 = {4, 4, 2, 4};
        Integer[] s2 = {5, 5, 2, 5};

        Integer[] p3 = {2, 3, 4, 2};
        Integer[] s3 = {2, 5, 7, 2};

        //  System.out.println(getCarsUses(s2, p2) + ">");

    }

    public static String cropMessage(String message, int crop) {
        if (message == null || message.length() == 0) {
            return null;
        }
        if (crop > message.length()) {
            return message;
        } else if (crop == message.length() - 1) {
            return message;
        }

        int i = crop;
        for (; i < message.length(); i++) {

            if (Character.isWhitespace(message.charAt(crop))) {
                int tempJ = crop;
                while (tempJ > 0) {
                    if (Character.isWhitespace(message.charAt(tempJ))) {
                        tempJ--;
                    } else {
                        return message.substring(0, tempJ + 1);
                    }
                }
            } else {
                if (Character.isWhitespace(message.charAt(crop))) {
                    return message.substring(0, crop + 1);
                } else if (!Character.isWhitespace(message.charAt(crop - 1))) {
                    int tempK = crop - 1;
                    while (tempK > 0) {
                        if (!Character.isWhitespace(tempK)) {
                            tempK--;
                        } else {
                            return message.substring(0, tempK - 1);
                        }
                    }

                }

            }
        }
        return message;
    }

/*
    public static int getCarsUses(Integer[] cars, Integer[] people) {
        int car = 0;

        //Arrays sort in descending order
        Arrays.sort(cars, Collections.reverseOrder());
        Arrays.sort(people, Collections.reverseOrder());


        for (int i = 0, j = 0; i < people.length; i++) {

            int tempVal = people[i] - cars[j] + tempVal;
            if (tempVal <= 0) {
                car++;
                j++;
            } else if (tempVal > 0) {
                cars[j] = tempVal;
            }
            tempVal ? tempVal * -1 == (-tempVal) : tempVal
        }

        return car;
    }
*/
}

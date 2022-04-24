import java.util.ArrayList;
import java.util.List;

public class CX {

    public static void main(String[] args) {
        int x, y, z;
        x = 9;
        y = 10;
        z = ++x + y++;

        String s1 = "yes";
        String s2 = "yes";
        String s3 = new String(s1);
        String s4;
        System.out.println(s1 == s2);
        System.out.println(s3 == s1);

        //round to up
        //list of integers
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        //remove all numbers
        list.clear();

    }

}


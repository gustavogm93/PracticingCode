public class UnderstandingReference {
    public static void main(String[] args) {
        String f = new String("f");
        changeReference(f); // It won't change the reference!
    }

    public static void changeReference(String a) {
        String b = new String("b");
        a = b;
    }


}
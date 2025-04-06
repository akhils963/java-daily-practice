public class CompareStrings {

    public static void main(String[] args) {
        String a = "Ak";
        String b = "Ak";
        String c = new String("Ak");

        System.out.println(a==b);

        System.out.println(a==c);

        System.out.println(a.equals(c));
    }
}

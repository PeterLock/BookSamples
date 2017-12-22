public class ShadowingExample {

    static int x;

    public static void main(String[] args) {
        x = 5;
        System.out.println("x contains: " + x);

        int x;
        x = 15;
        System.out.println("x contains " + x);
        System.out.println("ShadowedExample.x contains: " +
        ShadowingExample.x);
    }
}

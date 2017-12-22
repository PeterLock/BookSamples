public class Hypotenuse {

    public static void main(String[] args) {
        double x = 3.0, y = 4.0;

        //z is dynamically initialized
        double z = Math.sqrt(x * x + y * y);

        System.out.println("Hypotenuse is " + z);
    }
}

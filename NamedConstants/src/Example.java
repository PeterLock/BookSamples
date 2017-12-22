public class Example {
    public static void main(String[] args) {
        double radius = 2.25;
        final double PI = 3.141_52;
        System.out.println("Radius: " + radius);
        System.out.println("PI = " + PI);
        //PI = 3.2; //Error! Cannot reassign a constant

        double area = radius * radius * PI;
        System.out.println("The area of a circle " +
                "with a radius of " + radius + " is "
                + area);
    }
}

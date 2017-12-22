public class Example {

    /*
    Floating-point precision
    ------------------------
    Variables of type double are more precise than variables of type float.

    --> float is represented in 32bits, with 1 sign bit, 8 bits of exponent, and
        23 bits of the significand.

    --> double is represented in 64bits, with 1 sign bit, 11 bits of exponent, and
        52 bits of significand.
     */

    public static void main(String[] args) {
        float x;
        double y;

        //x = 22.25;    //Error! By default 22.25 is a double literal

        x = 22.25F;//Add the F to the end to tell the compiler
        y = 10.01;
        System.out.println("x contains: " + x);
        System.out.println("y contains: " + y);

        y = 22.25D;
    }
}

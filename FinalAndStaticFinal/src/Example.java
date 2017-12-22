public class Example {

    static final double pi = 3.14159D;

    public Example() {
        final int x = 5;
        //x = 10;//Error! Cannot reassign a final variable
        System.out.println(x);
        System.out.println(pi);
    }

    public static void main(String[] args) {
        new Example(); //Declare a new instance of class Example
    }
}

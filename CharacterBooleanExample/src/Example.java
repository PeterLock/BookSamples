public class Example {

    public static void main(String[] args) {
        char x = 'a', y = 'b', z = 'c';
        boolean a = true, b = false;

        System.out.println("x contains: " + x);
        System.out.println("y contains: " + y);
        System.out.println("z contains: " + z);

        boolean c = (x > y); //Compare the characters 'a' and 'b'

        if(a) System.out.println("This is executed");

        a = false;
        //Using a boolean to control the if statement
        if(b) System.out.println("This is not executed");

        //The outcome of the relational operator is a boolean value
        System.out.println("2 < 10 is " + (10 > 2));
    }
}

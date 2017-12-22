public class Example {

    public static void main(String[] args) {
        byte x = 0;
        short y = 0;
        int z = 0;
        long a = 0L;

        x = 127; //Literal number within byte range
        //x = 128; //Error! 128 is outside of the bytes range

        y = 10000;
        z = 1_000_000;  //Adding the underscore makes the numbers
                        // easier to read

        a = z + 10_000_000_000_000L;    //Add the L to indicate it
                                        //is of type long
    }
}

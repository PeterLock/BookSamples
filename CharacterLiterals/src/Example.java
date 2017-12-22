public class Example {

    public static void main(String[] args) {

        char x = '\u0061'; //'u0061' is uni code for capital a
        char y = '\u0062'; //'u0061' is uni code for capital a
        char z = '\u0063'; //'u0061' is uni code for capital a
        char special_char = '@';
        char quarter = '\u00BC';  //'u00BC' is uni code for
                                            // the 1/4 symbol
        char hash = '#'; //Prints #
        System.out.println(x + "" + y + "" + z); //Prints abc
        System.out.println(special_char);
        System.out.println(quarter);
        System.out.println(hash);
    }
}

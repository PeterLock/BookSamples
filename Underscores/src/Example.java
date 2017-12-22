public class Example {
    public static void main(String[] args) {
        double x = 99_99D;
        float y = 2_000_000.25F;
        //long z = 5_000_000_000_L; //Error! Illegal underscore position

        long creditCardNumber1 = 12345678910L; //Difficult to read
        long creditCardNumber2 = 123_456_789_10L; //Easier to read
        float pi = 3.14_15F; //Easier to read
        int quantity2 = 213_469_89; //Easier to read
        int multipleUnderscores = 1_______2___3; //Legal
        System.out.println(multipleUnderscores);
    }
}

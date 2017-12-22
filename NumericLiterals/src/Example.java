public class Example {

    public static void main(String[] args) {

        int decimal = 26; //The number 26, in decimal

        int hexadecimal = 0x1a; //The number 26, in hexadecimal
        //// 0x1a = 16^1 * 1 + 16^0 * 10 = 16 + 10 = 26

        int octal = 032; // The number 26, in octal
        // 032 = 8^1 * 3 + 8^0 * 2 = 24 + 2 = 26

        byte binary = 0b11010; //The number 26, in binary
        // 0b11010 = 2^4 * 1 + 2^3 * 1 + 2^2 * 0 + 2^1 * 1 + 2^0 * 0
        // = 16 + 8 + 0 + 2 + 0 = 26

        long longL = 10_000_000_000L; // The number 10000000000, in decimal
    }
}

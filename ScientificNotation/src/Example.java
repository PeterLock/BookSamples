import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Example {

    public static void main(String[] args) {
        NumberFormat formatter = new DecimalFormat();

        int maxinteger = Integer.MAX_VALUE;
        System.out.println(maxinteger);
        formatter = new DecimalFormat("0.######E0");
        System.out.println(formatter.format(maxinteger));

        formatter = new DecimalFormat("0.#####E0");
        System.out.println(formatter.format(maxinteger));

        int mininteger = Integer.MIN_VALUE;
        System.out.println(mininteger);

        formatter = new DecimalFormat("0.######E0");
        System.out.println(formatter.format(mininteger));

        formatter = new DecimalFormat("0.#####E0");
        System.out.println(formatter.format(mininteger));

        double d = 0.12345;
        formatter = new DecimalFormat("0.#####E0");
        System.out.println(formatter.format(d));

        formatter = new DecimalFormat("000000E0");
        System.out.println(formatter.format(d));
    }
}

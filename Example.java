import java.util.ArrayList;
import java.util.Arrays;

public class Example {

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>(
                Arrays.asList(1,3,6,7,10));
        a.add(1, 2);
        System.out.println(a);
    }
}
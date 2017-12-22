public class Example {

    public static void main(String[] args) {
        double x = 22.25;

        //float y = 32.5;   //Error! floats need to be appended with
                            // the letter F or f

        float z = 32.5F; //Compiles OK

        double a = 1_567_223_82.25; //Using the underscore to improve
                                    // readability

        float b = 1_222_333_543_889F;
    }
}

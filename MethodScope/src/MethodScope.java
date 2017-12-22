public class MethodScope {

    public static void main(String[] args) {//Start main block

        int x = 5;

        if(x == 5){//Start if block
            int y = 2, z = 4;
            //y and z are only visible inside the if block

            method1(y, z);
        }//End if block

        //System.out.println("y contains: " + y); //Error! y not visible
        //System.out.println("z contains: " + z); //Error! z not visible
        //x = x + y; //Error! y is not visible outside of the if block
        //x = x + p; //Error! p is not visible outside of method1 block

    }//End main block

    private static void method1(int y, int z) {//Start method block

        //The parameters y and z are only visible inside of method1

        int i = y; //i is visible only inside this method
        int p = z; //p is visible only inside this method

        System.out.println("i contains: " + i);
        System.out.println("p contains: " + p);
    }//End method block
}

public class Nested {

    public static void main(String[] args) {
        int x = 5; //Variable known to all code within main

        {
            System.out.println("x contains: " + x);
            int y = 10; //Known only to this block
            System.out.println("y contains: " + y);

            if(x == 5){
                int z = 30;
                //int x = 2; Error! x is already declared in the outer scope
                x = 25; //Assigns 25 to the outer scope variable x
                System.out.println("x contains: " + x);

                {
                    int a = 35;
                    System.out.println("a contains: " + a);
                }
                //System.out.println("a contains: " + a);
                //Error! a is not visible in this scope
            }
            //System.out.println("z contains: " + z);
            //Error! z is not visible in this scope
        }
        //y == 10; //Error! y is not visible in this scope
    }
}

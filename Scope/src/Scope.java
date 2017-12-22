public class Scope {

    public static void main(String[] args) {

        int x = 5; //Visible to all code within main

        System.out.println("x = " + x);
        { //start new scope
            int z = 10; //Visible only to this block
        } //end this scope

        { //start new scope
            int y = 15;
            System.out.println("y = " + y);
            //System.out.println("z = " + z); //Error! z  not visible here
        } //end this scope

        System.out.println("x = " + x);
        //System.out.println("y = " + y); //Error! y not known here
        //System.out.println("z = " + z); //Error! z not known here
    }
}

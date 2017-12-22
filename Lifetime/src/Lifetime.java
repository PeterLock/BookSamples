public class Lifetime {

    public static void main(String[] args) {

        for(int x = 0; x < 5; x++){ // Enter new scope
            int z = -1; // z is initialized every time the block is entered
            System.out.println("z = " + z); //this always prints -1;
            z = 50;
            System.out.println("z = " + z); //this always prints 50
        } // Exit scope
    }
}

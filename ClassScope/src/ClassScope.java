public class ClassScope {

    //Declares and initializes (2) instance fields x
    //and y with the values 10 and 0 respectively
    private int x = -1;
    private int y = 2;

    public static void main(String[] args) {
        ClassScope obj = new ClassScope();

        obj.method1();
    }

    public void method1(){
        int x=100;
        int y = 200;

        //Access this methods local variables
        System.out.println("local variable x contains: " + x);
        System.out.println("local variable y contains: " + y);

        //Access the class instance fields
        System.out.println("instance field x contains: " + this.x);
        System.out.println("instance field y contains: " + this.y);
    }
}

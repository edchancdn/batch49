public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello World");

        greet("John Doe");
    }

    public static void greet(String name) {
        System.out.println("Hello " + name);
    }


    // Created this method in feature101 branch - for Git demo
    public static void grantAccess(String id) {
        System.out.println("Employee ID " + id + " granted read-write access to delta directory.");
    }



}

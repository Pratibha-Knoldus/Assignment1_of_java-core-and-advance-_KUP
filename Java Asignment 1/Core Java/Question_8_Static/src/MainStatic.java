public class MainStatic {
    static String firstName = "Pratibha";
    static String lastName = "Yadav";
    static int age = 22;
    private static void print(){
        System.out.println("In static method");
        System.out.println("Pratibha Yadav 22");
    }
    public static void main(String[] args) {
        System.out.println();
        System.out.println("In main method");
        System.out.println(firstName + " " + lastName + " " + age);
        System.out.println();
        print();
    }
    static {
        System.out.println("In static block");
        System.out.println("Pratibha Yadav 22");
    }
}
package DefaultStatic;

interface TestInterface1
{
    // static method
    public static void display() {
        System.out.println("Static method of the interface");
    }

    // default method
    default void show()
    {
        System.out.println("Calling Default TestInterface1");
    }
}

interface TestInterface2
{
    // Default method
    default void show()
    {
        System.out.println("Calling Default TestInterface2");
    }
}

// Implementation of multiple inheritance with interface
class Main implements TestInterface1, TestInterface2
{
    // Overriding default show method
    public void show()
    {
        // use super keyword to call the show
        // method of TestInterface1 interface
        TestInterface1.super.show();

        // use super keyword to call the show
        // method of TestInterface2 interface
        TestInterface2.super.show();
    }
    // Overriding static method of the interface in class
    public static void display() {
        System.out.println("Override: Static method of the interface to class");
    }
    public static void main(String args[])
    {
        Main d = new Main();
        TestInterface1.display(); // calling static display method of interface
        Main.display(); // calling override static display method
        d.show(); // calling default method of inherited interface

    }
}


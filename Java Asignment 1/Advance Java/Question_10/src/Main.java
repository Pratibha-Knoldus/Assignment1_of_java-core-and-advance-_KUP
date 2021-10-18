class A
{
    String s = "AAA";
    void methodA()
    {
        System.out.println(s);
    }
    static class B
    {
        void methodB()
        {
            methodA();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        A a = new A();
    }
}

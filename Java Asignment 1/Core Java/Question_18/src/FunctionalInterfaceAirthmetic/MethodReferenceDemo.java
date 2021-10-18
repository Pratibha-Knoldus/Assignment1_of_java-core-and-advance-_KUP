package FunctionalInterfaceAirthmetic;

public class MethodReferenceDemo {
    public int multiply(int num1,int num2) {

        return num1*num2;

    }

    public static void main(String[] args) {
        MethodReferenceDemo obj = new MethodReferenceDemo();

        Calculator cal1 = (num1,num2) -> num1+num2;
        int additionResult = cal1.calculate(4, 6);
        System.out.println("Result of addition:"+additionResult);

        Calculator cal2 = (num1,num2) -> num1-num2;
        int subtractresult = cal2.calculate(6,4);
        System.out.println("Result of subtraction:"+subtractresult);

        Calculator cal3 = obj::multiply;
        int multiplicationResult = cal3.calculate(4, 6);
        System.out.println("Result of multiplication:"+multiplicationResult);
    }
}

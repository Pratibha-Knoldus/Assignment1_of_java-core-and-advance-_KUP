package EmployeePackage;

public class EmployeeTest {
    public static void main(String[] args) {
        EmployeeWithDetails empWithDetails = Employee::new;

        System.out.println("Constructor isn't called yet");
        System.out.println(empWithDetails.get("Pratibha", 24, "Noida"));

    }
}

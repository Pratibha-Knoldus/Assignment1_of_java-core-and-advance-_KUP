package EmployeePackage;


interface EmployeeWithDetails {
    Employee get(String name, Integer age, String city);
}

public class Employee {
    private String name;
    private String city;
    private int age;


    Employee(String name, int age, String city) {
        System.out.println("Employee Constructor");
        this.name = name;
        this.age = age;
        this.city = city;
    }


    public String toString() {
        return "Employee name: " + name + " Employee age: " + age + " Employee city: " + city;
    }
}

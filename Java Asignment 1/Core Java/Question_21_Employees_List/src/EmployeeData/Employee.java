package EmployeeData;

public class Employee {
    private int empid;
    private String empName,empDesignation;
    public Employee(int empid, String ename, String edes) {
        super();
        this.empid = empid;
        this.empName = ename;
        this.empDesignation = edes;
    }
    public int getEmpid() {
        return empid;
    }
    public void setEmpid(int empid) {
        this.empid = empid;
    }
    public String getEname() {
        return empName;
    }
    public void setEname(String ename) {
        this.empName = ename;
    }
    public String getDesignation() {
        return empDesignation;
    }
    public void setDesignation(String edes) {
        this.empDesignation = edes;
    }
}
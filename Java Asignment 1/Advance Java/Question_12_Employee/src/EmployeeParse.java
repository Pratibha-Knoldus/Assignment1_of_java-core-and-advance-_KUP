import java.io.*;
import java.util.*;

public class EmployeeParse {

    private Integer empID ;
    private String empName ;
    private Integer empAge ;


    public Integer getEmpID() {
        return empID;
    }

    public void setEmpID(Integer empID) {
        this.empID = empID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Integer getEmpAge() {
        return empAge;
    }

    public void setEmpAge(Integer empAge) {
        this.empAge = empAge;
    }


    public EmployeeParse() {
    }

    public static void main(String[] args) {
        try {
            ArrayList<EmployeeParse> empList = new ArrayList<EmployeeParse>() ;
            File file = new File ( "src/Employee.txt") ;

            if ( file.exists() )
            {
                Scanner inFile = new Scanner( file );
                inFile.useDelimiter("[;]");
                while ( inFile.hasNext() )
                {
                    String line = inFile.next() ;
                    line = line.trim().replaceAll("\n", "");
                    line = line.trim().replaceAll("\t", "");
                    line = line.trim().replaceAll(" ", "");
                    if ( line.length() > 0 ) {
                        String delims = "[,]+";
                        String[] tokens = line.split(delims);
                        EmployeeParse emp = new EmployeeParse() ;
                        emp.setEmpID(Integer.parseInt(tokens[0]));
                        emp.setEmpName(tokens[1]);
                        emp.setEmpAge(Integer.parseInt(tokens[2]));

                        empList.add(emp) ;
                    }
                }

                inFile.close();

            }
            else {
                System.out.println( "File Not Found");
            }
            Integer rec = 0 ;
            for (EmployeeParse employee : empList) {
                System.out.println("Employee-" + ++rec + ":");
                System.out.println("ID = " + employee.getEmpID());
                System.out.println("Name = " + employee.getEmpName());
                System.out.println("Age = " + employee.getEmpAge());
            }


        }
        catch ( FileNotFoundException e) {
            System.out.println( "File Not Found Exception");
        }

    }

}
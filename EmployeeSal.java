package LambdaExpression;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class EmployeeSal {
	private String empName;
    private double salary;
    public EmployeeSal(String ename,double salary) {
        this.empName=ename;
        this.salary=salary;
    }
public String getempName() {
        return empName;
    }
 public double getSalary() {
        return salary;
    } @Override
    public String toString() {
       // return {Employee[name='"+empName+"',salary="+salary+"]};        return "Employee{name='" + ename + "', salary=" + salary + "}";
        return "Employee{name="+empName+",salary=" + salary+"}";
 }
    public static void main(String[] args) {
        List<EmployeeSal> employee=Arrays.asList(
            new EmployeeSal("Janaki",12000),
            new EmployeeSal("Kia",9000),
            new EmployeeSal("Vaishnavi",15000),
            new EmployeeSal("Manna",8000),
            new EmployeeSal("Alina",20000) );
List<EmployeeSal>filterEmp=employee.stream()
                       .filter(e->e.getSalary()>10000)
                           .collect(Collectors.toList());

        System.out.println("Employees who's salary greatre 10000 :");
        filterEmp.forEach(System.out::println);
    }
} 



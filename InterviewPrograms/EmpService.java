
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/*
 * EmpService class contain some program asked in interview with java 8 and using DTOs Like
 * modification based on some conditions sorting on some conditions
 */
public class EmpService {
    public static void main(String[] args) {
        ArrayList<EmployeeCognizant> employees = new ArrayList<>();
        employees.add(new EmployeeCognizant("Rabiroshan", 23, 355000));
        employees.add(new EmployeeCognizant("Pankja", 24, 223000));
        employees.add(new EmployeeCognizant("Kathiga", 25, 33000));
        employees.add(new EmployeeCognizant("Jaysree", 27, 234000));
        employees.add(new EmployeeCognizant("Swathe", 28, 2333000));
        employees.add(new EmployeeCognizant("Bhagyshree", 21, 2000));

        // This will increase the salary of an employee based on the age
        List<EmployeeCognizant> empListWhereSalaryIncreased = employees.stream().map(emp -> {
            if (emp.getAge() > 25) {
                emp.setSalary(emp.getSalary() * 2);
            }
            return emp;
        }).collect(Collectors.toList());

        System.out.println(empListWhereSalaryIncreased);

        // This will sort the list based on some condition , We also can add multiple
        // comparison
        //
        // This will compar the name alphabetically also a
        //
        // List<Employee> sortedEmpListBasedOnAge = employees.stream()
        // .sorted(Comparator.comparingInt(Employee::getAge).thenComparing(Employee::getName))
        // .collect(Collectors.toList());
        List<EmployeeCognizant> sortedEmpListBasedOnAge = employees.stream()
                .sorted(Comparator.comparingInt(EmployeeCognizant::getAge)).collect(Collectors.toList());
        System.out.println(sortedEmpListBasedOnAge);
    }

}

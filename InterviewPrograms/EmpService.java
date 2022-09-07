package InterviewPrograms;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/*
 * EmpService class contain some program asked in interview with java 8
 * and using DTOs
 * Like modification based on some conditons
 * sorting on some conditions
 */
public class EmpService {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Rabiroshan", 23, 355000));
        employees.add(new Employee("Pankja", 24, 223000));
        employees.add(new Employee("Kathiga", 25, 33000));
        employees.add(new Employee("Jaysree", 27, 234000));
        employees.add(new Employee("Swathe", 28, 2333000));
        employees.add(new Employee("Bhagyshree", 21, 2000));

        // This will increase the salary of an employee based on the age
        List<Employee> empListWhereSalaryIncreased = employees.stream().map(emp -> {
            if (emp.getAge() > 25) {
                emp.setSalary(emp.getSalary() * 2);
            }
            return emp;
        }).collect(Collectors.toList());

        System.out.println(empListWhereSalaryIncreased);

        // This will sort the list based on some codtion , We also can add multiple
        // compairsion
        //
        // This will compair the neame alphabaticaly also a
        //
        // List<Employee> sortedEmpListBasedOnAge = employees.stream()
        // .sorted(Comparator.comparingInt(Employee::getAge).thenComparing(Employee::getName))
        // .collect(Collectors.toList());
        List<Employee> sortedEmpListBasedOnAge = employees.stream()
                .sorted(Comparator.comparingInt(Employee::getAge))
                .collect(Collectors.toList());
        System.out.println(sortedEmpListBasedOnAge);
    }

}

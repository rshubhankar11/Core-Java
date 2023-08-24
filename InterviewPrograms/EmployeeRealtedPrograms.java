import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * javaEx
 */
public class EmployeeRealtedPrograms {

    public static void main(String[] args) {

        ArrayList<Employee> empList = new ArrayList<>();
        ArrayList<String> techStack = new ArrayList<>();

        techStack.add("Java");
        techStack.add("AWS");
        techStack.add("SpringBoot");

        empList.add(new Employee("A", 1, techStack));
        ArrayList<String> techStack1 = new ArrayList<>();
        techStack1.add("python");
        techStack1.add("DJango");
        empList.add(new Employee("B", 2, techStack1));

        ArrayList<String> techStack2 = new ArrayList<>();
        techStack2.add("Java");
        techStack2.add("Microservices");
        empList.add(new Employee("c", 3, techStack2));

        ArrayList<String> techStack3 = new ArrayList<>();
        techStack3.add("Java");
        techStack3.add("SpringBoot");
        empList.add(new Employee("d", 4, techStack3));

        List<Employee> javaSpringBootEmp = empList.stream()
                .filter(e -> e.getTechStack().contains("Java") && e.getTechStack().contains("SpringBoot"))
                .collect(Collectors.toList());

        System.out.println("----------");
        System.out.println(javaSpringBootEmp.toString());

        List<Employee> javaMicroBootEmp = empList.stream()
                .filter(e -> e.getTechStack().contains("Java") && e.getTechStack().contains("Microservices"))
                .collect(Collectors.toList());

        System.out.println("----------");
        System.out.println(javaMicroBootEmp.toString());

        // ArrayList<String> techStack3 = new ArrayList<>();
        techStack.clear();
        techStack.add("gaga");
        techStack.add("tata");
        empList.add(new Employee("d", 4, techStack));

    }

}

/**
 * InnerjavaEx
 */
class Employee {

    private String empName;
    private Integer empId;
    private ArrayList<String> techStack;

    public Employee(String empName, Integer empId, ArrayList<String> techStack) {
        this.empName = empName;
        this.empId = empId;
        this.techStack = techStack;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public ArrayList<String> getTechStack() {
        return techStack;
    }

    public void setTechStack(ArrayList<String> techStack) {
        this.techStack = techStack;
    }

    @Override
    public String toString() {
        return "Employee [empName=" + empName + ", empId=" + empId + ", techStack=" + techStack + "]";
    }

}
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CognizantAskedEmployeeQ {

    public static void main(String[] args) {
        ArrayList<EmployeeCognizant> empList = new ArrayList<>();

        ArrayList<String> techStack = new ArrayList<>();
        techStack.add("Java");
        techStack.add("Spring Boot");
        techStack.add("React Js");
        empList.add(new EmployeeCognizant("Rabiroshan", 4, techStack));
        ArrayList<String> techStack1 = new ArrayList<>();

        techStack1.add("Java Script");
        techStack1.add("MySql");
        empList.add(new EmployeeCognizant("Shubhankar", 2, techStack1));
        ArrayList<String> techStack2 = new ArrayList<>();

        techStack2.add("Java");
        techStack2.add("Java 8");
        techStack2.add("Spring");
        techStack.add("MySql");
        empList.add(new EmployeeCognizant("Akash", 1, techStack2));
        empList.stream().forEach(System.out::print);
        System.out.println();
        System.out.println("----------------");
        List<EmployeeCognizant> sortedEmp = empList.stream()
                .sorted(Comparator.comparingInt(EmployeeCognizant::getEmpId))
                .collect(Collectors.toList());
        sortedEmp.stream().forEach(System.out::print);
        List<String> filteringoutJava = empList.stream().flatMap(emp -> emp.getTechStack().stream())
                .filter(a -> a.equals("Java")).collect(Collectors.toList());
        System.out.println();
        System.out.println("***********");
        System.out.println(filteringoutJava.toString());

        List<EmployeeCognizant> empWitJava = empList.stream().filter(emp -> emp.getTechStack().contains("Java"))
                .collect(Collectors.toList());
        System.out.println();
        System.out.println("================");
        System.out.println(empWitJava.toString());
    }
}

class EmployeeCognizant {

    private String empName;
    private Integer empId;
    private ArrayList<String> techStack;

    public EmployeeCognizant(String empName, Integer empId, ArrayList<String> techStack) {
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

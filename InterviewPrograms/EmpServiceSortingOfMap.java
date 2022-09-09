import java.util.*;
import InterviewPrograms.Employee;
import java.util.stream.Collectors;

/**
 * EmpServiceSortingOfMap
 * 
 * We will sort a map using java 8 stream API on basis of key of map and value
 * of map .
 * Also in value we will comapir particualr fields
 */
public class EmpServiceSortingOfMap {
    /**
     * @param args
     */
    public static void main(String[] args) {
        HashMap<Integer, Employee> empMap = new HashMap<>();
        empMap.put(3, new Employee("Rabiroshan", 23, 9875000));
        empMap.put(2, new Employee("Pankaj", 23, 898000));
        empMap.put(1, new Employee("Jayasree", 23, 955000));
        empMap.put(20, new Employee("Kathiga", 23, 9000));
        empMap.put(4, new Employee("Keshav", 23, 550000));
        empMap.put(5, new Employee("Bhagya", 23, 8000));
        empMap.put(0, new Employee("Bhagya", 23, 388000));

        System.out.println("**********Un sorted map***********");
        empMap.entrySet()
                .stream().forEach(System.out::println);

        System.out.println("**********Sorted map***********");
        // // This will compair the key and sort it
        empMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(System.out::println);

        // This will compair the vlues to sort
        // In this we are first compairing the name on alphabtic then we are comparing
        // salary,less amount of salary will be on top
        empMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(
                        Comparator.comparing(Employee::getName).thenComparingInt(Employee::getSalary)))
                .forEach(System.out::println);

        // We also can collect our map by this
        LinkedHashMap<Integer, Employee> sortedMap = empMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.comparing(Employee::getName)))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));

    }

}
package Java.CustomSort;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeMain {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "yousuf", "SDE-1", "Hyderabad" ));
        employees.add(new Employee(3, "Abhi", "SDE-1", "Bangalore"));
        employees.add(new Employee(2, "Alex", "SDE-2", "Hyderabad"));

        System.out.println(employees);
        System.out.println("Sorting based on comparable interface");
        Collections.sort(employees);
        System.out.println(employees);

        System.out.println("Sorting based on comparator interface");
        Collections.sort(employees, new SortByNameComparator());
        System.out.println(employees);
    }
}

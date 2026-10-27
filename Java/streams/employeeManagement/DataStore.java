package employeeManagement;

import java.util.Arrays;
import java.util.List;

public class DataStore {

record Employee(
    int id,
    String name,
    String department,
    double salary,
    int age
) {}

public static List<Employee> employees = Arrays.asList(
    new Employee(1, "Alice", "IT", 90000, 30),
    new Employee(2, "Bob", "HR", 60000, 35),
    new Employee(3, "Charlie", "IT", 120000, 40),
    new Employee(4, "David", "HR", 75000, 28),
    new Employee(5, "Eva", "Finance", 110000, 32),
    new Employee(6, "Frank", "IT", 120000, 45)
);

    
}

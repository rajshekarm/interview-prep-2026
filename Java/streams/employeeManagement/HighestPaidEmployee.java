package employeeManagement;
import java.util.Comparator;
import java.util.List;
import employeeManagement.DataStore.Employee;

public class HighestPaidEmployee {
    public static void main(String[] args) {
        List<Employee> employee = DataStore.employees;

        employee.stream()
    .max(Comparator.comparingDouble(DataStore.Employee::salary))
    .ifPresent(System.out::println);

        //  max() returns the Employee, not the salary
    }
}

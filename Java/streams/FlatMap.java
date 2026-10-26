import java.util.*;


public class FlatMap {
record Department(String name) {}

record Employee(String name, int age){}

    public static void main(String[] args) {
        Map<Department, List<Employee>> departmentStore = new HashMap<>();
        departmentStore.put(new Department("Finance"), List.of(new Employee("Ramesh", 25), new Employee("Somesh", 25)));
        departmentStore.put(new Department("HR"), List.of(new Employee("Steve", 25), new Employee("Clara", 25)));
        departmentStore.put(new Department("Engineering"), List.of(new Employee("Raj", 25), new Employee("Shiv", 25)));

        // You have a Map<Department, List<Employee>> and want to get a single List<String> containing the names of all employees across all departments. 

        List<String> employeeNames = departmentStore.values()
        .stream()
        .flatMap(List::stream)
        .map(Employee::name)
        .toList();

        // for(String name:employeeNames) System.out.println(name);

        // Get the employee names only from the Finance department?
         List<String> financeEmployees = departmentStore.getOrDefault(new Department("Finance"), List.of())
         .stream()
         .map((employee) -> employee.name)
         .toList();
        
          for(String name:financeEmployees) System.out.println(name);

    }
}

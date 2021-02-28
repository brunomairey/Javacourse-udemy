import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Employee john = new Employee("John Doe", 30);
        Employee tim = new Employee("Tim Bobby", 56);
        Employee bruno = new Employee("Bruno M", 41);
        Employee abdel = new Employee("Abdel Kader", 23);
        Employee red = new Employee("Red Ridinghoolk", 35);
        Employee charming = new Employee("Prine Charming", 54);

        Department hr = new Department("Human Ressources");
        hr.addEmployee(john);
        hr.addEmployee(bruno);
        hr.addEmployee(tim);

        Department accounting = new Department(("Accounting"));
        accounting.addEmployee(abdel);
        accounting.addEmployee(red);
        accounting.addEmployee(charming);
        List<Department> departments = new ArrayList<>();
        departments.add(hr);
        departments.add(accounting);

        departments.stream()
                .flatMap(department -> department.getEmployees().stream());
           //     .forEach(System.out::println);

        Map<Integer, List<Employee>> groupByAge = departments.stream()
                .flatMap(department -> department.getEmployees().stream())
                .collect(Collectors.groupingBy(employee ->  employee.getAge()));

        departments.stream()
                .flatMap(department -> department.getEmployees().stream())
                .reduce((e1,e2) -> e1.getAge()< e2.getAge() ? e1 : e2)
                .ifPresent(System.out::println);
    }




    }


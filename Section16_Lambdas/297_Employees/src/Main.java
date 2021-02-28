import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        Employee john = new Employee("John Doe", 30);
        Employee tim = new Employee("tim bob", 56);
        Employee bruno = new Employee("Bruno M", 41);
        Employee abdel = new Employee("Abdel Kader", 23);
        Employee red = new Employee("Red Ridinghoolk", 35);
        Employee charming = new Employee("Prine Charming", 54);

        List<Employee> employees = new ArrayList<>();
        employees.add(john);
        employees.add(tim);
        employees.add(bruno);
        employees.add(abdel);
        employees.add(red);
        employees.add(charming);
       // printEmployeesByAge(employees, "Employees over 30", employee -> employee.getAge() > 30);
       // printEmployeesByAge(employees, "Employees 30 and under", employee -> employee.getAge() <= 30);

        Function<Employee, String> getFirstName = (Employee employee) -> {
            return employee.getName().substring(0, employee.getName().indexOf(' '));
        };
        Function<Employee, String> getLastName = (Employee employee) -> {
            return employee.getName().substring(employee.getName().indexOf(' ') + 1);
        };

//        Random random1 = new Random();
//        for (Employee employee : employees) {
//            if(random1.nextBoolean()){
//                System.out.println(getAName(getFirstName, employee));
//            }
//            else {
//                System.out.println(getAName(getLastName, employee));
//            }
//        }

        Function<Employee, String> upperCase = employee -> employee.getName().toUpperCase();
        Function <String, String> firstName = name -> name.substring(0, name.indexOf(' '));
        Function firstNameUppercase =upperCase.andThen(firstName);
        System.out.println(firstNameUppercase.apply(employees.get(0)));

        BiFunction<String, Employee, String> concatAge = (String name, Employee employee) -> {
            return name.concat(" " + employee.getAge());
        };

        String upperName = upperCase.apply(employees.get(0));
        System.out.println(concatAge.apply(upperName, employees.get(0)));

    }

    private static String getAName(Function<Employee, String> getName, Employee employee){
        return getName.apply(employee);
    }

    private static void printEmployeesByAge(List<Employee> employees, String ageText, Predicate<Employee> ageCondition){
        System.out.println(ageText);
        System.out.println("================");
        for (Employee employee : employees) {
            if(ageCondition.test(employee)){
                System.out.println(employee.getName());
            }
        }
        employees.forEach(employee -> {
            if(employee.getAge() <= 30){
                System.out.println(employee.getName());
            }
        });
    }

}

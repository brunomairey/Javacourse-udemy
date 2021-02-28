import java.util.ArrayList;
import java.util.List;

interface UpperConcat {
    public String upperAndConcat(String s1, String s2);
}

public class Main {

    public static void main(String[] args) {

        Employee john = new Employee("John Doe", 30);
        Employee tim = new Employee("tim", 56);
        Employee bruno = new Employee("Bruno M", 41);
        Employee abdel = new Employee("Abdel Kader", 23);

        List<Employee> employees = new ArrayList<>();
        employees.add(john);
        employees.add(tim);
        employees.add(bruno);
        employees.add(abdel);
        employees.forEach(employee -> {
            System.out.println(employee.getName());
            System.out.println(employee.getAge());
        });

//        for (Employee employee : employees) {
//            System.out.println(employee.getName());
//            System.out.println(employee.getAge());
//            new Thread(() -> System.out.println(employee.getAge())).start();
//        }
//        System.out.println("================");
//        for(int i=0; i<employees.size(); i++){
//            Employee employee = employees.get(i);
//            System.out.println(employee.getName());
//            new Thread(() -> System.out.println(employee.getAge())).start();
//        }


    }

    public final static String doStringstuff(UpperConcat uc, String s1, String s2) {
        return uc.upperAndConcat(s1, s2);

    }
}

class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}

//interface UpperConcat {
//    public String upperAndContact(String s1, String s2);
//}
class AnotherClass {
    public String doSomething() {

        int i = 0;
        UpperConcat uc = (s1, s2) -> {
            System.out.println("The lambda experssions class is " + getClass().getSimpleName());
            System.out.println(" i in the lambda expression = " + i);
            String result = s1.toUpperCase() + s2.toUpperCase();
            return result;

        };

        System.out.println("The another expression's class is " + getClass().getSimpleName());


        System.out.println("i = " + i);
        return Main.doStringstuff(uc, "String1", "String2");

    }

    public void printValue() {
        int number = 25;

        Runnable r = () -> {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("The value is " + number);
        };

        new Thread(r).start();
    }
}


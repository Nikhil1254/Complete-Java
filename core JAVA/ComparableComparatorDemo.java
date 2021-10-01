import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparableComparatorDemo {
    public static void main(String[] args) {
        List<Employee> emps = new ArrayList<>();
        emps.add(new Employee(90, "Nikhil", 27000));
        emps.add(new Employee(5, "raj", 12000));
        emps.add(new Employee(89, "jeet", 48000));
        emps.add(new Employee(22, "jankiram", 25000));

        Collections.sort(emps);
        System.out.println("\nComparable applied , sorting on salary basis -");
        for (Employee emp : emps)
            System.out.println(emp);

        System.out.println("\nComparator overwriding comparable,sorting on id basis-");
        Collections.sort(emps, (emp1, emp2) -> {
            return emp1.id > emp2.id ? 1 : -1;
        });// used lambda function here for comparator
           // sort take comparator object as second argument.
        for (Employee emp : emps)
            System.out.println(emp);

    }
}

class Employee implements Comparable<Employee> {
    int id;
    String name;
    int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int compareTo(Employee obj) {
        return this.salary > obj.salary ? 1 : -1;
    }

    public String toString() {
        return "id:" + this.id + "\tname:" + this.name + "\tsalary:" + this.salary;
    }
}

class EmployeeSortId implements Comparator<Employee> {
    public int compare(Employee emp1, Employee emp2) {
        return emp1.id > emp2.id ? 1 : -1;
    }
}
// yacha object banavun pn pass karu shakto Sort madhe kivva lambda expression
// use karu shakto
// kivva apan anonymous class pn use karu shakto choice is ours.

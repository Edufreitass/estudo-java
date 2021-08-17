package src;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeeMain {

    public static void main(String[] args) {

        List<String> names = EmployeeDatabase.getEmployees()
                .stream()
                .filter(employee -> employee.getSalary() > 40000)
                .map(Employee::getName)
                .distinct()
                .sorted()
                .skip(0)
                .limit(3)
                .collect(Collectors.toList());

        System.out.println(names);

    }

}

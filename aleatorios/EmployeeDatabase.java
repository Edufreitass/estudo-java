package aleatorios;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeDatabase {

    public static List<Employee> getEmployees() {
        return Stream.of(new Employee(101, "Basant", "DEV", 50000),
                new Employee(102, "Santosh", "FS", 70000),
                new Employee(103, "Sam", "QA", 40000),
                new Employee(104, "John", "DEV", 80000),
                new Employee(105, "Ajay", "DEV", 90000),
                new Employee(115, "Basant", "QA", 40000),
                new Employee(101, "Saul", "DEV", 50000),
                new Employee(161, "Ram", "QA", 100000),
                new Employee(236, "Bikash", "UI", 30000),
                new Employee(272, "Bala", "ADMIN", 35000)
        ).collect(Collectors.toList());
    }

}

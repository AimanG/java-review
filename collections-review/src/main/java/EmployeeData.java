import java.util.Arrays;
import java.util.stream.Stream;

public class EmployeeData {
    public static Stream<Employee> readAll(){
        return Stream.of(
                new Employee(100, "Mike", "mike@cydeo.com", Arrays.asList("2092029090","9088982233")),
                new Employee(100, "Ozzy", "mike@cydeo.com", Arrays.asList("3432029090","9878982233")),
                new Employee(100, "Peter", "mike@cydeo.com", Arrays.asList("2322029090","1218982233"))
        );
    }
}

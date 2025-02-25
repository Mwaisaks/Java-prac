
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Monaleo", 500000),
                new Employee("Flo Milli", 900000),
                new Employee("Glorilla", 480000),
                new Employee("Big Latto", 800000),
                new Employee("Mwaisaka", 500000)
        );

        public void highestSalary(){
            Employee highestPaid = employees.stream()
                    .reduce((e1, e2) -> e1.getSalary() > e2.getSalary() ? e1 : e2)
                    .orElse(null); //Handle empty list gracefully

            if (highestPaid != null) {
                System.out.println("Highest paid employee: " + highestPaid);
            }
        }

    }
}
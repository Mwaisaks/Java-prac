import java.util.List;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {

        List<Car> cars = List.of(
                new Car("sedan", "BMW", "530", 1998),
                new Car("sedan", "Audi", "A5", 1998),
                new Car("sedan", "Mercedes", "E-Class", 2500),
                new Car("hatchback", "Skoda", "Octavia", 1600),
                new Car("hatchback", "Toyota", "TypeR", 1450)
        );

        //Filtering operation
        List<Car> sedanCars = cars.stream()
                .filter(car -> car.getType.equals("sedan"))
                .collect(Collectors.toList());

        System.out.println(sedanCars);
    }
}
//import java.net.SocketOption;

public class Main {
    public static class Car{
        String model;
        String brand;
        int year;

        Car(String model, String brand, int year){
            this.model = model;
            this.brand = brand;
            this.year = year;
        }

        static void displayInfo(String model, String brand, int year){
            System.out.println("Car model: " + model);
            System.out.println("Car brand: " + brand);
            System.out.println("year: " + year);
        } 
    }

    public static void main(String[] args){
            Car myCar = new Car("Mustang","Audi", 1959);
            //System.out.println("htdguyt");
            Car.displayInfo(myCar.model, myCar.brand, myCar.year);
        }
}

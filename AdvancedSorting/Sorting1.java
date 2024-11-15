//package AdvancedSorting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

//Define a Car class
class Car{
    public String model;
    public String brand;
    public int year;

    Car(String model, String brand, int year){
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
}

//Create a Comparator
class SortByYear implements Comparator{
    public int compare(Object obj1, Object obj2){
        //Make sure that the objects are Car objects
        Car a = (Car) obj1;
        Car b = (Car) obj2; 
        /*
         *The Comparator interface's compare method expects Object parameters by default. 
         * Since we’re working specifically with Car objects, 
         * we need to cast obj1 and obj2 to Car to access their fields*/

        //Compare the year of both objects
        if(a.year < b.year) return -1;
        if (a.year > b.year) return 1;
        return 0; //Both cars have the same year
    }
}

public class Sorting1 {
    public static void main(String[] args) {
        //Create a list of cars
        ArrayList<Car> myCars = new ArrayList<Car>();
        myCars.add(new Car("BMW", "X5", 1999));
        myCars.add(new Car("Honda","Accord",2006));
        myCars.add(new Car("Ford", "Mustang",1970));

        /*So ;emme get this straight we 're passing Car objects to Arraylist object "myCars" so
         * it picks up x-tics of and ArrayList, why didn't we create this from an ArrayList directly,
         * why is this considered best practice
        */

        //Use a comparator to sort the cars
        Comparator myComparator = new SortByYear();
        Collections.sort(myCars, myComparator);

        //Display the cars
        for (Car c: myCars){
            System.out.println(c.brand + " " + c.model + " " + c.year);
        }
    }
}

/*
 * 
 */
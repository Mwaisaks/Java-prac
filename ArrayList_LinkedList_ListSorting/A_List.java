/*It's dynamic in size meaning it can grow and shrink as needed
It ordered and allows duplicates

//Syntax
import java.util.ArrayList;

//Create an ArrayList object
ArrayList<data_type> obj_name = new ArrayList<data_type>();

//add items - add()
obj_name.add();

//add an item at a specified index
obj_name.add(index, element);

//access an item 
obj_name.get(index)

//change an item
obj_name.set(index, element);

//remove an item
obj_name.remove(index);
cars.clear(); //removes all the elements

//Arraylist Size
obj_name.size();

//To loop through an ArrayList
use a for loop and the size() method to specify the number of times the loop should run


*/


/* 
import java.util.ArrayList;

public class A_List{
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();

        cars.add("Mazda");
        cars.add("Volvo");
        cars.add("Ford");
        cars.add("BMW");

        //System.out.println(cars);

        for (int i = 0; i < cars.size(); i++){
            System.out.println(cars.get(i));
        }

        //or use for-each loop

        for (String i : cars){
            System.out.println(i);
        }
    }
}

*/

 /*
  * Since array list can't store primitive data types it uses their wrapper classes
  like  Integer instead.Java automatically converts between primitive data types and
  their wrappers classes(auto-boxing/unboxing)L
  Elements in an ArrayList are objects. String is already an object,
  to convert primitive data types like int, bool you must specify an equivalent wrapper classes.
  Integer for int
  Boolean for boolean
  Character for char
  Double for double

  Sort an ArrayList
  Use sort() method of Collections Class from java.util package
  */

  import java.util.ArrayList;
  import java.util.Collections;

  public class A_List {
    public static void main(String[] args) {
        ArrayList<Integer> myNum = new ArrayList<>();

        myNum.add(43);
        myNum.add(76);
        myNum.add(34);
        myNum.add(39);
        myNum.add(52);

        Collections.sort(myNum); //sort numbers

        for (int i : myNum){
            System.out.println(i);
        }
    }
  }
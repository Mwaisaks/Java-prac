import java.util.ArrayList;
import java.util.Collections;

class Students implements Comparable<Students>{
    String name;
    int age;

    //constructor
    Students(String name, int age){
        this.name = name;
        this.age =age;
    }

    public String toString(){
        return "Student [age = " + age + ", name = " + name + "]";
    }

    @Override
    public int compareTo(Students that){
        if (this.age > that.age) 
            return 1;
        else
            return -1;
    }

}
public class Sorting6 {
    public static void main(String[] args) {
        ArrayList<Students> students = new ArrayList<Students>();

        students.add(new Students("Leila", 29));
        students.add(new Students("Halle", 25));
        students.add(new Students("Sinmidele", 21));
        students.add(new Students("Leah", 26));

        Collections.sort(students);

        for(Students student : students){
            System.out.println(student);
        }
    }
}

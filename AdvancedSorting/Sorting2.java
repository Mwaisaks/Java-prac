//package AdvancedSorting;

import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;

class Student{
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    //To display student objects easily
    @Override
    public String toString(){
        return "Student{name = '" + name + "', age = " + age + "}";
    }
}

public class Sorting2 {
    public static void main(String[] args){
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student("Beatrice", 21));
        students.add(new Student("Nelly", 24));
        students.add(new Student("Raye", 19));
        students.add(new Student("Coi Leray", 22));

        Comparator<Student> ageComparator = new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2){
                return Integer.compare(s1.getAge(), s2.getAge());
            }
        };

        Collections.sort(students, ageComparator);

        System.out.println("Sorted by age: " + students);
    }
}

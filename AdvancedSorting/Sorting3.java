//package AdvancedSorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class SortEvenFirst implements Comparator{
    public int compare(Object obj1, Object obj2){
        //make sure the objects are integers
        Integer a = (Integer) obj1;
        Integer b = (Integer) obj2;

        //Check each number to see if it's even
        boolean aIsEven = (a % 2) == 0;
        boolean bIsEven = (b % 2) == 0;

        if (aIsEven == bIsEven){
            //If both numbers are even or both are odd then use normal sorting rules
            if (a < b) return -1;
            if (a > b) return 1;
            return 0;
        }
        else {
            //if a is even then it goes first , otherwise b goes first
            if (aIsEven){
                return -1;
            }
            else{
                return 1;
            }
        }
    }
}
public class Sorting3 {
    public static void main(String[] args) {
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(24);
        myNumbers.add(82);
        myNumbers.add(72);
        myNumbers.add(28);
        myNumbers.add(73);
        myNumbers.add(95);
        myNumbers.add(33);

        Comparator myComparator = new SortEvenFirst();
        Collections.sort(myNumbers, myComparator);

        for(int i : myNumbers){
            System.out.println(i);
        }
    }
}

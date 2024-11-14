package AdvancedSorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

Class SortEvenFirst implements Comparator{
    public int compare(Object obj1, Object obj2){
        //make sure the objects are integers
        Integer a = (Integer) obj1;
        Integer b = (Integer) obj2;

        //Check each number to see if it's even
        boolean aIsEven = (a % 2) == 0;
        boolean bIsEven = (b % 2) == 0;

        if (aIsEven == bIsEven){
            //If both numbers are even or both are odd then use normal sorting rules
            if (a < b)
        }
    }
}
public class Sorting3 {
    
}

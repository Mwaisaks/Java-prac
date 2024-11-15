import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;

public class Sorting4 {
    public static void main(String[] args) {
        Comparator<Integer> com = new Comparator<Integer>() {
            public int compare(Integer i, Integer j){
                if (i % 10 > j % 10) 
                    return 1;
                else
                    return -1;
            }
        };
        ArrayList<Integer> nums = new ArrayList<Integer>();
        
        nums.add(23);
        nums.add(78);
        nums.add(67);
        nums.add(93);
        nums.add(45);

        Collections.sort(nums, com);

        System.out.println(nums);
    }
}

public class Demo {
    public static void main(String[] args) {
        //int nums[] = {1, 2, 3, 5, 7, 8, 9, 11, 13};
        int nums[] = new int[10];
        int target = 900;

        //Linear search
        int result = binarySearch(nums, target);

        int result2 = linearSearch(nums, target);

        if (result != -1)
            System.out.println("Element found at index: " + result);
        else
            System.out.println("Element not found!");
    }

    public static int linearSearch(int[] nums, int target) {

        int steps = 0;
        for (int i = 0; i < nums.length; i++){
            steps++;
            if (nums[i] == target){
                System.out.println("Steps taken by linear: " + steps);
                return i;
            }
        }
        System.out.println("Steps taken by linear: " + steps);
        return -1;
    }

    public static int binarySearch(int[] nums, int target) {
        //5, 7, 8, 9, 11, 13

        int steps = 0;

        int left = 0;
        int right = nums.length - 1;

        while (left <= right){
            steps++;
            int mid = (left + right) / 2;

            if (nums[mid] == target){
                System.out.println("Steps taken by binary: " + steps);
                return mid;
            }
            else if (nums[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid -1;
            }
        }
        System.out.println("Steps taken by binary: " + steps);
        return -1;
    }
}

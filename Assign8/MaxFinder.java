import java.util.*;

public class MaxFinder {

    public static Integer findMaximum(Integer x, Integer y, Integer z) {
        Integer max = x;

        if (y.compareTo(max) > 0) {
            max = y;
        }

        if (z.compareTo(max) > 0) {
            max = z;
        }

        return max;
    }

    public static void main(String[] args) {
        
        Integer result1 = findMaximum(3, 2, 1);
        System.out.println("Test Case 1 - Max: " + result1);

        
        Integer result2 = findMaximum(1, 3, 2);
        System.out.println("Test Case 2 - Max: " + result2);


        Integer result3 = findMaximum(1, 2, 3);
        System.out.println("Test Case 3 - Max: " + result3);
    }
}

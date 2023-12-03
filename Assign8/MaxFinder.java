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

    public static Float findMaximum(Float x, Float y, Float z) {
        Float max = x;

        if (y.compareTo(max) > 0) {
            max = y;
        }

        if (z.compareTo(max) > 0) {
            max = z;
        }

        return max;
    }

    public static void main(String[] args) {
        
        System.out.println("Integer Values: ");
        Integer result1 = findMaximum(3, 2, 1);
        System.out.println("Test Case 1 - Max: " + result1);

        
        Integer result2 = findMaximum(1, 3, 2);
        System.out.println("Test Case 2 - Max: " + result2);


        Integer result3 = findMaximum(1, 2, 3);
        System.out.println("Test Case 3 - Max: " + result3);

      //----------------------------------------------------------------//

      System.out.println("Floating Values: ");
        Float res1 = findMaximum(10.5f, 5.2f, 7.8f);
        System.out.println("Test Case 1 - Max: " + res1);

       
        Float res2 = findMaximum(3.6f, 8.9f, 4.1f);
        System.out.println("Test Case 2 - Max: " + res2);

     
        Float res3 = findMaximum(2.3f, 6.7f, 9.0f);
        System.out.println("Test Case 3 - Max: " + res3);
    }
}

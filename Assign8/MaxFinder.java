import java.util.*;
public class MaxFinder<T extends Comparable<T>> {

    public T findMaximum(T x, T y, T z) {
        T max = x;

        if (y.compareTo(max) > 0) {
            max = y;
        }

        if (z.compareTo(max) > 0) {
            max = z;
        }

        return max;
    }

    public static void main(String[] args) {
        
        MaxFinder<Integer> intMax = new MaxFinder<>();
        Integer intResult = intMax.findMaximum(3, 2, 1);
        System.out.println("Test Case 1 - Max (Integer): " + intResult);

       
        MaxFinder<Float> floatMax = new MaxFinder<>();
        Float floatResult = floatMax.findMaximum(3.6f, 8.9f, 4.1f);
        System.out.println("Test Case 2 - Max (Float): " + floatResult);

       
        MaxFinder<String> stringMax = new MaxFinder<>();
        String stringResult = stringMax.findMaximum("Simon", "Go", "Back");
        System.out.println("Test Case 3 - Max (String): " + stringResult);
    }
}

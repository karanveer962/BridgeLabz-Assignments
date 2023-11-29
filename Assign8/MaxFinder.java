import java.util.*;

public class MaxFinder<T extends Comparable<T>> {

    private T x, y, z;

    public MaxFinder(T x, T y, T z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public T findMaximum() {
        return MaxFinder.testMaximum(x, y, z);
    }

    public static <T extends Comparable<T>> T testMaximum(T x, T y, T z) {
        T max = x;

        if (y.compareTo(max) > 0) {
            max = y;
        }

        if (z.compareTo(max) > 0) {
            max = z;
        }

        printMax(x, y, z, max);

        return max;
    }

    private static <T> void printMax(T x, T y, T z, T max) {
        System.out.println("Maximum of " + x + ", " + y + ", " + z + " is " + max);
    }

    public static void main(String[] args) {
        
        MaxFinder<Integer> intMax = new MaxFinder<>(3, 2, 1);
        Integer intResult = intMax.findMaximum();
        System.out.println("Test Case 1 - Max (Integer): " + intResult);

        
        MaxFinder<Float> floatMax = new MaxFinder<>(3.6f, 8.9f, 4.1f);
        Float floatResult = floatMax.findMaximum();
        System.out.println("Test Case 2 - Max (Float): " + floatResult);


        MaxFinder<String> stringMax = new MaxFinder<>("Simon", "Go", "Back");
        String stringResult = stringMax.findMaximum();
        System.out.println("Test Case 3 - Max (String): " + stringResult);
    }
}

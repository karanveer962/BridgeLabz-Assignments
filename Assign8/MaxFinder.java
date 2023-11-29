import java.util.*;

public class MaxFinder<T extends Comparable<T>> {

    private T[] values;

    public MaxFinder(T... values) {
        this.values = values;
    }

    public T findMaximum() {
        if (values == null || values.length == 0) {
            throw new IllegalArgumentException("Empty Array!!!");
        }

        Arrays.sort(values);

        return values[values.length - 1];
    }

    public static <T extends Comparable<T>> T testMaximum(T... values) {
        if (values == null || values.length == 0) {
            throw new IllegalArgumentException("Empty Array!!!");
        }

        Arrays.sort(values);
        T max = values[values.length - 1];

        printMax(values, max);

        return max;
    }

    private static <T> void printMax(T[] values, T max) {
        System.out.println("Maximum of " + Arrays.toString(values) + " is " + max);
    }

    public static void main(String[] args) {

        MaxFinder<Integer> intMax = new MaxFinder<>(11, 6, 8, 27, 3);
        Integer intResult = intMax.findMaximum();
        System.out.println("Test Case 1 - Max (Integer): " + intResult);


        MaxFinder<Float> floatMax = new MaxFinder<>(3.6f, 8.9f, 4.1f, 5.5f, 2.2f);
        Float floatResult = floatMax.findMaximum();
        System.out.println("Test Case 2 - Max (Float): " + floatResult);

       
        MaxFinder<String> stringMax = new MaxFinder<>("Simon", "Go", "Back", "To", "Your","Zoneland");
        String stringResult = stringMax.findMaximum();
        System.out.println("Test Case 3 - Max (String): " + stringResult);
    }
}

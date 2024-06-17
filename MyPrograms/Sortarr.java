import java.util.Arrays;
import java.util.Collections;

public class Sortarr{
    public static void main(String[] args) {
        // Example array
        Integer[] numbers = {5, 2, 9, 1, 5, 6};

        // Using Arrays.sort() with Comparator.reverseOrder()
        Arrays.sort(numbers, Collections.reverseOrder());

        //This is used to sort an array in asscending order
        //Arrays.sort(numbers);
        // Display the sorted array
        System.out.println("Sorted array in descending order: " + Arrays.toString(numbers));
    }
}

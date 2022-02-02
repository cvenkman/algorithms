import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.OptionalInt;

/*
    Жадный алгоритм — алгоритм,
    заключающийся в принятии локально оптимальных решений на каждом этапе,
    допуская, что конечное решение также окажется оптимальным.
 */
public class GreedyAlg {
    public static long maxNumberFromArray(int[] array) throws NoSuchElementException {
        // trows exception if array is empty
        long number = 0;
        while (array.length > 0) {
            OptionalInt max = Arrays.stream(array).max();
            number += max.getAsInt();
             Arrays.binarySearch(array, max.getAsInt());
        }

//        System.out.println(max);

        return number;
    }
    public static void main(String[] args) {
        int[] array = {3, 1, 7, 9, 9, 5};
        try {
            System.out.println(maxNumberFromArray(array));
        } catch (Exception e) {
            System.out.println("getAsInt exception: " + e);
        }

    }
}

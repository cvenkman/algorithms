package BinarySearch;

import java.util.Arrays;
import java.util.Random;

public class BinarySearch {
    private static final int NO_ELEMENT_ERROR = -1;

    private static int findMidpointIndex(int[] array,
                                         int firstIndex, int lastIndex) {
        return (firstIndex + lastIndex) / 2;
    }

    public static int getKeyIndexWithBinarySearch(int key, int[] array) throws NullPointerException{
        if (array == null || array.length == 0)
            throw new NullPointerException("Honey, have you been forgetting array again?");
        int firstIndex = 0;
        int lastIndex = array.length - 1;
        if (key < array[firstIndex] || key > array[lastIndex])
            return NO_ELEMENT_ERROR;

        while (firstIndex <= lastIndex) {
            int midpointIndex = findMidpointIndex(array, firstIndex, lastIndex);
            if (array[midpointIndex] == key)
                return midpointIndex;
            if (array[midpointIndex] < key) {
                firstIndex = midpointIndex + 1;
            } else if (array[midpointIndex] > key) {
                lastIndex = midpointIndex - 1;
            }
        }
        return NO_ELEMENT_ERROR;
    }

    public static void main(String[] args) {
        final int ARRAY_SIZE = 20;
        Random random = new Random();
        int[] array = new int[ARRAY_SIZE];
        for (int i = 0; i < ARRAY_SIZE; i++) {
            array[i] = random.nextInt();
        }
        Arrays.sort(array);

        try {
            System.out.println("--- Search array[6]");
            int index = getKeyIndexWithBinarySearch(array[6], array);
            System.out.println("my binary search: " + array[6] + " index: " + index);
            index = Arrays.binarySearch(array, array[6]);
            System.out.println("array class binary search: " + array[6] + " index: " + index);

            System.out.println("--- Search -2 in {1, 2, 3}: ");
            index = getKeyIndexWithBinarySearch(-2, new int[]{1, 2, 3});
            System.out.println("my binary search: " + -2 + " index: " + index);
            index = Arrays.binarySearch(new int[]{1, 2, 3}, -2);
            System.out.println("array class binary search: " + -2 + " index: " + index);

            System.out.println("--- Search random int: ");
            int tmp_num = random.nextInt();
            index = getKeyIndexWithBinarySearch(tmp_num, array);
            System.out.println("my binary search: " + tmp_num + " index: " + index);
            index = Arrays.binarySearch(array, tmp_num);
            System.out.println("array class binary search: " + tmp_num + " index: " + index);

            System.out.println("--- Search 99 in empty array: ");
            index = getKeyIndexWithBinarySearch(99, new int[]{});
            System.out.println(99 + " index: " + index);
        } catch (NullPointerException e) {
            System.out.println("Exception: " + e.getMessage());
        }

    }
}

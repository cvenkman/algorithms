package BinarySearch;

import java.util.Arrays;

public class BinarySearch {
    private static final int NO_ELEMENT_ERROR = -1;
//    int[] _array;
//    int _firstIndex;
//    int _lastIndex;
//
//    public BinarySearch(int[] array) throws NullPointerException {
//        if (array == null || array.length == 0)
//            throw new NullPointerException("Honey, have you been forgetting array again?");
//        _array = array;
//        _firstIndex = 0;
//        _lastIndex = _array.length - 1;
//    }

    private static int findMidpointIndex(int[] array,
                                         int firstIndex, int lastIndex) {
        return (firstIndex + lastIndex) / 2;
    }

    public static int getKeyIndexWithBinarySearch(int key, int[] array) throws NullPointerException{
        if (array == null || array.length == 0)
            throw new NullPointerException("Honey, have you been forgetting array again?");
        Arrays.sort(array);
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
        int[] array = {89, 57, 91, 47, 95, 3, 27, 22, 67, 99};
        try {
            /*
                // binarySearch from Arrays class:
                Arrays.sort(array);
                int index = Arrays.binarySearch(array, 67);
                System.out.println(67 + " index: " + index);
            */
            int index = getKeyIndexWithBinarySearch(67, array);
            System.out.println(67 + " index: " + index);

            index = getKeyIndexWithBinarySearch(-1, new int[]{1, 2, 3});
            System.out.println(-1 + " index (no element error): " + index);

            index = getKeyIndexWithBinarySearch(99, array);
            System.out.println(99 + " index: " + index);

            index = getKeyIndexWithBinarySearch(99, new int[]{});
            System.out.println(99 + " index: " + index);
        } catch (NullPointerException e) {
            System.out.println("Exception: " + e.getMessage());
        }

    }
}

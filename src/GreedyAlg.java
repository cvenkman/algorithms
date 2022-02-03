import java.util.*;

/*
    Жадный алгоритм — алгоритм,
    заключающийся в принятии локально оптимальных решений на каждом этапе,
    допуская, что конечное решение также окажется оптимальным.
 */
public class GreedyAlg {
    public static long makeMaxNumberFromArray(int[] array) {
        long number = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int a : array) list.add(a);
        Integer max;
        for (int i = array.length - 1; i >= 0; i--) {
            max = Collections.max(list);
            number += max * (long)Math.pow(10, i);
            list.remove(max);
        }
        return number;
    }

    public static int findWayToGasStation(int[] array, int car_can_drive) {
        int previous_stop = array[0];
        int stop = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i + 1] - previous_stop > car_can_drive) {
                previous_stop = array[i];
                stop++;
                System.out.println(array[i]);
            }
        }
        return stop;
    }

    public static void main(String[] args) {
        {
            int[] array = {3, 1, 7, 9, 9, 5, 0, 0, 4, 3, 43};
            int[] empty_array = {0};
            System.out.println(makeMaxNumberFromArray(array));
            System.out.println(makeMaxNumberFromArray(empty_array));
        }
        System.out.println("-------------");

        int[] array = {0, 200, 375, 550, 750, 950};
        System.out.println(findWayToGasStation(array, 400));
        System.out.println();
        int[] array2 = {0, 200, 401};
        System.out.println(findWayToGasStation(array2, 400));
    }
}

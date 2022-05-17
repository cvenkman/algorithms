import java.util.*;

/*
    Жадный алгоритм — алгоритм,
    заключающийся в принятии локально оптимальных решений на каждом этапе,
    допуская, что конечное решение также окажется оптимальным.
 */
public class GreedyAlg {
    public static long makeMaxNumberFromArray(int[] array) {
        /*
            Дан неупорядоченный список цифр
            (обрабатывает и числа, но логичнее - цифры от 0 до 9).
            Составить из них наибольшее число
        */
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
        /*
        нужно проехать от одной точки (array[0]) до другой (array[array.length]
        с минимальным количеством остановок,
        при условии, что автомобиль может проехать на одной заправке
        car_can_drive км (400 км)
        */
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
//        {
//            int[] array = {3, 1, 7, 9, 9, 5, 0, 0, 4, 3, 43};
//            int[] empty_array = {0};
//            System.out.println(makeMaxNumberFromArray(array));
//            System.out.println(makeMaxNumberFromArray(empty_array));
//        }
//        System.out.println("-------------");
//
//        int[] array = {0, 200, 375, 550, 750, 950};
//        System.out.println(findWayToGasStation(array, 400));
//        System.out.println();
//        int[] array2 = {0, 200, 401};
//        System.out.println(findWayToGasStation(array2, 400));

//        HashMap<Integer, Integer> value_weight = new HashMap<>();
//        value_weight.put(20, 4);
//        value_weight.put(18, 3);
//        value_weight.put(14, 2);
//        System.out.println(findMaxValueFitsInTheBackpack(7, value_weight));
    }
}

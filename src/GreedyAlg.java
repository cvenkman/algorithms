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
    public static void main(String[] args) {
        int[] array = {3, 1, 7, 9, 9, 5, 0, 0, 4, 3, 43};
        int[] empty_array = {0};
        System.out.println(makeMaxNumberFromArray(array));
        System.out.println(makeMaxNumberFromArray(empty_array));
    }
}

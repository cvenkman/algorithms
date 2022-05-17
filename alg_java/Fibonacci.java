import java.util.Arrays;

public class Fibonacci {
    private static long fibNaive(int n) {
        /*
            O(n^2)
            рекурсивно
            на больших аргументах слишком много вызовов,
            часто выполняется одинаковые вычисления
         */
        if (n <= 1)
            return n;
        return fibNaive(n - 1) + fibNaive(n - 2);
    }

    private static long fibEffective(int n) {
        /*
            O(n): O(n) + O(3) + O(n) => O(2n) => O(n)
        */
        if (n <= 1)
            return n;
        long[] array = new long[n + 1]; // O(n)
        array[0] = 0; // O(1)
        array[1] = 1; // O(1)

        for (int i = 2; i <= n; i++) // O(n)
            array[i] = array[i - 1] + array[i - 2];
        return array[n]; // O(1)
    }

    private static long fibMemoization(int n, long[] array) {
        if (array[n] != -1)
            return array[n];
        if (n <= 1)
            return n;
        array[n] = fibMemoization(n - 1, array) + fibMemoization(n - 2, array);
        return array[n];
    }

    public static void main(String[] args) {
//        System.out.println(fibNaive(0));
//        System.out.println(fibNaive(3));
//        System.out.println(fibNaive(40)); // на больших числах выполняется несколько минут/лет

        System.out.println(fibEffective(100));
        int n = 100;
        long[] array = new long[n + 1];
        Arrays.fill(array, -1);
        System.out.println(fibMemoization(n, array));
    }
}

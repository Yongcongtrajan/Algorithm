package binarysearch;

public class Fibonacci {
    public int fibonacci(int K) {
        if ( K <= 0) {
            return 0;
        }
        int [] array = new int [K + 1];
        array[1] = 1;
        for (int i = 2 ; i <= K ; i++) {
            array[i] = array[i-1] + array [i-2];
        }
        return array[K];
        // DP with O(N) space;
    }

    public long fibonacci(long K) {
        long a = 0;
        long b = 1;
        if (K <= 0) {
            return 0;
        }
        while (K > 1) {
            long temp = a + b;
            a = b;
            b = temp;
            K--;

        }
        return b;
        // DP with O(1) space;

    }
}

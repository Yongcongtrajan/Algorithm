package antra;

import java.util.Collections;
import java.util.PriorityQueue;

public class SecondLargest {
    public static void main(String[] args) {
        System.out.println(secondLargest(new int[] {2,4,5,7,3,8,9}));
        System.out.println(secondLargestPQ(new int[] {2,4,5,7,3,8,9}));
    }
    private static int secondLargest(int[] array) {
        if (array == null || array.length < 2) {
            return -1;
        }
        //  int largest;
        //  int secondLargest;
        for (int i = 0; i < array.length - 1; i++) {

            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }


            }
        }
        return array[1];
    }
    private static int secondLargestPQ(int [] array) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i : array) {
            pq.add(i);
        }
        pq.poll();
        return pq.poll();
    }
}

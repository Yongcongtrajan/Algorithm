package priorityqueue;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class pq {
    public static void main(String[] args) {
      /*  PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.offer(5);
        minHeap.offer(4);
        minHeap.offer(2);
        minHeap.offer(1);
        minHeap.offer(3);

        while (!minHeap.isEmpty()) {
            System.out.println(minHeap.poll());
        }*/
        PriorityQueue<Cell> minHeap = new PriorityQueue<>(new MyComparator());
        Cell c1 = new Cell(0, 0, 0);
        Cell c2 = new Cell(0, 1, 2);
        minHeap.offer(c1);
        minHeap.offer(c2);
        System.out.println(minHeap.poll().value);
        System.out.println(minHeap.poll().value);
        PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());
        maxheap.offer(5);
        maxheap.offer(4);
        maxheap.offer(2);
        maxheap.offer(1);
        maxheap.offer(3);
        while (!maxheap.isEmpty()) {
            System.out.println(maxheap.poll());
        }
        PriorityQueue<Cell> pQueue = new PriorityQueue<>(new Comparator<Cell>() {
            @Override
            public int compare(Cell o1, Cell o2) {
                // return 0;
                if (o1.value == o2.value) {
                    return 0;
                }
                return o1.value < o2.value ? 1 : -1;
            }
        });

        pQueue.offer(new Cell(0, 0, 5));
        pQueue.offer(new Cell(0, 1, 4));
        pQueue.offer(new Cell(0, 2, 3));
        pQueue.offer(new Cell(0, 3, 1));
        pQueue.offer(new Cell(0, 4, 2));

        while (!pQueue.isEmpty()) {
            System.out.println(pQueue.poll().value);
        }
        PriorityQueue<Cell> pQueue2 = new PriorityQueue<>((Cell c3, Cell c4) -> {
            if (c3.value == c4.value) {
                return 0;
            }
            return c3.value < c4.value ? 1 : -1;
        });

        System.out.println("----------------------");

        pQueue2.offer(new Cell(0, 0, 5));
        pQueue2.offer(new Cell(0, 1, 4));
        pQueue2.offer(new Cell(0, 2, 3));
        pQueue2.offer(new Cell(0, 3, 1));
        pQueue2.offer(new Cell(0, 4, 2));

        while (!pQueue2.isEmpty()) {
            System.out.println(pQueue2.poll().value);
        }


    }

}

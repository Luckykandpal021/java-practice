import java.util.PriorityQueue;

public class PriorityQueuePractice {
    public static void main(String[] args) {
        // Behind the Scene Priority Queue Follows a Minimum Heap Data-Structure
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(55);
        pq.add(12);
        pq.add(297);
        pq.add(975);
        System.out.println(pq);
        pq.add(55); // Duplicate value is allowed
        System.out.println(pq);
        pq.add(297);
        System.out.println(pq);
    }
}

// Output:-[12, 55, 297, 975]
// [12, 55, 297, 975, 55]
// [12, 55, 297, 975, 55, 297]
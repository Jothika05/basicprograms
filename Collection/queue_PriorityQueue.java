package Collection;

import java.util.PriorityQueue;

public class queue_PriorityQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue pq=new PriorityQueue();
		pq.add("A");
		pq.add("C");
		pq.add("O");
		pq.add("B");
		pq.add("S");
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());

        
	}

}

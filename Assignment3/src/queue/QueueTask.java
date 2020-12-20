package queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTask {
	public static void main(String[] args) {
		Queue<String> q1 = new LinkedList<>();	
// adds the items in the order that it is inserted
		q1.add("Juan");
		q1.add("Jissela");
		q1.add("Fabidaly");
		q1.add("Winnifer");
		System.out.println("Original Queue: " + q1);	
		q1.add("Angel");
		q1.add("Ramon");
		q1.poll(); //popped out the next (first) in the queue
		q1.poll(); // popped out the next item in the queue
		q1.add("Felix");
		System.out.println("After adding new items: " + q1);
		
		System.out.println("");
		
		Queue<Integer> pq1 = new PriorityQueue<>();
		pq1.add(10);
		pq1.add(20);
		pq1.add(30);
		pq1.add(40);	
		pq1.add(50);
		pq1.add(60);
		pq1.add(70);
		System.out.println("After adding new items: " + pq1);
		pq1.poll(); //popped out the item with most priority
		pq1.poll();
		pq1.poll();
		pq1.add(25);//added anothe item
		System.out.println("After Removing the item with most priority: " + pq1);
		System.out.println(pq1);
		pq1.poll(); //popped out the item with most priority
		pq1.poll(); //popped out the item with most priority
		System.out.println(pq1);
		
		
		
	}
}
//Task3)Explore Queue Interface and try implementing Queue using LinkedList and PriorityQueue, and get the difference between them
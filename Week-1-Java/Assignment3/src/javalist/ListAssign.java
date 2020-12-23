package javalist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListAssign {
public static void main(String[] args) {
		
		List li1=new LinkedList();
		/*
		li1.add("hello");
		li1.add(2222);
		li1.add(true);
		li1.add(1212222);
		li1.add(2222.22333);
		li1.add(222222222222222222L);
		*/		
//My code: commented the above add methods and used addAll method to add all values as one line in conjunction with Arrays.asList
		li1.addAll(Arrays.asList("hello", 2222, true, 1212222, 2222.22333, 222222222222222222L));
//My ends code.	
		System.out.println("li1 = "+li1);		 
		
		List<Integer> li2=new LinkedList<>();
		/*
		li2.add(22);
		li2.add(22);
		li2.add(122);
		li2.add(null);
		li2.add(null);
		li2.add(220);
		li2.add(221);
		li2.add(22);
		li2.add(null);
		li2.add(42);
		li2.add(22);
		li2.add(null);
		*/
//My code: commented the above add methods and used addAll method to add all values as one line in conjunction with Arrays.asList		
		li2.addAll(Arrays.asList(22, 22, 122, null, null, 220, 221, 22, null, 42, 22, null));
//My code end.		
		System.out.println("li2 = "+li2);
		
		li2.add(0, 333);
		System.out.println("li2 = "+li2);
		li2.set(0, 444);
		System.out.println("li2 = "+li2);
		System.out.println("li2.size() = "+li2.size());
		System.out.println("li2.get(3) : "+li2.get(3));
	
		
		
//My code: looped through li1 and used the .set method to replace all the nulls with 5
		for(int i = 0; i < li2.size(); i++) {
			if(li2.get(i) == null) {
				li2.set(i, 5);
			}
		}
//end of my code
		
		li2.remove(3); //look for index not the value
		System.out.println("li2 after li2.remove(3) = "+li2);
		
		Integer i=22;
		li2.remove(i); //here it removes first occurance of the value i;
		System.out.println("li2 after li2.remove(i) = "+li2);
		while(li2.remove(i)) {} //it will remove all occurance of i
		System.out.println("li2 after while(li2.remove(i)){} = "+li2);
		
		System.out.println("li2.contains(100) : "+li2.contains(100));
		System.out.println("li2.contains(42) : "+li2.contains(42));
		
		System.out.println("\nTraversing using for loop");
		for (int j = 0; j < li2.size(); j++) {
			System.out.print(li2.get(j)+" ");
		}
		
		System.out.println("\n\nTraversing using for-each loop");
		for (Integer j:li2) {
			System.out.print(j+" ");
		}
		
		Collections.reverse(li2);
		System.out.println("\nli2  after Collections.reverse(li2); "+li2);
		Collections.shuffle(li2);
		System.out.println("li2  after Collections.shuffle(li2); "+li2);
		
		Collections.replaceAll(li2, null, -1);
		System.out.println("li2  after Collections.replaceAll(li2, null, -1); "+li2);
		Collections.sort(li2); //ascending but it shouldnt have null values
		System.out.println("li2  after Collections.sort(li2); "+li2);
		Collections.sort(li2, Collections.reverseOrder()); //descending order
		System.out.println("li2  after Collections.sort(li2, Collections.reverseOrder()); "+li2);
		
		//for binarySearch Collection should and must be sorted in ascending order
		Collections.sort(li2);
		System.out.println("li2  after Collections.sort(li2); for doing binarySearch "+li2);
		System.out.println("Collections.binarySearch(li2, 100) : "+Collections.binarySearch(li2, 100));
		System.out.println("Collections.binarySearch(li2, 42) : "+Collections.binarySearch(li2, 42));
		
		List<Integer> li3=new ArrayList<>(li2);
		System.out.println("li3 = "+li3);
		li3.addAll(li2);
		System.out.println("li3 = "+li3);
		li3.add(100);
		li3.add(300);
		li3.add(600);
		li3.add(99);
		System.out.println("li3 = "+li3);
		System.out.println("li2 = "+li2);
		//li3.retainAll(li2);
		//System.out.println("li3 after retainAll = "+li3);
		li3.removeAll(li2);
		System.out.println("li3 after removeAll = "+li3);
		
		
		System.out.println("\nIterating li3 using Iterator");
		Iterator<Integer> it=li3.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
//My code: used the clear()	method to clear the li2 LinkedList added li3 items into li2
		li2.clear();
		System.out.println("li2.clear() = " + li2);	
		li2.addAll(li3);
		System.out.println(li2);
//My code ends.		
	}

}
//Task1)Try to play around with all the methods shown above
//Task2)Repeat the arrays problems given earlier here using Lists
//Task3)Explore Queue Interface and try implementing Queue using LinkedList and PriorityQueue, and get the difference between them

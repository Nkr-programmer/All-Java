package queue_1_array;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

public class Priority_que_array {

 public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
	 PriorityQueue<String>	 s	= new PriorityQueue<String>(); 


	   //1 
	 s.add("C");
s.add("C++");
s.add("JAVA");
s.add("PYTHON");




//2
			System.out.println(s.peek());
			//3 4
	Iterator  i= s.iterator();
	
	while(i.hasNext()){
			System.out.println(i.next());
	}
	System.out.println();
	
	//5
		s.poll();
		
	Iterator  it= s.iterator();
		
		while(it.hasNext()){
				System.out.println(it.next());
		}
		System.out.println();
		
		//6
		s.remove("C");
		
    Iterator  ite= s.iterator();
		
		while(ite.hasNext()){
				System.out.println(ite.next());
		}
		//7
		System.out.println();
		boolean b = s.contains("C");
		
		System.out.println(b);
		//8
		Object[] arr =s.toArray();

		for(int v=0;v<arr.length;v++)
		{
			//9
			System.out.println(arr[v].toString());
			
		}
		//10
		System.out.println();
		s.offer("D");
		  Iterator  ites= s.iterator();
			
			while(ites.hasNext()){
					System.out.println(ites.next());
			}
		//11
			System.out.println();
			//12
			System.out.println(s.size());
		System.out.println();
		//13
			Comparator y=s.comparator();
			System.out.println(y);
			//14
			s.clear();
			  Iterator  itee= s.iterator();
				
				while(itee.hasNext()){
						System.out.println(itee.next());
				}
	}

}



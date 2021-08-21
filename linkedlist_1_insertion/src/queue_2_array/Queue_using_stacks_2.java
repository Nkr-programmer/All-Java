package queue_2_array;

import java.util.Stack;

public class Queue_using_stacks_2 {
	
	static Stack<Integer> a=new Stack<Integer>(); 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue_using_stacks_2 q=new Queue_using_stacks_2();		
		q.enque(5);
		q.enque(7);
		q.enque(8);
		q.enque(9);
		q.enque(11);
		q.enque(15);

System.out.println(q.deque());
System.out.println(q.deque());
System.out.println(q.deque());
System.out.println(q.deque());
System.out.println(q.deque());
System.out.println(q.deque());		
System.out.println(q.deque());
System.out.println(q.deque());	
	}



private int deque() {

	
	if(a.isEmpty())
	{System.out.println("null");
		System.exit(0);
	}

	int y= a.pop();
	
	if(a.isEmpty())
	return y;
	
	int z=deque();
a.push(y);	

return z;
}

static void enque(int i) {
	// TODO Auto-generated method stub
	
	a.push(i);
}
}

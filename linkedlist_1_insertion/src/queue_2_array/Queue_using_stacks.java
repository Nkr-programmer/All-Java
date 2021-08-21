package queue_2_array;

import java.util.Stack;

public class Queue_using_stacks {
static Stack<Integer> a=new Stack<Integer>(); 
static Stack<Integer> b=new Stack<Integer>();	
		



public static void main(String[] args) {
			// TODO Auto-generated method stub
	Queue_using_stacks q=new Queue_using_stacks();
	
q.enque(5);
q.enque(7);
q.enque(8);
q.enque(9);
q.enque(11);
q.enque(15);

q.deque();
q.deque();
q.deque();
q.deque();



		}




private void deque() {

	
	if(a.isEmpty())
	{
		System.out.println("not");
System.exit(0);
	}
	
System.out.println(	a.pop()); 


}




private static void enque(int i) {
	// TODO Auto-generated method stub
	
	while(!a.isEmpty())
			{
		b.push(a.pop());
			}
			a.push(i);

			while(!b.isEmpty())
			{
		a.push(b.pop());
			}
	
	System.out.println(a.peek());	
}

}

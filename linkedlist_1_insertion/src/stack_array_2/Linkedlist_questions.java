package stack_array_2;
import java.util.HashSet;
import java.util.Stack;

public class Linkedlist_questions {

	Node head;
	class Node {
		char data;
		Node next;
Node(char d){
			
			data=d;
			next=null;
		}
		
		
	}
	public boolean isempty() {
		
		if(head==null)
			return true;
		return false;
	}
	
	public void push(char data) {
		
		Node temp =new Node (data);
		
		if(head==null)
			head=temp;
		
		
		Node x=head;
		head=temp;
		temp.next=x;
		
	
	}
	public static void brakket(String parent) {
		
		int x=0;
		Stack<Character> s= new Stack<Character>();
		for (int i=0;i<parent.length();i++)
		{
			char c= parent.charAt(i);
			if(c=='(')
			{
				s.push(c);
			}
			else
				if(c=='{')
				{
					s.push(c);	
				}
				else
					if(c=='[')
					{
						s.push(c);
					}
					else
					{
						if(s.isEmpty()&&(c==')'||c=='}'||c==']'))
						{
							x=1;
							break;
						}
						
	if(c==')')
	{
		if(s.peek()=='(') {s.pop();}
		else {x=1;

			break;
		}
	}
	else
	if(c=='}')
	{
		if(s.peek()=='{') {s.pop();}
		else {x=1;

			break;}
	}
	else
	if(c==']')
	{
		if(s.peek()=='[') {s.pop();}
		else {x=1;

			break;
		}
	}			
	
	
	
	
						
					}
			
		}
		while(!s.isEmpty())
		{
			x=1;
			System.out.println(s.pop()+"y");
			
		}
		
		

		if(x==1)
		{
			System.out.println("improper");
		}
		else
		{
			System.out.println("proper");
		}
	}
	public char pop() {
		
		if(head==null)
		{
			System.out.println("underflow");
		}
		Node x=head;
		head=head.next;
		x.next=null;
		return x.data;
	}
	public char top() {
		
		if(head==null)
		{return 0;}
		if(head!=null)
		{
			return head.data;
			
		}
		return 0;
	}
	
		public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		char t;
		
		Linkedlist_questions	 list	= new Linkedlist_questions();
			list.push('0');t=list.top(); System.out.println(t);
			list.push('1');t=list.top(); System.out.println(t);
			list.push('2');t=list.top(); System.out.println(t);
			list.push('3');t=list.top(); System.out.println(t);
			list.push('4');t=list.top(); System.out.println(t);
			t=list.top(); System.out.println(t);  
		list.pop();t=list.top(); System.out.println(t);
		list.pop();t=list.top(); System.out.println(t);
		list.pop();t=list.top(); System.out.println(t);
		list.pop();t=list.top(); System.out.println(t);
		list.pop();t=list.top(); System.out.println(t);
		list.pop();t=list.top(); System.out.println(t);


		
		if(list.isempty())
		{
			System.out.println("empty");
		}
		else
		{
			System.out.println("not empty");
		}

String parent ="{}()   (){{}}{}";
		brakket(parent);
	}
	}

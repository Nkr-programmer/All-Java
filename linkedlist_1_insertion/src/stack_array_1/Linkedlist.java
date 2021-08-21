package stack_array_1;

import java.util.HashSet;
import java.util.Stack;


public class Linkedlist {
	Node head;
	class Node {
		int data;
		Node next;
Node(int d){
			
			data=d;
			next=null;
		}
		
		
	}
	public boolean isempty() {
		
		if(head==null)
			return true;
		return false;
	}
	
	public void push(int data) {
		
		Node temp =new Node (data);
		
		if(head==null)
			head=temp;
		
		
		Node x=head;
		head=temp;
		temp.next=x;
		
	
	}
	
	public int pop() {
		
		if(head==null)
		{
			System.out.println("underflow");
		}
		Node x=head;
		head=head.next;
		x.next=null;
		return x.data;
	}
	public void top() {
		if(head!=null)
		{
			System.out.println(head.data);
			
		}
		if(head==null)
			System.out.println("underflow");
	}
	
	
	
	public static int prev(char c) {
		switch(c) {
		case '+':
		case '-':
			return 1;
		case '*':
		case '/':
			return 2;
		case '^':
			return 3;

		}
		 return -1;
	} 
	
	public static Integer posttoin(String expre)
	{
		
		//Stack<Integer> s= new Stack<Integer>();
		Linkedlist s= new Linkedlist();
		for(int i=0;i<expre.length();i++)
		{
			char c=expre.charAt(i);
		if(Character.isDigit(c))
		{
			s.push(c-'0');
		}
		else
		{
			int a=s.pop();
			int b=s.pop();
			
			switch(c) {
			case '+':s.push(b+a);
			break;
			case '-':s.push(b-a);
			break;
			case '*':s.push(b*a);
			break;
			case '/':s.push(b/a);
			break;
			case '^':s.push(b^a);
			break;
			}
		}
			
		}
		
		return s.pop();
	}

public static String reversal(String reverse) {
	
	Stack<Character> s= new Stack<Character>();
	String  temp= new String("");
	
	
	for(int i=0;i<reverse.length();i++)
	{
		
		char c=reverse.charAt(i);
		s.push(c);
	}
	
	for(int i=0;i<reverse.length();i++)
	{
		
		
		temp+=s.pop();
	}
	
	
	return temp;
}

	public static String intopost(String expre) {
		
		Stack<Character> s= new Stack<Character>();
		String  temp= new String("");
	
		
		for(int i=0;i<expre.length();i++)
		{
			char c=expre.charAt(i);
		
			if(Character.isLetterOrDigit(c))
		{
			temp+=c;
			//System.out.println(temp);
		}
		else
			if(c=='(')
			{
				s.push(c);
				
				
			}
			else
				if(c==')')
				{
					
					while((!s.isEmpty())&&(s.peek()!='(')){
						temp+=s.pop();
						
					}
					//if(s.peek()=='(')
						s.pop();
						
				}
				else {
					
					while((!s.isEmpty())&&(prev(c)<=prev(s.peek()))) {
						temp+=s.pop();
					}
					
					s.push(c);
					
				}
		
		}
	
		while(!s.isEmpty())
		{
			temp+=s.pop();
	
		}
		return temp;
	} 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		Linkedlist	 list	= new Linkedlist(); 

			list.push(0);list.top();
			list.push(1);list.top();
			list.push(2);list.top();
		
		list.pop();list.top();
		list.pop();list.top();
		list.pop();list.top();
		list.pop();list.top();
		

		list.push(0);list.top();
		list.push(1);list.top();
		
		if(list.isempty()==true)
		{
			System.out.println("empty");
		}
		else
		{
			System.out.println("not empty");
		}

		
		String expre ="2+3*(4*5-6)/(7+8*9)-1";
		expre=intopost(expre);
		System.out.println(expre);
		System.out.println(posttoin(expre));
		
		
		String reverse="i hate you";
		System.out.println(reverse);
		reverse= reversal(reverse);
		System.out.println(reverse);
	}

}

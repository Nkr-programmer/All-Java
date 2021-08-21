package queue_2_array;

import java.util.Queue;

import java.util.LinkedList;



public class Nos_to_binary {

	
	static Queue<String> q= new LinkedList<String>();
	
	
	
	public static void main(String[] args) {
		int n=100;
		q.add("1");
		getbinary(n);
		
	}

	private static void getbinary(int i) {
		// TODO Auto-generated method stub
	
		if(i==0) {return ;}
		

		
			String s1=q.remove();
			System.out.println(s1);
			String s2= s1;
			q.add(s1+"0");
			q.add(s1+"1");
			getbinary(i-1);
			
			
		
		
		
		
	}

}

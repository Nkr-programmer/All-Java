package basic;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Super_Ugly_Numbers {
	static class The_Comparator implements Comparator<Integer> {

		@Override
		public int compare(Integer o1, Integer o2) {
			// TODO Auto-generated method stub
			return o1.compareTo(o2);
		}
		}
	  public static void main(String args[])   {
	      int n= 150;
	      int a[]= {2,3,5};
	      PriorityQueue<Integer>pq= new PriorityQueue<Integer>(new The_Comparator());
	      for(int g: a) {pq.add(g);}
	     int count=1,no=0;
	     while(count!=n) 
	     {
	    	 no=pq.remove();
	    	 if(no!=pq.peek()) 
	    	 {
	    		 count++;
	    		 for(int g:a) {pq.add(no*g);}
	    	 }
	    	 
	     }
	 System.out.println(no);

	    }
	 
	}

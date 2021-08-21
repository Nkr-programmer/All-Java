package intro;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Vector;

public class Paths_between_source_and_dest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int n = 9;
		    Vector<Integer>[] adj = new Vector[13];
		    for (int i = 0; i < 13; i++) 
		        adj[i] = new Vector<Integer>();
		      
		    adj[0].add(1);
		    adj[0].add(7);
		    adj[1].add(7);
		    adj[1].add(2);
		    adj[2].add(3);
		    adj[2].add(5);
		    adj[2].add(8);
		    adj[3].add(4);
		    adj[3].add(5);
		    adj[4].add(5);
		    adj[5].add(6);
		    adj[6].add(7);
		    adj[7].add(8);
		    //for directed
		    System.out.println("following to print all paths between source and dest");
		    findPaths(adj,0,5,n);
		    System.out.println("following to print min no edge between source and dest  ");
		    System.out.println(minEdge-1);
	System.out.println("Bidirectional search(A* Algorithm)  this means in finding a path between "
			+ "source and dest run from both sides forward and backward");
	
	
	
	}
static int minEdge=10000;
	private static void findPaths(Vector<Integer>[] adj, int s, int d, int v) {
		// TODO Auto-generated method stub
		
		Queue<ArrayList<Integer>> b = new LinkedList<ArrayList<Integer>>();
		ArrayList<Integer>a= new ArrayList<Integer>();
		a.add(s);
		b.add(a);

		while (!b.isEmpty()) {
			a = b.poll();
		int last=a.get(a.size()-1);
			
			if(last==d) {
				//printing
				for(int i=0;i<a.size();i++)
					System.out.print(a.get(i));
				if(minEdge>a.size()) {minEdge=a.size();}
				System.out.println();
			}
			
			for (int j = 0; j < adj[last].size(); j++) {
				int n = adj[last].get(j);
				if (//just to check its there or not
						check(a,n)
					) {
					ArrayList<Integer>ai= new ArrayList<Integer>(a);
					ai.add(n);
				b.add(ai);
					
				}
				
			}
		}
	}

	private static boolean check(ArrayList<Integer> a, Integer j) {
		// TODO Auto-generated method stub
		for(int i=0;i<a.size();i++)
		{
			if(a.get(i)==j)
			{return false;}
		}
		return true;
	}

}

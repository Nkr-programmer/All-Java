package intro;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Vector;

public class Graph_Build_and_Clone {
//worked on directed and undirected
    int var;
	Vector<Graph_Build_and_Clone>neighbour;
	Graph_Build_and_Clone(int va)
	{
		var=va;
		neighbour=new Vector<Graph_Build_and_Clone>();
	}
	
	  int val;
	int steps;
	  Graph_Build_and_Clone(int va,int st)
		{
			val=va;
			steps=st;
			}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph_Build_and_Clone a1=new Graph_Build_and_Clone(1);
		Graph_Build_and_Clone a2=new Graph_Build_and_Clone(2);
		Graph_Build_and_Clone a3=new Graph_Build_and_Clone(3);
		Graph_Build_and_Clone a4=new Graph_Build_and_Clone(4);
		//all nodes are done
		Vector<Graph_Build_and_Clone>v= new Vector<Graph_Build_and_Clone>();
		v.add(a2);
		v.add(a4);
		a1.neighbour=v;
		//first node and its edges is done
		v= new Vector<Graph_Build_and_Clone>();
		v.add(a1);
		v.add(a3);
		a2.neighbour=v;
		v= new Vector<Graph_Build_and_Clone>();
		v.add(a2);
		v.add(a4);
		a3.neighbour=v;
		v= new Vector<Graph_Build_and_Clone>();
		v.add(a1);
		v.add(a3);
		a4.neighbour=v;
//graph is completed and root could be taken as a1
	bfs(a1);	
	Graph_Build_and_Clone s= clone(a1);
	System.out.println();
	bfs(a1);
	System.out.println();
	System.out.println("Minimunm number of operations is required to convert x into y");
	System.out.println( convert(2,5));
	
	}

	private static Graph_Build_and_Clone clone(Graph_Build_and_Clone a1) {
		// TODO Auto-generated method stub
		HashMap<Graph_Build_and_Clone,Graph_Build_and_Clone>h= new HashMap<Graph_Build_and_Clone,Graph_Build_and_Clone>();
		Queue<Graph_Build_and_Clone> b = new LinkedList<Graph_Build_and_Clone>();
		b.add(a1);
		h.put(a1,new Graph_Build_and_Clone(a1.var));
		while (!b.isEmpty()) {
			Graph_Build_and_Clone	a = b.poll();
			if(a.neighbour!=null) {
			for (int j = 0; j < a.neighbour.size(); j++) {
				Graph_Build_and_Clone n = a.neighbour.get(j);
				if (!h.containsKey(n)) {
					h.put(n,new Graph_Build_and_Clone(n.var));
					b.add(n);
					
				}
			}}
		}
		
		for(Entry<Graph_Build_and_Clone, Graph_Build_and_Clone> k:h.entrySet())
		{
			Vector<Graph_Build_and_Clone>x= new Vector();
			for(Graph_Build_and_Clone s:k.getKey().neighbour)
			{x.add(h.get(s));}
			k.getValue().neighbour=x;
			
		}
		return h.get(a1);
	}


	private static void bfs(Graph_Build_and_Clone a1) {
		// TODO Auto-generated method stub
		HashMap<Graph_Build_and_Clone,Boolean>h= new HashMap<Graph_Build_and_Clone,Boolean>();
		Queue<Graph_Build_and_Clone> b = new LinkedList<Graph_Build_and_Clone>();
		b.add(a1);
		h.put(a1,true);
		while (!b.isEmpty()) {
			Graph_Build_and_Clone	a = b.poll();
			System.out.print(a.var+"[ "+a.neighbour.firstElement().var+"] ");
			if(a.neighbour!=null) {
			for (int j = 0; j < a.neighbour.size(); j++) {
				Graph_Build_and_Clone n = a.neighbour.get(j);
				if (!h.containsKey(n)) {
					h.put(n,true);
					b.add(n);
					
				}
			}
			}
		}
	}

	private static int convert(int i, int j) {
		Queue<Graph_Build_and_Clone> b = new LinkedList<Graph_Build_and_Clone>();
		b.add(new Graph_Build_and_Clone(i,0));
	
		while(!b.isEmpty())
		{
			Graph_Build_and_Clone a=b.poll();
					if(a.val==j) {
				return a.steps;}
			int diff=a.val-1;
			int mul=a.val*2;
			if(diff>0&&diff<1000)
			{
				b.add(new Graph_Build_and_Clone(diff,a.steps+1));
			}
			if(mul>0&&mul<1000)
			{
				b.add(new Graph_Build_and_Clone(mul,a.steps+1));
			}
		}
		return 5;
	}

	
	
}
package graph;

import java.util.Iterator;
import java.util.LinkedList;

public class Detect_cycles_2 {
	private int V,E;
	 Edge  arg[];
class Edge{
	
	int src,des;
};
	public Detect_cycles_2(int v,int e) {
		V = v;
		E=e;
		arg = new Edge[E]; // just a declaration to fix a size
		for (int i = 0; i < e; i++) {
			arg[i] = new Edge();
		}

	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Detect_cycles_2 g = new Detect_cycles_2(4,4);


		
//		g.addEdge(0, 1);
//		g.addEdge(0, 2);
//		g.addEdge(1, 2);
//		g.addEdge(2, 0);
//		g.addEdge(2, 3);
//		g.addEdge(3, 3);
		
		
		g.arg[0].src=0;
		g.arg[0].des=1;	
		g.arg[1].src=1;
		g.arg[1].des=3;	
		g.arg[2].src=3;
		g.arg[2].des=2;	
		g.arg[3].src=2;
		g.arg[3].des=0;	
	
		g.cycle(g);


		
	}



	private void cycle(Detect_cycles_2 g) {
		// TODO Auto-generated method stub
		int pa[]=new int [V];
		for(int i=0;i<pa.length;i++)
		{
			pa[i]=-1;
			
		}
		
		for(int i=0;i<pa.length;i++)
		{
			int xcode=Find(pa,g.arg[i].src);
			int ycode=Find(pa,g.arg[i].des);
			if(xcode==ycode)
			{
				System.out.println("true");
				
			}
			
			union(pa,xcode,ycode);
		}
		System.out.println("false");
	}



	private void union(int[] pa,int xcode, int ycode) {
		// TODO Auto-generated method stub
		int x=Find(pa,xcode);
		int y=Find(pa,ycode);
		pa[x]=y;
		for(int i=0;i<pa.length;i++)
		{
			System.out.print(i+"."+pa[i]+"  ");
		}
		System.out.println();
	}



	private int Find(int[] pa, int des) {
		// TODO Auto-generated method stub
		if(pa[des]==-1)
		return des;
		return Find(pa,pa[des]);
	}

	


}

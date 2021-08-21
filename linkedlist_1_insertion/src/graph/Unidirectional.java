package graph;

import java.util.ArrayList;

public class Unidirectional {

	public Unidirectional() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int y= 5;
		ArrayList<ArrayList<Integer>> arg = new ArrayList<ArrayList<Integer>>(y) ;
		
		for(int i=0;i<y;i++)
		{
			arg.add(new ArrayList<Integer>());
		}
		
		
		addEdge(arg, 0,1);
		addEdge(arg, 0,4);
		addEdge(arg, 1,2);
		addEdge(arg, 1,3);
		addEdge(arg, 1,4);
		addEdge(arg, 2,3);
		addEdge(arg, 3,4);
		
		printGraph(arg);
		
	}

	private static void printGraph(ArrayList<ArrayList<Integer>> arg) {
		for(int i=0;i<arg.size();i++)
		{
			System.out.println(i);
			for(int j=0;j<arg.get(i).size();j++)
			{
				System.out.print("=>"+arg.get(i).get(j));
				
			}
			System.out.println();
		}
		
	}

	private static void addEdge(ArrayList<ArrayList<Integer>> arg, int i, int j) {
		// TODO Auto-generated method stub
		arg.get(i).add(j);
		arg.get(j).add(i);
	}

}

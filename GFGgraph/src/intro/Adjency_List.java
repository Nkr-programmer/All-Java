package intro;

import java.util.ArrayList;

public class Adjency_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<ArrayList<Integer>>  ar=new ArrayList<ArrayList<Integer>>(5);

for(int i=0;i<5;i++)
{
ar.add(new ArrayList<Integer>());	
}

addEdge(ar, 0, 1);
addEdge(ar, 0, 4);
addEdge(ar, 1, 2);
addEdge(ar, 1, 3);
addEdge(ar, 1, 4);
addEdge(ar, 2, 3);
addEdge(ar, 3, 4);
 
printGraph(ar);
	}

	private static void printGraph(ArrayList<ArrayList<Integer>> ar) {
		// TODO Auto-generated method stub
		for(int i=0;i<ar.size();i++)
		{
			System.out.print("HEAD "+i+" ");
			for(int j=0;j<ar.get(i).size();j++)
			{
				System.out.print(" "+ar.get(i).get(j));
			}	
			System.out.println();
		}
	}

	private static void addEdge(ArrayList<ArrayList<Integer>> ar, int i, int j) {
			// undirected
ar.get(i).add(j);
ar.get(j).add(i);
	}

}

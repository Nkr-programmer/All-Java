package intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Path_In_A_Rectangle_With_Circles {
	private static int v;
	private static ArrayList<Integer> a[];

	public Path_In_A_Rectangle_With_Circles(int i) {
		v = i;
		a = new ArrayList[i];
		for (int j = 0; j < i; ++j) {
			a[j] = new ArrayList<Integer>();
		}
	}
	void addEdge(int v, int w) {
		a[v].add(w);
		}

	public static void main(String[] args) {
		
		int m=5,n=5,k=2,r=1;
		int a[]= {1,3};
		int b[]= {3,3};
		int c[][]=new int[m][n];
		int q=a[0]-1,w=a[1]-1;
		for(int i=0;i<k;i++)
		{
		 if(i==0) {q=a[0]-1;w=a[1]-1;}
		 else
			 if(i==1) {q=b[0]-1;w=b[1]-1;}
		 
    //if((q-r)>=0&&(w+r)<=m-1) {c[q-r][w+r]=1;}
	if((q)>=0&&(w+r)<=m-1) {c[q][w+r]=1;}
	//if((q+r)<=m-1&&(w+r)<=m-1) {c[q+r][w+r]=1;}
	if((q-r)>=0&&(w)<=m-1) {c[q-r][w]=1;}
	if((q)>=0&&(w)<=m-1) {c[q][w]=1;}
	if((q+r)<=m-1&&(w)<=m-1) {c[q+r][w]=1;}
	//if((q-r)>=0&&(w-r)>=0) {c[q-r][w-r]=1;}
	if((q)>=0&&(w-r)>=0) {c[q][w-r]=1;}
	//if((q+r)<=m-1&&(w-r)>=0) {c[q+r][w-r]=1;}
		}
		
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		BFS(c);
		
		
		System.out.println("following the height of the tree");
		 int parent[] = { -1, 0, 0, 0, 3, 1, 1, 2 };
	System.out.println(FindHeight(parent));
	
	
	
	System.out.println("following the dfs space efficient ");
	 int v = 5;
     LinkedList<Integer> list[] = new LinkedList[v+1];     
       
     for (int i = 0; i < list.length; i ++){
         list[i] = new LinkedList<Integer>();
     }
       
   
     list[1].add(2);
     list[2].add(1);
    
     list[1].add(3);
     list[3].add(1);
    
     list[2].add(4);
     list[4].add(2);
    
     list[3].add(5);
     list[5].add(3);
    
     dfs(list, 1, -1000);
       
       
	}

	
	private static void BFS(int[][] c) {
		Queue<Integer> a = new LinkedList<Integer>();
		Queue<Integer> b = new LinkedList<Integer>();
		
		if(c[0][0]!=1) {
		a.add(0);
		b.add(0);}
int d=0,e=0;
		while (!b.isEmpty()&&!a.isEmpty()) {
			d = a.poll();
			e = b.poll();
//System.out.println(d+" "+e);			

		//	for (int j = 0; j < a[c].size(); j++) {
//				int n = a[c].get(j);
//				if (!x[n]) {
//					x[n] = true;
//					b.add(n);
//				}
//			}
//  DFS TO FIND PATH ALGO THAT I DONT KNOW
			//solved in Moves_needed_to_move_in_matrix_between_src_and_des by bfs
		}
	

	
	}
	private static int FindHeight(int[] parent) {
		int h=-5;
		parent[0]=0;
		for(int i=1;i<parent.length;i++)
		{
			parent[i]=parent[parent[i]]+1;
		if(parent[i]>h) {h=parent[i];}
		}
		
		
		return h;
	}
	
	   public static void dfs(LinkedList<Integer> list[],
               int node, int arrival)
{
// Printing traversed node
System.out.println(node);

// Traversing adjacent edges
for (int i = 0; i < list[node].size(); i++) {

// Not traversing the parent node
if (list[node].get(i) != arrival)
  dfs(list, list[node].get(i), node);
}
}

}
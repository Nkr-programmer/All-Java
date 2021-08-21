package intro;

import java.util.Vector;

public class Maximum_num_of_edges_to_be_added_to_tree_to_remain_bipartite {

    static 	char result[]=new char[1000];
	static char str[]=new char[1000];
	static boolean ad[][]= new boolean[10][10];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int n = 5;
		    Vector<Integer>[] adj = new Vector[n + 1];
		    for (int i = 0; i < n + 1; i++) 
		        adj[i] = new Vector<Integer>();
		      
		    adj[1].add(2);
		    adj[1].add(3);
		    adj[2].add(4);
		    adj[3].add(5);
		    System.out.println("Max Edges can fit in bipiartite");
		    System.out.println(findMaxEdges(adj, n));
		    System.out.println("Peterson graph given walk possible or not");
		    
        		    ad[0][1] = ad[1][2] = ad[2][3] = ad[3][4] =
		            ad[4][0] = ad[0][5] = ad[1][6] = ad[2][7] =
		            ad[3][8] = ad[4][9] = ad[5][7] = ad[7][9] =
		            ad[9][6] = ad[6][8] = ad[8][5] = true;
		str= "AEE".toCharArray();
        	if(peterson(str,str[0]-'A')||peterson(str,str[0]-'A'+5))
        	{
        		System.out.println(result);
        	}
        	else {
        		System.out.println(-1);
        	}
        		    
	}



	private static int findMaxEdges(Vector<Integer>[] adj, int n) {
		// TODO Auto-generated method stub
		dfs(adj,1,0,false);
		
		
		return red*blue-(n-1);
	}
	static int red=0,blue=0;
	private static void dfs(Vector<Integer>[] adj, int i, int j, boolean b) {
		// TODO Auto-generated method stub
		if(b==false)red++;
		else  blue++;
		
		for(int k=0;k<adj[i].size();k++)
		{
			if(adj[i].get(k)!=j)
			dfs(adj,adj[i].get(k),i,!b);
		}
		
	}

	private static boolean peterson(char[] str, int i) {
		// TODO Auto-generated method stub
	
		result[0]=(char)(i+'0');
		for(int j=1;j<str.length;j++)
		{
			if(ad[i][str[j]-'A']||ad[str[j]-'A'][i]) {i=(char)(str[j]-'A');}
			else if(ad[i][str[j]-'A'+5]||ad[str[j]-'A'+5][i]) {i=(char)(str[j]-'A');}
			else {
				return false;
			}
		result[j]=(char)(i+'0');	
		}
		
		return true;
	}
}

package graph;

import java.io.*;
import java.util.*;
public class t256to299 {

	class Node {
	    public int val;
	    public List<Node> neighbors;
	    public Node() {
	        val = 0;
	        neighbors = new ArrayList<Node>();
	    }
	    public Node(int _val) {
	        val = _val;
	        neighbors = new ArrayList<Node>();
	    }
	    public Node(int _val, ArrayList<Node> _neighbors) {
	        val = _val;
	        neighbors = _neighbors;
	    }
	}
public static void main(String args[]) throws NumberFormatException, IOException   
{    
//	xyz();
//Graph<Integer> graph=new Graph<Integer>();   
//graph.addNewEdge(0, 1,2, true);   
//graph.addNewEdge(0, 4,3, true);   
//graph.addNewEdge(1, 2,4, true);   
////graph.addNewEdge(1, 3,5, false);   
////graph.addNewEdge(1, 4,6, true);   
//graph.addNewEdge(2, 3,7, true);   
////graph.addNewEdge(2, 4,8, true);   
////graph.addNewEdge(3, 0,9, true);   
////graph.addNewEdge(2, 0,10, true);     
//System.out.println("Adjacency List for the graph:\n"+ graph.print());    
//graph.countVertices();     
//graph.countEdges(true);    
//graph.containsEdge(3, 4);   
//graph.containsEdge(2, 4);   
//graph.containsEdge(3, 1);   
//graph.containsVertex(3);   
//graph.containsVertex(5);   
//graph.bfs_sssp(0,3);
	//reverse();
	//bob();
	journey();
}   

//1
//create a graph and print
// genric bidirectional map, weighted {in copy unweighted}
static class Graph<T> {
	static class pair<T>{
		T des;
		int dist;
		pair(T des,int dist){this.des=des;this.dist=dist;}
	}
		private Map<T, Set<pair>> map = new HashMap<>();
		public void addNewVertex(T s) {
			map.put(s, new HashSet<pair>());
		}
		public void addNewEdge(T source, T destination,int dist, boolean bidirectional) {	      
			if (!map.containsKey(source))
				addNewVertex(source);
			if (!map.containsKey(destination))
				addNewVertex(destination);
			map.get(source).add(new pair(destination,dist));
			if (bidirectional == true) {
				map.get(destination).add(new pair(source,dist));
			}
		}

		public void countVertices() {
			System.out.println("Total number of vertices: " + map.keySet().size());
		}
		public void countEdges(boolean bidirection) {
			int count = 0;
			for (T v : map.keySet()) {
				count = count + map.get(v).size();
			}
			if (bidirection == true) {
				count = count / 2;
			}
			System.out.println("Total number of edges: " + count);
		}

		public void containsVertex(T s) {
			if (map.containsKey(s)) {
				System.out.println("The graph contains " + s + " as a vertex.");
			} else {
				System.out.println("The graph does not contain " + s + " as a vertex.");
			}
		}
		public void containsEdge(T s, T d) {
			if (map.containsKey(s)) {
				for(pair x:map.get(s))
				{
					if(x.des==d) {System.out.println("The graph has an edge between " + s + " and " + d + ".");return;}
				}
				System.out.println("There is no edge between " + s + " and " + d + ".");
			}
		}
		
		public String print() {
			StringBuilder builder = new StringBuilder();
			for (T v : map.keySet()) {
				builder.append(v.toString() + ": ");
				for (pair w : map.get(v)) {
					builder.append(w.des.toString() + "->"+w.dist+ " ");
				}
				builder.append("\n");
			}
			return (builder.toString());
		}
		public void bfs_sssp(T src,T temp)
		{
			HashMap<T,Integer>dis=new HashMap<T,Integer>();
			HashMap<T,T>pare=new HashMap<T,T>();
			for(T i:map.keySet())
			{dis.put(i,Integer.MAX_VALUE);}
			Queue<T>q=new LinkedList<T>();
			q.add(src);
			dis.put(src, 0);
			pare.put(src, src);
			while(!q.isEmpty()) 
			{
				T f=q.remove();
		for(pair neighbour:map.get(f))
		{if(dis.get(neighbour.des)==Integer.MAX_VALUE) 
		   {q.add((T) neighbour.des);
			dis.put((T) neighbour.des,dis.get(f)+1);pare.put((T) neighbour.des, f);
		   }
		}
	}
	for(T x:map.keySet())
	{System.out.print(src+"=>"+x+"=>"+dis.get(x)+" ");}
	System.out.println();
			
			while(pare.get(temp)!=temp) {System.out.print(temp+" ");temp=pare.get(temp);}System.out.println(src);
		}
	}
//2
//Dfs
public ArrayList<Integer> dfsOfGraph(int v, ArrayList<ArrayList<Integer>> adj) {
    ArrayList<Integer>a=new ArrayList<Integer>();
    boolean vis[]=new boolean[v];
    Dfs(vis,0,a,adj);
return a;
   }
   public void Dfs(boolean[] vis,int v,ArrayList<Integer>a,ArrayList<ArrayList<Integer>>adj)
   {
       vis[v]=true;
       a.add(v);
       for(int i=0;i<adj.get(v).size();i++)
       {
           int x=adj.get(v).get(i);
           if(!vis[x]){Dfs(vis,x,a,adj);}
       }
   }
//3
   //BFS
   public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
       boolean vis[]= new boolean[V];
       ArrayList<Integer>a=new ArrayList<Integer>();
       Queue<Integer>q= new LinkedList<Integer>();
       q.add(0); a.add(0);vis[0]=true;
       while(!q.isEmpty())
       {
           int z=q.remove();
           for(int i=0;i<adj.get(z).size();i++)
           {
           int x=adj.get(z).get(i);
           if(!vis[x]){q.add(x);a.add(x);vis[x]=true;}
           }
       }
return a;    }
   //4
   //Detect cycle in directed graph
   //by dfs //O(v+e) O(v)
   public boolean isCyclic(int v, ArrayList<ArrayList<Integer>> adj) {
	    boolean vis[]=new boolean[v];
	    boolean rec[]=new boolean[v];
	for(int i=0;i<v;i++)
	    if(Dfs(vis,i,rec,adj))return true;
	return false;
	   }
	   public boolean Dfs(boolean[] vis,int v,boolean []rec,ArrayList<ArrayList<Integer>>adj)
	   {
	       if(rec[v])return true;
	       if(vis[v])return false;
	       vis[v]=true;rec[v]=true;
	       for(int i=0;i<adj.get(v).size();i++)
	       {
	           int x=adj.get(v).get(i);
	           if(Dfs(vis,x,rec,adj))return true;
	        }
	        rec[v]=false;
	     return false;
	   }
	   //bfs //O(v+e) O(v)
	   public boolean bfs(int v,ArrayList<ArrayList<Integer>>adj)
	   {
		   int inor[]= new int[v];
		   Arrays.fill(inor,0);
		   for(int i=0;i<v;i++)
		   {  for(int g:adj.get(i))
		          {inor[g]++;}	   
		   }
		   int count=0;
		   Queue<Integer>q= new LinkedList<Integer>();
		   for(int j=0;j<v;j++)
		   {if(inor[j]==0) {q.add(j);}}
		   
		   while(!q.isEmpty())
		   {
			   int f=q.remove();
			   for(int x:adj.get(f))
			   {if(--inor[x]==0) {q.add(x);}}
		   count++;
		   }
		   if(count==v)return false;
		   return true;
	   }
		   
//5
	   //detect cycle in undirected graph
	   public boolean isCycle(int v, ArrayList<ArrayList<Integer>> adj) {
		    boolean vis[]=new boolean[v];
			for(int i=0;i<v;i++)
			 if(!vis[i]){   if(Dfs(vis,i,-1,adj))return true;}
			return false;
			   }
			   public boolean Dfs(boolean[] vis,int v,int p,ArrayList<ArrayList<Integer>>adj)
			   {
			       vis[v]=true;
			       for(int i=0;i<adj.get(v).size();i++)
			       {
			           int x=adj.get(v).get(i);
			           if(!vis[x]){if(Dfs(vis,x,v,adj))return true;}
			        else if(x!=p)return true;
			       }
			     return false;
			   }
//bfs

			   static boolean isCyclicConntected(ArrayList<Integer> adj[], int s,int V, boolean visited[])
			   {
			     int parent[] = new int[V];
			     Arrays.fill(parent, -1);
			     Queue<Integer> q = new LinkedList<>();
			     visited[s] = true;
			     q.add(s);
			     while (!q.isEmpty())
			     {
			       int u = q.poll();
			       for (int i = 0; i < adj[u].size(); i++)
			       {
			         int v = adj[u].get(i);
			         if (!visited[v])
			         {visited[v] = true;q.add(v);parent[v] = u;}
			         else if (parent[u] != v)return true;
			       }
			     }
			     return false;
			   }
			   static boolean isCyclicDisconntected(ArrayList<Integer> adj[], int V)
			   { boolean visited[] = new boolean[V];
			     Arrays.fill(visited,false);
			     for (int i = 0; i < V; i++)
			       if (!visited[i] &&isCyclicConntected(adj, i, V, visited))return true;
			     return false;
			   }
//6
			   //Steps by Knight
			   //BFS
			   public int minStepToReachTarget(int Ki[], int TPi[], int N)
			    {
   		    	int K[]=new int[] {Ki[1],Ki[0]};
   		    	int TP[]=new int[] {TPi[1],TPi[0]};
			        K[0]=N-K[0]+1;TP[0]=N-TP[0]+1;
				int[][]dis=new int[N+1][N+1];
						
						for(int[] i:dis)
						{Arrays.fill(i, Integer.MAX_VALUE);i[0]=-1;}
						Arrays.fill(dis[0],-1);
						Queue<int[]>q=new LinkedList<int[]>();
						q.add(K);
						dis[K[0]] [K[1]]=0;
						while(!q.isEmpty()) 
						{
							int[] f=q.remove();
							int x=f[0],y=f[1];
				if(dis[TP[0]][TP[1]]!=Integer.MAX_VALUE)return dis[TP[0]][TP[1]];
		if(x-1>=1&&x-1<=N&&y+2>=1&&y+2<=N&&dis[x-1][y+2]==Integer.MAX_VALUE)
		{int xx[]=new int[] {x-1,y+2};q.add(xx);dis[x-1][y+2]=dis[x][y]+1;}
		
		if(x+1>=1&&x+1<=N&&y+2>=1&&y+2<=N&&dis[x+1][y+2]==Integer.MAX_VALUE)
		{int xx[]=new int[] {x+1,y+2};q.add(xx);dis[x+1][y+2]=dis[x][y]+1;}					
		
		if(x+2>=1&&x+2<=N&&y+1>=1&&y+1<=N&&dis[x+2][y+1]==Integer.MAX_VALUE)
		{int xx[]=new int[] {x+2,y+1};q.add(xx);dis[x+2][y+1]=dis[x][y]+1;}					
	
		if(x+2>=1&&x+2<=N&&y-1>=1&&y-1<=N&&dis[x+2][y-1]==Integer.MAX_VALUE)
		{int xx[]=new int[] {x+2,y-1};q.add(xx);dis[x+2][y-1]=dis[x][y]+1;}					
		
		if(x+1>=1&&x+1<=N&&y-2>=1&&y-2<=N&&dis[x+1][y-2]==Integer.MAX_VALUE)
		{int xx[]=new int[] {x+1,y-2};q.add(xx);dis[x+1][y-2]=dis[x][y]+1;}					
	
		if(x-1>=1&&x-1<=N&&y-2>=1&&y-2<=N&&dis[x-1][y-2]==Integer.MAX_VALUE)
		{int xx[]=new int[] {x-1,y-2};q.add(xx);dis[x-1][y-2]=dis[x][y]+1;}					
		
		if(x-2>=1&&x-2<=N&&y-1>=1&&y-1<=N&&dis[x-2][y-1]==Integer.MAX_VALUE)
		{int xx[]=new int[] {x-2,y-1};q.add(xx);dis[x-2][y-1]=dis[x][y]+1;}					
		
		if(x-2>=1&&x-2<=N&&y+1>=1&&y+1<=N&&dis[x-2][y+1]==Integer.MAX_VALUE)
		{int xx[]=new int[] {x-2,y+1};q.add(xx);dis[x-2][y+1]=dis[x][y]+1;}					
		
				}
				return dis[TP[0]][TP[1]];
						
					}
			   //7
			   //Rat Maze
			   //O(3^N^2) O(N2)
			   static ArrayList<String>a=new ArrayList<String>();
			   static String ans="";
			     public static ArrayList<String> findPath(int[][] m, int n) {
			   a.clear();
			    boolean vis[][]=new boolean[n][n];
			     Dfs(0,0,m,n,vis);
			 return a;
			    }
			    public static  void Dfs(int i,int j,int m[][],int n,boolean[][] vis)
			    {
			        if(i==-1||i==n||j==-1||j==n||vis[i][j]||m[i][j]==0)return;
			      
			        if(i==n-1&&j==n-1){a.add(ans);return;}
			        vis[i][j]=true;
			        if(i+1>=0&&i+1<n&&j>=0&&j<n&&!vis[i+1][j]&&m[i+1][j]==1)
			        {ans+='D';Dfs(i+1,j,m,n,vis);ans=ans.substring(0,ans.length()-1);}
			         
			         if(i>=0&&i<n&&j-1>=0&&j-1<n&&!vis[i][j-1]&&m[i][j-1]==1)
			        {ans+='L';Dfs(i,j-1,m,n,vis);ans=ans.substring(0,ans.length()-1);}
			         
			         if(i>=0&&i<n&&j+1>=0&&j+1<n&&!vis[i][j+1]&&m[i][j+1]==1)
			        {ans+='R';Dfs(i,j+1,m,n,vis);ans=ans.substring(0,ans.length()-1);}
			         
			         if(i-1>=0&&i-1<n&&j>=0&&j<n&&!vis[i-1][j]&&m[i-1][j]==1)
			        {ans+='U';Dfs(i-1,j,m,n,vis);ans=ans.substring(0,ans.length()-1);}
			       
			    vis[i][j]=false;
			    }
//8
			    //Flood fill
			    //O(m*N) bfs
			    public int[][] floodFill(int[][] image, int sr, int sc, int c) {
			        
			        int o=image[sr][sc],N=image.length,M=image[0].length;
			           if(o==c)return image;
			           Queue<int[]>q= new LinkedList<int[]>();
			           q.add(new int[]{sr,sc});
			           image[sr][sc]=c;
			           while(!q.isEmpty())
			           {
			               int[]g=q.remove();int x=g[0],y=g[1];
			              // System.out.print(g[0]+" "+g[1]);
			               if(x-1>=0&&x-1<N&&y>=0&&y<M&&image[x-1][y]==o)
			   		{int xx[]=new int[] {x-1,y};q.add(xx);image[x-1][y]=c;}
			               if(x+1>=0&&x+1<N&&y>=0&&y<M&&image[x+1][y]==o)
			   		{int xx[]=new int[] {x+1,y};q.add(xx);image[x+1][y]=c;}
			               if(x>=0&&x<N&&y-1>=0&&y-1<M&&image[x][y-1]==o)
			   		{int xx[]=new int[] {x,y-1};q.add(xx);image[x][y-1]=c;}
			               if(x>=0&&x<N&&y+1>=0&&y+1<M&&image[x][y+1]==o)
			   		{int xx[]=new int[] {x,y+1};q.add(xx);image[x][y+1]=c;}
			           }
			           return image;
			       }
			    // O(m*N)dfs
			    public int[][] floodFill2(int[][] image, int sr, int sc, int newColor)
			    {
		                    if(image[sr][sc]!=newColor)
				        dfs(image,sr,sc,image[sr][sc],newColor);
				   

			        return image;
			    }
				public static void dfs(int[][] g, int i, int j, int parent,int newColor)
				{
				    if(i<0 || j<0 || i>=g.length|| j>=g[i].length || g[i][j]!=parent)
				    return;
				    g[i][j]=newColor;
				    dfs(g,i+1,j,parent,newColor);
				    dfs(g,i-1,j,parent,newColor);
				    dfs(g,i,j+1,parent,newColor);
				    dfs(g,i,j-1,parent,newColor);
				}
				//9
				//Clone a graph
				//BFS O(V+E)  O(V+E)
				 public Node cloneGraph(Node node) {
				       if(node==null)return null;
								      HashMap<Node,Node>h= new HashMap<Node,Node>();
								       Queue<Node>q= new LinkedList<Node>();
				        Node n=new Node(node.val,new ArrayList<Node>());
								       q.add(node);h.put(node,n);
								       while(!q.isEmpty())
								       {
								           Node z=q.remove(),zc=h.get(z);
								           for(int i=0;i<z.neighbors.size();i++)
								           {
								           Node x=z.neighbors.get(i);
								           if(!h.containsKey(x))
				        {Node xc=new Node(x.val,new ArrayList<>());q.add(x);h.put(x,xc);}
						zc.neighbors.add(h.get(x));		           
				                           }
								       }
								return n;    }
				 //10
				 //Making Weird Connections
				// O(V+E) O(V+E)
				 //DFS
				 public int makeConnected(int n, int[][] c) {
				        if((c.length+1)<n)return -1;
				        int k=0;
				        ArrayList<ArrayList<Integer>>adj=new ArrayList();
				        for(int i=0;i<n;i++){adj.add(new ArrayList());}
				        for(int i=0;i<c.length;i++){adj.get(c[i][0]).add(c[i][1]);
				                                    adj.get(c[i][1]).add(c[i][0]);}
				       boolean vis[]= new boolean[n];
				        for(int i=0;i<n;i++)
				        {if(!vis[i]){k++;Dfs(vis,i,adj);}}    
				        return k-1;
				    }
				      public void Dfs(boolean[] vis,int v,ArrayList<ArrayList<Integer>>adj)
				   {
				       vis[v]=true;
				       for(int i=0;i<adj.get(v).size();i++)
				       {
				           int x=adj.get(v).get(i);
				           if(!vis[x]){Dfs(vis,x,adj);}
				       }
				   }
				      //11
//word ladder
				      //bfs
				      public int ladderLength(String b, String e, List<String> wi) {
				          Set<String>w=new HashSet<String>();w.addAll(wi);
				          if(b.equals(e)||!w.contains(e))return 0;
				          String root=b;
				          Queue<String>q=new LinkedList<String>();
				          q.add(root);int ans=0;
				          while(!q.isEmpty()){ans++;int m=q.size();
				                             for(int i=0;i<m;i++)
				                             {char word[]=q.remove().toCharArray();
				                              for(int j=0;j<b.length();j++)
				                              {char c=word[j];
				                              
				                               for(char k='a';k<='z';k++)
				                               {word[j]=k;
				                               if(String.valueOf(word).equals(e))return ans+1;
				                               if(!w.contains(String.valueOf(word)))continue;
				                                w.remove(String.valueOf(word));
				                                q.add(String.valueOf(word));
				                               }
				                               word[j]=c;
				                              }
				                             }
				                             }return 0;
				      }
//bi directional bfs O(N2)
				      public class nodes{
				          String word;int len;
				                       public nodes (String word,int len)
				                  { this.word=word;
				                  this.len=len;
				                       }
				               }
				      public boolean isAdj(String a,String b){
				          int count=0;
				          for(int i=0;i<a.length();i++)
				          {if(a.charAt(i)!=b.charAt(i))count++;}
				          if(count==1)return true;
				          return false;
				      }
				      public int ladderLength2(String b, String e, List<String> w) {
				          // Set<String>w=new HashSet<String>();w.addAll(wi);
				          // System.out.print(w.size());
				          if(b.equals(e)||!w.contains(e))return 0;
				          Queue<nodes>q1=new LinkedList<nodes>();
				          Queue<nodes>q2=new LinkedList<nodes>();
				          HashMap<String,Integer>vis1=new HashMap<String,Integer>();
				          HashMap<String,Integer>vis2=new HashMap<String,Integer>();
				  nodes root=new nodes(b,1);nodes root2=new nodes(e,1);
				          vis1.put(b,1);q1.add(root);        vis2.put(e,1);q2.add(root2);
				          while(!q1.isEmpty()&&!q2.isEmpty()){
				   nodes c1=q1.remove();nodes c2=q2.remove();
				              for(String c:w)
				                             {
				                                 if(isAdj(c1.word,c)&&!vis1.containsKey(c))
				                                 {
				                                     nodes temp=new nodes(c,c1.len+1);
				                                     q1.add(temp);vis1.put(c,c1.len+1);
				                                     if(temp.word.equals(e))return temp.len;
				                                     if(vis2.containsKey(temp.word))
				                                         return temp.len+vis2.get(temp.word)-1;
				                                 }                           
				                             }
				                      for(String c:w)
				                             {
				                                 if(isAdj(c2.word,c)&&!vis2.containsKey(c))
				                                 {
				                                     nodes temp=new nodes(c,c2.len+1);
				                                     q2.add(temp);vis2.put(c,c2.len+1);
				                                     if(temp.word.equals(b))return temp.len;
				                                     if(vis1.containsKey(temp.word))
				                                         return temp.len+vis1.get(temp.word)-1;
				                                 }                           
				                             }
				                             }return 0;
				      }
				      //12
				      //dijkastra arrayList
				      //O(Elogv) 
				      public static void xyz()
				      { int V = 5,s = 0;
				       List<List<Nod> > adj= new ArrayList<List<Nod> >();
				       for (int i = 0; i < V; i++) {adj.add(new ArrayList<Nod>());}
				          adj.get(0).add(new Nod(1, 9));
				          adj.get(0).add(new Nod(2, 6));
				          adj.get(0).add(new Nod(3, 5));
				          adj.get(0).add(new Nod(4, 3));
				          adj.get(2).add(new Nod(1, 2));
				          adj.get(2).add(new Nod(3, 4));
				          dijkstra(adj, s);
				      }
				private static void dijkstra(List<List<Nod>> adj, int s) {
						int dis[]=new int[adj.size()];
						int parent[]=new int[adj.size()];//extra
						Arrays.fill(dis, Integer.MAX_VALUE);
						HashSet<Integer>h=new HashSet<Integer>();
						PriorityQueue<Nod>pq=new PriorityQueue<Nod>(adj.size(),new Nod());
						pq.add(new Nod(s,0));dis[s]=0;parent[s]=s;
						while(h.size()!=adj.size()) 
						{
							if(pq.isEmpty())break;
							Nod u=pq.remove();
							if(h.contains(u.node))continue;
							h.add(u.node);
							for(int i=0;i<adj.get(u.node).size();i++)
							{
								Nod v=adj.get(u.node).get(i);
							
								if(!h.contains(v.node))
					{
						if(dis[v.node]>dis[u.node]+v.cost)
						{dis[v.node]=dis[u.node]+v.cost;	
						parent[v.node]=u.node;}// parent
					pq.add(new Nod(v.node,dis[v.node]));
					}
						
							}
						}
						int dest=3;
						while(parent[dest]!=dest)
						{System.out.print(dest+" ");dest=parent[dest];}System.out.print(s);//to print path
						for(int g:dis) {System.out.println(g);}
					}
			static	class   Nod implements Comparator<Nod>{
					   int node,cost;
					   Nod(){};
					   Nod(int x,int y){this.node=x;this.cost=y;}
					   @Override
					   public int compare(Nod n1,Nod n2)
					   {
						   if(n1.cost<n2.cost)return -1;
						   if(n1.cost>n2.cost)return 1;
						   return 0;
					   }
				   }	    
// matrix O(V2)
		 static final int V = 9;
		    int minDistance(int dist[], Boolean sptSet[])
		    {
		        int min = Integer.MAX_VALUE, min_index = -1;
		        for (int v = 0; v < V; v++)if (sptSet[v] == false && dist[v] <= min) {min = dist[v];min_index = v;}
		    return min_index;
		    }
		   void dijkstra(int graph[][], int src)
		    {
		        int dist[] = new int[V];
		        Boolean sptSet[] = new Boolean[V];
		        for (int i = 0; i < V; i++) {
		            dist[i] = Integer.MAX_VALUE;
		            sptSet[i] = false;
		        }
		        dist[src] = 0;
		        for (int count = 0; count < V - 1; count++) {
		            int u = minDistance(dist, sptSet);
		            sptSet[u] = true;
		            for (int v = 0; v < V; v++)
		       if (!sptSet[v] && graph[u][v] != 0 && dist[u] != Integer.MAX_VALUE && dist[u] + graph[u][v] < dist[v])
		                    dist[v] = dist[u] + graph[u][v];
		        }
				for(int g:dist) {System.out.println(g);}
}

			//13
				//Topological sort
				//BFS
				//O(V+E)
				public int[] topoSort(int v,ArrayList<ArrayList<Integer>>adj)
				   {
					   int inor[]= new int[v];
					   int[]ans= new int[v];
					   Arrays.fill(inor,0);
					   for(int i=0;i<v;i++)
					   {  for(int g:adj.get(i))
					          {inor[g]++;}	   
					   }
					   int count=0;int key=0;
					   Queue<Integer>q= new LinkedList<Integer>();
					   for(int j=0;j<v;j++)
					   {if(inor[j]==0) {q.add(j);}}
					   
					   while(!q.isEmpty())
					   {
						   int f=q.remove();
						   ans[key++]=f;
						   for(int x:adj.get(f))
						   {if(--inor[x]==0) {q.add(x);}}
					   count++;
					   }
					   return ans;
				   }
				//DFS
				//O(V+E)
				  public static int[] topoSort2(int v,ArrayList<ArrayList<Integer>>adj)
				   {
					 Stack<Integer>s= new Stack<Integer>();
   boolean vis[]=new boolean[v];
   for(int i=0;i<v;i++)
   {if(!vis[i])
   Dfs(vis,0,s,adj);
   }
   int arr[]= new int[v];int key=0;
   while(!s.isEmpty()){arr[key++]=s.pop();}
return arr;
  }
  public static  void Dfs(boolean[] vis,int v,Stack<Integer>a,ArrayList<ArrayList<Integer>>adj)
  {
      vis[v]=true;
      for(int i=0;i<adj.get(v).size();i++)
      {
          int x=adj.get(v).get(i);
          if(!vis[x]){Dfs(vis,x,a,adj);}
      }
      a.push(v);
  }
//14
  //Min time taken by each job to be completed given by a dag
  //O(V+E)
  //Just have idea of job aray else is same
  public static int[] topoSort1(int v,ArrayList<ArrayList<Integer>>adj)
	{	   int inor[]= new int[v];
	   int[]ans= new int[v];
	   Arrays.fill(inor,0);
	   for(int i=0;i<v;i++)
	   {  for(int g:adj.get(i))
	          {inor[g]++;}	   
	   }
	   int count=0;int key=0;
	   Queue<Integer>q= new LinkedList<Integer>();
	   int job[]= new int[v];
	   for(int j=0;j<v;j++)
	   {if(inor[j]==0) {job[j]=1;q.add(j);}}
	   
	   while(!q.isEmpty())
	   {
		   int f=q.remove();
	
		   ans[key++]=f;
		   for(int x:adj.get(f))
		   {if(--inor[x]==0) {job[x]=1+job[f];q.add(x);}}
	   count++;
	   }
	 for(int vi:job){	System.out.print(vi+" ");}
	   return ans;
}	   
  //15
  // Course Schedule or Find whether it is possible to finish all tasks or not from given dependencies
  public boolean canFinish(int n, int[][] p) {
      ArrayList<ArrayList<Integer>>adj=new ArrayList();
      for(int i=0;i<n;i++)
      {adj.add(new ArrayList<Integer>());}
      for(int i=0;i<p.length;i++)
      {adj.get(p[i][1]).add(p[i][0]);}
  return !isCyclic1(n,adj);
  }
   public boolean isCyclic1(int v, ArrayList<ArrayList<Integer>> adj) {
	    boolean vis[]=new boolean[v];
	    boolean rec[]=new boolean[v];
	for(int i=0;i<v;i++)
	    if(Dfs1(vis,i,rec,adj))return true;
	return false;
	   }
	   public boolean Dfs1(boolean[] vis,int v,boolean []rec,ArrayList<ArrayList<Integer>>adj)
	   {
	       if(rec[v])return true;
	       if(vis[v])return false;
	       vis[v]=true;rec[v]=true;
	       for(int i=0;i<adj.get(v).size();i++)
	       {
	           int x=adj.get(v).get(i);
	           if(Dfs1(vis,x,rec,adj))return true;
	        }
	        rec[v]=false;
	     return false;
	   }
//16
	   //NO of islands
	   //BFS O(N*M)
	    public int numIslands(char[][] grid) {
	        int in=0;
	        for(int i=0;i<grid.length;i++)
	        {
	            for(int j=0;j<grid[0].length;j++)
	            {
	                if(grid[i][j]=='1'){in++;
	                minStepToReachTarget(new int[]{i,j},grid);}
	            }
	        }
	         return in;
	     }
	     			   public void minStepToReachTarget(int K[],char grid[][])
	 			    {int N=grid.length,M=grid[0].length;
	 			  
	 						Queue<int[]>q=new LinkedList<int[]>();
	 						q.add(K);
	 				if(grid[K[0]] [K[1]]=='1'){grid[K[0]] [K[1]]='2';}
	 						while(!q.isEmpty()) 
	 						{
	 							int[] f=q.remove();
	 							int x=f[0],y=f[1];
	 		if(x-1>=0&&x-1<N&&y>=0&&y<M&&grid[x-1][y]=='1')
	 		{int xx[]=new int[] {x-1,y};q.add(xx);grid[x-1][y]='2';}
	 		
	 		if(x+1>=0&&x+1<N&&y>=0&&y<M&&grid[x+1][y]=='1')
	 		{int xx[]=new int[] {x+1,y};q.add(xx);grid[x+1][y]='2';}
	 		
	 		if(x>=0&&x<N&&y-1>=0&&y-1<M&&grid[x][y-1]=='1')
	 		{int xx[]=new int[] {x,y-1};q.add(xx);grid[x][y-1]='2';}
	 		
	 		
	 		if(x>=0&&x<N&&y+1>=0&&y+1<M&&grid[x][y+1]=='1')
	 		{int xx[]=new int[] {x,y+1};q.add(xx);grid[x][y+1]='2';}
	 		
	 		if(x-1>=0&&x-1<N&&y-1>=0&&y-1<M&&grid[x-1][y-1]=='1')
	 		{int xx[]=new int[] {x-1,y-1};q.add(xx);grid[x-1][y-1]='2';}
	 		
	 		if(x-1>=0&&x-1<N&&y+1>=0&&y+1<M&&grid[x-1][y+1]=='1')
	 		{int xx[]=new int[] {x-1,y+1};q.add(xx);grid[x-1][y+1]='2';}
	 		
	 		if(x+1>=0&&x+1<N&&y-1>=0&&y-1<M&&grid[x+1][y-1]=='1')
	 		{int xx[]=new int[] {x+1,y-1};q.add(xx);grid[x+1][y-1]='2';}
	 		
	 		if(x+1>=0&&x+1<N&&y+1>=0&&y+1<M&&grid[x+1][y+1]=='1')
	 		{int xx[]=new int[] {x+1,y+1};q.add(xx);grid[x+1][y+1]='2';}
	 					}
	 				
	 					}
	     			   //dfs
	     			  public int numIslands2(char[][] grid) {
	     				    int count=0;
	     				    for(int i=0;i<grid.length;i++)
	     				        for(int j=0;j<grid[0].length;j++){
	     				            if(grid[i][j]=='1'){
	     				                dfsFill(grid,i,j);
	     				                count++;
	     				            }
	     				        }
	     				    return count;
	     				}
	     				private void dfsFill(char[][] grid,int i, int j){
	     				    if(i>=0 && j>=0 && i<grid.length && j<grid[0].length&&grid[i][j]=='1'){
	     				        grid[i][j]='0';
	     				        dfsFill(grid, i + 1, j);
	     				        dfsFill(grid, i - 1, j);
	     				        dfsFill(grid, i, j + 1);
	     				        dfsFill(grid, i, j - 1);
	     				    }
	     				}
	     				//17
	     				//Alien Dictionary
	     				public String findOrder(String [] dict, int n, int k)
	     			    {
	     			        ArrayList<ArrayList<Integer>>adj=new ArrayList<ArrayList<Integer>>();
	     			        for(int i=0;i<k;i++)
	     			        {adj.add(new ArrayList<Integer>());}
	     			        for(int i=0;i<n-1;i++)
	     			        {
	     			            String w1=dict[i],w2=dict[i+1];
	     			            for(int j=0;j<Math.min(w1.length(),w2.length());j++)
	     			            {if(w1.charAt(j)!=w2.charAt(j))
	     			            {    adj.get(w1.charAt(j)-'a').add(w2.charAt(j)-'a');break;}
	     			            }
	     			        }
	     			        return topoSor(k,adj);
	     			    }
	     			    public String topoSor(int v,ArrayList<ArrayList<Integer>>adj)
	     							   {
	     								   int inor[]= new int[v];
	     								   char[]ans= new char[v];
	     								   Arrays.fill(inor,0);
	     								   for(int i=0;i<v;i++)
	     								   {  for(int g:adj.get(i))
	     								          {inor[g]++;}	   
	     								   }
	     								   int count=0;int key=0;
	     								   Queue<Integer>q= new LinkedList<Integer>();
	     								   for(int j=0;j<v;j++)
	     								   {if(inor[j]==0) {q.add(j);}}
	     								   
	     								   while(!q.isEmpty())
	     								   {
	     									   int f=q.remove();
	     									   ans[key++]=(char)('a'+f);
	     									   for(int x:adj.get(f))
	     									   {if(--inor[x]==0) {q.add(x);}}
	     								   count++;
	     								   }
	     								 //  System.out.print(new String(ans));
	     								   return new String(ans);
	     							   }
	     			    //18
	     			    //Kruskal  Mst
	     			   static	class Graphs
		     			{
	     				  void KruskalMST()
	     				    {   Edge result[] = new Edge[V];
	     				        int e = 0;
	     				        int i = 0;
	     				        for (i = 0; i < V; ++i)result[i] = new Edge();
	     				        Arrays.sort(edge);
	     				        subset subsets[] = new subset[V];
	     				        for (i = 0; i < V; ++i) { 
	     				        	subsets[i] = new subset();
	     				            subsets[i].parent = i;
	     				            subsets[i].rank = 0;
	     				        }
	     				        i = 0;
	     				        while (e < V - 1)
	     				        { Edge next_edge = edge[i++];
	     				            int x = find(subsets, next_edge.src);
	     				            int y = find(subsets, next_edge.dest);
	     				            if (x != y) {
	     				                result[e++] = next_edge;
	     				                Union(subsets, x, y);
	     				            }
	     				        }
	     				        System.out.println("Following are the edges in "+ "the constructed MST");
	     				        int minimumCost = 0;
	     				        for (i = 0; i < e; ++i)
	     				        {	System.out.println(result[i].src + " -- "+ result[i].dest+ " == " + result[i].weight);
	     				            minimumCost += result[i].weight;
	     				        }
	     				        System.out.println("Minimum Cost Spanning Tree "+ minimumCost);
	     				    }
	     				 class Edge implements Comparable<Edge>
	     			    {
	     			        int src, dest, weight;
	     			       public int compareTo(Edge compareEdge)
	     			        {   return this.weight - compareEdge.weight;}
	     			    };
	     			    
	       //dsu //O(n)
	     			  
	     			    int find(int parent[], int i)
	     			    { if (parent[i] == -1)return i;
	     			        return find(parent, parent[i]);
	     			    }
	     			   void Union(int parent[], int x, int y)
	     			    {   parent[x] = y;}
	     			    int isCycle2()
	     			    {   int parent[] = new int[V];
	     			      	Arrays.fill(parent,-1);
	     			        for (int i = 0; i <E; ++i)
	     			        {
	     			            int x = find(parent, edge[i].src);
	     			            int y = find(parent, edge[i].dest);
	     			            if (x == y)return 1;
	     			 Union(parent, x, y);
	     			        }
	     			        return 0;
	     			    }
	     //ranking dsu //o(m) optimezed by path compression
	     			int V, E;
	     			    Edge[] edge;
	     			    Graphs(int nV, int nE)
	     			    {
	     			        V = nV;
	     			        E = nE;
	     			        edge = new Edge[E];
	     			        for (int i = 0; i < E; i++)
	     			        {   edge[i] = new Edge();}
	     			    }
	     			    class subset
	     			    {   int parent;
	     			        int rank;
	     			    }
	     			    int find(subset[] subsets, int i)
	     			    {if (subsets[i].parent != i)
	     			            subsets[i].parent= find(subsets, subsets[i].parent);
	     			        return subsets[i].parent;
	     			    }
	     			 void Union(subset[] subsets, int x, int y)
	     			    {int xroot = find(subsets, x),yroot = find(subsets, y);
	     			        if (subsets[xroot].rank < subsets[yroot].rank)
	     			            subsets[xroot].parent = yroot;
	     			        else if (subsets[yroot].rank < subsets[xroot].rank)
	     			            subsets[yroot].parent = xroot;
	     			        else {
	     			            subsets[xroot].parent = yroot;
	     			            subsets[yroot].rank++;
	     			        }
	     			    }
	     			  int isCycle()
	     			    {
	     			        subset[] subsets = new subset[V];
	     			        for (int v = 0; v < V; v++) {
	     			            subsets[v] = new subset();
	     			            subsets[v].parent = v;
	     			            subsets[v].rank = 0;
	     			        }
	     			        for (int e = 0; e < E; e++) {
	     			            int x = find(subsets, edge[e].src);
	     			            int y = find(subsets, edge[e].dest);
	     			            if (x == y)return 1;
	     			            Union(subsets, x, y);
	     			        }return 0;
	     			    }
	     			}
	     				//19
	     				//Prims MST
	     				//O(V2) Matrix
	     				  void primMST(int graph[][])
	     				    {
	     				        int parent[] = new int[V];
	     				        int key[] = new int[V];
	     				        Boolean mstSet[] = new Boolean[V];
	     				        for (int i = 0; i < V; i++) {
	     				            key[i] = Integer.MAX_VALUE;
	     				            mstSet[i] = false;
	     				        }
	     				 key[0] = 0;parent[0] = -1; 
	     				        for (int count = 0; count < V - 1; count++) {
	     				            int u = minKey(key, mstSet);mstSet[u] = true;
	     				            for (int v = 0; v < V; v++) {
	     				                if (graph[u][v] != 0 && mstSet[v] == false && graph[u][v] < key[v]) {
	     				                    parent[v] = u;
	     				                    key[v] = graph[u][v];
	     				                }
	     				            }
	     				        }
	     				       System.out.println("Edge \tWeight");
	     				        for (int i = 1; i < V; i++)
	     				            System.out.println(parent[i] + " - " + i + "\t" + graph[i][parent[i]]);
	     				    }
	     				   int minKey(int key[], Boolean mstSet[])
	     				    {
	     				        int min = Integer.MAX_VALUE, min_index = -1;
	     				        for (int v = 0; v < V; v++)
	     				            if (mstSet[v] == false && key[v] < min) {
	     				                min = key[v];min_index = v;
	     				            }
	     				    return min_index;
	     				    }
	     				   //O(ElogV)
	     				   static class Edge{
	     					   int src,nbr, wt;
	     					   Edge(int src,int nbr,int wt)
	     					   {this.src=src;this.nbr=nbr;this.wt=wt;}
	     				   }
	     				  static class Pairs implements Comparable<Pairs>{
	   					   int v,av,wt;
	   					   Pairs(){};
	   					   Pairs(int x,int y,int z){this.v=x;this.av=y;this.wt=wt;}
	   					   public int compareTo(Pairs n1)
	   					   {
	   						   return this.wt-n1.wt;
	   					   }
	   				   }
	     				  public static void xoz()throws Exception{
	     					  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	     					  int ve=Integer.parseInt(br.readLine());
	     					  ArrayList<Edge>[]graph=new ArrayList[ve];
	     					  for(int i=0;i<ve;i++) {graph[i]=new ArrayList<>();}
	     					  int ed=Integer.parseInt(br.readLine());
	     					  for(int i=0;i<ed;i++)
	     					  {
	     						  String[]p=br.readLine().split(" ");
	     						  int v1=Integer.parseInt(p[0]);
	     						 int v2=Integer.parseInt(p[1]);
	     						int wt=Integer.parseInt(p[2]);
	     					  graph[v1].add(new Edge(v1,v2,wt));
	     					 graph[v2].add(new Edge(v2,v1,wt));
	     					 //MAIN ONE |
	     					          //V
	     					 PriorityQueue<Pairs>pq=new PriorityQueue<>();
	     					 pq.add(new Pairs(0,-1,0));
	     					 boolean[]visi=new boolean[ve];
	     					 while(pq.size()>0)
	     					 {
	     						 Pairs r=pq.remove();
	     						 if(visi[r.v])continue;
	     						 visi[r.v]=true;
	     						 if(r.av!=-1) {System.out.println(r.av+" "+r.v+" "+r.wt);}
	     						 for(Edge e:graph[r.v])
	     						 {if(!visi[e.nbr]) {pq.add(new Pairs(e.nbr,r.v,e.wt));}	 
	     						 }
	     					 }
	     					  }
	     				  }
	     				  //20
	     				  //All disc in copy
	     				  // just this requred determinant of matrix
	     				 static void getCofactor(int mat[][], int temp[][],int p, int q, int n)
	     {	         int i = 0, j = 0;
	         for (int row = 0; row < n; row++)
	         {
	             for (int col = 0; col < n; col++)
	             {
	                 if (row != p && col != q)
	                 {
	                     temp[i][j++] = mat[row][col];
	                     if (j == n - 1)
	                     {j = 0;i++;}
	                 }
	             }
	         }
	     }
	     static int determinantOfMatrix(int mat[][], int n)
	     {
	         int D = 0; // Initialize result
	         if (n == 1) return mat[0][0];
	         int temp[][] = new int[n][n];
	         int sign = 1;
	  for (int f = 0; f < n; f++)
	         {           getCofactor(mat, temp, 0, f, n);
	             D += sign * mat[0][f]
	                  * determinantOfMatrix(temp, n - 1);
	     sign = -sign;
	         }
	         return D;
	     }
	     //21
//Bellman ford  
	    // O(vE)
	     public int isNegativeWeightCycle(int n, int[][] edges)
	     {
	     int dist[]=new int[n];Arrays.fill(dist,Integer.MAX_VALUE);
	     dist[0]=0;
	     for(int i=0;i<n-1;i++)
	     {
	         for(int j=0;j<edges.length;j++)
	         {
	             int u=edges[j][0],v=edges[j][1],w=edges[j][2];
	             if(dist[u]!=Integer.MAX_VALUE&&dist[v]>dist[u]+w){dist[v]=dist[u]+w;}
	         }
	     }
	         for(int i=0;i<n-1;i++)
	     {
	         for(int j=0;j<edges.length;j++)
	         {
	             int u=edges[j][0],v=edges[j][1],w=edges[j][2];
	             if(dist[u]!=Integer.MAX_VALUE&&dist[v]>dist[u]+w){return 1;}
	         }
	     }
	     return 0;}
//leetcode
	     public int networkDelayTime(int[][] edges, int n, int k) {
	         
	    	    int dist[]=new int[n];Arrays.fill(dist,Integer.MAX_VALUE);
	    	    dist[k-1]=0;
	    	    for(int i=0;i<n-1;i++)
	    	    {
	    	        for(int j=0;j<edges.length;j++)
	    	        {
	    	            int u=edges[j][0]-1,v=edges[j][1]-1,w=edges[j][2];
	    	               // System.out.println(dist[u]+" "+dist[v]+" "+w);
	    	            if(dist[u]!=Integer.MAX_VALUE&&dist[v]>(dist[u]+w)){dist[v]=dist[u]+w;
	    	                                                               }
	    	        }
	    	    }
	    	        
	    	        for(int j=0;j<edges.length;j++)
	    	        {
	    	            int u=edges[j][0]-1,v=edges[j][1]-1,w=edges[j][2];
	    	            if(dist[u]!=Integer.MAX_VALUE&&dist[v]>dist[u]+w){return -1;}
	    	        }
	    	        int maxx=-1;
	    	    for(int y:dist){maxx=Math.max(maxx,y);if(maxx==Integer.MAX_VALUE)return -1;}
	    	    return maxx;} 
	     //22
				//Floyd warshell
				//O(V3) O(1)
				public void shortest_distance(int[][] matrix)
			    {
			        int INF = Integer.MAX_VALUE;
					int n = matrix.length;
					
					for(int i = 0; i < n; i++){
						for(int j = 0; j < n; j++){
							if(matrix[i][j] == -1)
								matrix[i][j] = INF;
						}
					}
					
					for (int k = 0; k < n; ++k) {
					    for (int i = 0; i < n; ++i) {
					        for (int j = 0; j < n; ++j) {
					            if (matrix[i][k] < INF && matrix[k][j] < INF 
					                    && matrix[i][k] + matrix[k][j] < INF)
					                matrix[i][j] = Math.min(matrix[i][j], matrix[i][k] + matrix[k][j]); 
					        }
					    }
					}
					for(int i = 0; i < n; i++){
						for(int j = 0; j < n; j++){
							if(matrix[i][j] >= INF)
								matrix[i][j] = -1;
						}
					}
			    }
				//23
				//Travelling SalesMan problem
				//1  O(N!)  BackTracking
				public int total_cost(int[][] graph){
					
					int n=graph.length;
					if(n==1)return 0;
					boolean[] v = new boolean[n];
				v[0] = true;
				int ans = Integer.MAX_VALUE;
				ans = tsp(graph, v, 0, n, 1, 0, ans);
				return ans;
					
				}
				static int tsp(int[][] graph, boolean[] v,
				    int currPos, int n,
				    int count, int cost, int ans)
				{
				if (count == n && graph[currPos][0] > 0)
				{
				ans = Math.min(ans, cost + graph[currPos][0]);
				return ans;
				}
				for (int i = 0; i < n; i++)
				{
				if ( graph[currPos][i] > 0&&v[i] == false)
				{
				 v[i] = true;
				 ans = tsp(graph, v, i, n, count + 1,
				           cost + graph[currPos][i], ans);
				v[i] = false;
				}
				}
				return ans;
				}
//2  dp O(N2 2n)
				static int tsp(int mask,int pos,int n,int[][] cost,int[][] dp){
				    if(mask==((1<<n)-1)){
				        return cost[pos][0];
				    }
				    if(dp[pos][mask]!=-1)
				        return dp[pos][mask];
				    int max=Integer.MAX_VALUE;
				    for(int i=0;i<n;i++){
				        if((mask&(1<<i))==0){
				            int dis=tsp((mask|(1<<i)),i,n,cost,dp)+cost[pos][i];
				            max=Math.min(max,dis);
				        }
				    }
				    return dp[pos][mask]=max;



				}
				public int total_cost2(int[][] cost)
				{
				    // Code here 
				    int n=cost.length;
				    if(n==1) return 0;
				    int[][] dp=new int[n][(1<<n)];
				for(int i=0;i<n;i++){
				    for(int j=0;j<(1<<n);j++){
				        dp[i][j]=-1;
				    }
				}
				return tsp(1,0,n,cost,dp);
				}
				
				
				
				//24
				//Color grafh  O(V2 +E)
				void greedyColoring(ArrayList<ArrayList<Integer>>adj)
			    {
			        int result[] = new int[V];
			        Arrays.fill(result, -1);
			        result[0]  = 0;
			        boolean available[] = new boolean[V];
			        Arrays.fill(available, true);
			       for (int u = 1; u < V; u++)
			        {for (int i:adj.get(u))
			            {if (result[i] != -1)available[result[i]] = false;}
			            int cr;
			            for (cr = 0; cr < V; cr++){
			                if (available[cr])break;
			            }
			            result[u] = cr;
			 Arrays.fill(available, true);
			        }
			    for (int u = 0; u < V; u++)System.out.println("Vertex " + u + " --->  Color "+ result[u]);
			    }
				//25
				//Snakes And Ladder
				public int snakesAndLadders(int[][] board) {
			        int n = board.length;
			        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
			        int start = n * n;
			        for(int i = 0; i < n; i++) {
			            for(int j = 0; j < n; j++){
			                if ((n-i) % 2 == 0) {
			                   hm.put(start, board[i][j]);
			                } else {hm.put(start, board[i][n - j - 1]);}
			                start--;
			            }
			        }
			        Queue<Integer> queue = new LinkedList<Integer>();
			        HashSet<Integer> hs = new HashSet<Integer>();
			        queue.add(1);
			        hs.add(1);  // For visited  cells
			        int step = 0; 
			        while(!queue.isEmpty()){
			            int size = queue.size();
			            for(int i = 0; i < size; i++){
			                int current = queue.poll();
			                if (current == n * n)  {    // Reached the top! winner winner chicken dinner 
			                    return step;
			                }
			                for(int j = 1; j <= 6; j++){
			                    int newPoint = current + j;
			                    if (newPoint > n * n){ continue;}
			                    if(hm.get(newPoint) != -1){newPoint = hm.get(newPoint);    // Either snake or ladder (doesn't matter)
			                    }
			                    if(!hs.contains(newPoint)){queue.add(newPoint);hs.add(newPoint); }
			                }
			            }
			            step++;
			        }
			        return -1;
			    }
				//26
				//find a bridges
				//dfs O(v+e)
				int time=0;
				void bridgeUtil(int u, boolean visited[], int disc[],int low[], int parent[],ArrayList<ArrayList<Integer>>adj)
		    {   visited[u] = true;
		        disc[u] = low[u] = ++time;
		        for (int v:adj.get(u))
		        {if (!visited[v])
		            {   parent[v] = u;
		                bridgeUtil(v, visited, disc, low, parent,adj);
		                low[u]  = Math.min(low[u], low[v]);
		                if (low[v] > disc[u])
		                    System.out.println(u+" "+v);
		            }
		            else if (v != parent[u])
		                low[u]  = Math.min(low[u], disc[v]);
		        }
		    }
		    void bridge(ArrayList<ArrayList<Integer>>adj)
		    {int NIL=-1;
		        boolean visited[] = new boolean[V];
		        int disc[] = new int[V];
		        int low[] = new int[V];
		        int parent[] = new int[V];
		        Arrays.fill(parent, NIL);Arrays.fill(visited, false);
		    for (int i = 0; i < V; i++)
		            if (visited[i] == false)
		                bridgeUtil(i, visited, disc, low, parent,adj);
		    }	 
				//27
				//Strongly Connected Components (Kosaraju's Algo)
				//O(V+E)  
				  public int kosaraju(int V, ArrayList<ArrayList<Integer>> adj)
				    {
				        Stack<Integer>s= new Stack<Integer>();
				        boolean visited[]=new boolean[V];
				        Arrays.fill(visited,false);
				        for(int i=0;i<V;i++)
				        {if(!visited[i]){fill(adj,visited,s,i);}}
				            ArrayList<ArrayList<Integer>> g=new ArrayList<ArrayList<Integer>>();
				             g=getReverse(V,adj);
				    Arrays.fill(visited,false);
				    int ans=0;
				while(!s.isEmpty()){int v=s.pop();
				    if(!visited[v]){df(g,visited,v);ans++;}
				}
				     return ans;  
				    }
				    void fill(ArrayList<ArrayList<Integer>> adj,boolean[]visited,Stack<Integer>s,int v)
				    {
				        visited[v]=true;
				        for(int x:adj.get(v)){if(!visited[x]){fill(adj,visited,s,x);}}
				     s.push(v);
				    }
				    void df(ArrayList<ArrayList<Integer>> g,boolean[]visited,int v)
				    {
				        visited[v]=true;
				      //  System.out.print(v);
				        for(int x:g.get(v)){if(!visited[x]){df(g,visited,x);}}
				    }
				ArrayList<ArrayList<Integer>> getReverse(int V,ArrayList<ArrayList<Integer>> adj)
				{
				    ArrayList<ArrayList<Integer>> g=new ArrayList<ArrayList<Integer>>();
				    for(int i=0;i<V;i++)
				    {g.add(new ArrayList<Integer>());}
				    
				    for(int i=0;i<V;i++)
				    {
				        for(int x:adj.get(i)){g.get(x).add(i);}
				    }
				return g;
				}
				 //Tarjan algorithm
			static int Time;
				void SCCUtil(int u, int low[], int disc[],boolean stackMember[],Stack<Integer> st,ArrayList<ArrayList<Integer>> adj)
			{   disc[u] = Time;
			    low[u] = Time;
			    Time += 1;
			    stackMember[u] = true;
			    st.push(u);
			    int n;
			    Iterator<Integer> i = adj.get(u).iterator();
			    while (i.hasNext())
			    {n = i.next();    
			        if (disc[n] == -1)
			        {   SCCUtil(n, low, disc, stackMember, st,adj);
			            low[u] = Math.min(low[u], low[n]);}
			        else if (stackMember[n] == true)low[u] = Math.min(low[u], disc[n]);
			    }
			   int w = -1;
			    if (low[u] == disc[u])
			    {  while (w != u)
			        {
			            w = (int)st.pop();
			            System.out.print(w + " ");
			            stackMember[w] = false;
			        }
			        System.out.println();
			    }
			}
				 public ArrayList<ArrayList<Integer>> tarjans(int V, ArrayList<ArrayList<Integer>> adj) 
			{
			    int disc[] = new int[V];
			    int low[] = new int[V];
			    for(int i = 0;i < V; i++)
			    {disc[i] = -1;low[i] = -1;}
			    boolean stackMember[] = new boolean[V];
			    Stack<Integer> st = new Stack<Integer>();
			    for(int i = 0; i < V; i++)
			    {if (disc[i] == -1)SCCUtil(i, low, disc,stackMember, st,adj);
			    }
			    return adj;
			}
				//28
				//Check it bipartite or not
				// tle O(2^V) 
				public static  boolean isBipartite(int V, ArrayList<ArrayList<Integer>>adj)
				    {
				        
				int color[]= new int[V];Arrays.fill(color,0);
				return graphColoring(adj,color,0,2);
				    }
				    public static boolean graphColoring(ArrayList<ArrayList<Integer>> G, int[] color, int i, int C) 
							    {  if (i == G.size())
							        return 
							        solved(G, color);
				                  for (int c = 1; c <= C; c++)
							        {if (legal(G, color, i, c)) 
							            {			                color[i] = c;
				           if (graphColoring(G, color, i + 1, C))
							                    return true; 
							                color[i] = 0;
							            }
							        }
							        return false;
							    }

							    public static boolean solved(ArrayList<ArrayList<Integer>> G, int[] color) 
							    {
							        for (int i = 0; i < G.size(); i++) {
							            for (int nei : G.get(i)) {
							                if (color[i] == 0 || color[i] == color[nei]) return false;
							            }
							        }
							        return true;
							    }
							    public static boolean legal(ArrayList<ArrayList<Integer>> G, int[] color, int i, int c)
							    {    for (int nei : G.get(i)) {
							            if (color[nei] == c) return false;
							        }
							        return true; 
							    }
							    //BFS
							    //O(V2) Matrix 
							    public static int Vi = 4;
							    public static boolean
							    isBipartiteUtil(int G[][], int src, int colorArr[])
							    {
							        colorArr[src] = 1;
							        Queue<Integer> q = new LinkedList<Integer>();
							        q.add(src);
							        while (!q.isEmpty()) {
							            int u =q.remove();
							            if (G[u][u] == 1) return false;
							            for (int v = 0; v < Vi; ++v) {
							                if (G[u][v] == 1 && colorArr[v] == -1) {
							                    colorArr[v] = 1 - colorArr[u];
							                    q.add(v);
							                }
							                else if (G[u][v] == 1&& colorArr[v] == colorArr[u])return false;
							            }
							        }
							     return true;
							    }
							    public static boolean isBipartite(int G[][])
							    {   int colorArr[] = new int[Vi];
							        for (int i = 0; i < Vi; ++i)
							            colorArr[i] = -1;
							        for (int i = 0; i < Vi; i++)
							            if (colorArr[i] == -1)
							                if (!isBipartiteUtil(G, i, colorArr))return false;
							        return true;
							    }
//O(V+E) Adjency list
static class Nodee {int v,c;
    Nodee(int v,int c){this.v=v;this.c=c;}
}

    public static  boolean isBipartites(int V, ArrayList<ArrayList<Integer>>adj)
    {
int color[]= new int[V];Arrays.fill(color,-1);
for(int i=0;i<V;i++)
{if(color[i]==-1)
{if(!isBi(V,adj,i,color)){return false;}
}
}
return true;
    }
    static boolean isBi(int V,ArrayList<ArrayList<Integer>>adj,int src,int color[])
    {
        color[src]=1;
        Queue<Nodee>q=new LinkedList<Nodee>();
        q.add(new Nodee(src,1));
        while(!q.isEmpty())
       {
           Nodee u=q.remove();
           for(int x:adj.get(u.v))
           {if(x==u.v)return false;
               if(color[x]==-1){color[x]=1-color[u.v];
                   q.add(new Nodee(x,color[x]));
               }
               else if(color[x]==color[u.v])return false;
           }
       }
        return true;
    }
    //DFS
    //O(V2) Matrix
    static boolean colorGraph(int G[][],int color[],int pos, int c)
{
if (color[pos] != -1 &&color[pos] != c)return false;
color[pos] = c;
boolean ans = true;
for (int i = 0; i < V; i++)
{
if (G[pos][i] == 1){
if (color[i] == -1)  ans &= colorGraph(G, color, i, 1 - c);
if (color[i] != -1 && color[i] != 1 - c)  return false;
}
if (!ans)return false;
}
return true;
}

static boolean isBipartites(int G[][])
{
int[] color = new int[V];
for (int i = 0; i < V; i++)
color[i] = -1;
int pos = 0;
return colorGraph(G, color, pos, 1);
}
//Adjency list O(V+E)
static boolean isBipartite(ArrayList<ArrayList<Integer>> adj,int v, boolean visited[],int color[])
{
for(int u : adj.get(v)){
if (visited[u] == false)
{visited[u] = true;color[u] = 1 - color[v];
if (!isBipartite(adj, u, visited, color))return false;}
else if (color[u] == color[v])return false;
}
return true;
}
static boolean isbar(ArrayList<ArrayList<Integer>> adj)
{int V=adj.size();
	boolean visited[]= new boolean[V];
	int color[]= new int[V];Arrays.fill(color, -1);Arrays.fill(visited, false);
	color[0]=1;visited[0]=true;
	return isBipartite(adj,0,visited,color);
}
				//29
				//Finding the -ve cycle in graph
			//	same as 21 bell man ford 
//30
//Longest path  in DAG
//O(V+E)
//   Change Min with Max, > with < of shortest path in dag

//O(V+E)
//DP with dfs O(V+E)
//If dag doesnot contains weight just count
void dfs(int node, ArrayList<Integer> adj[], int dp[],boolean visited[])
{visited[node] = true;
for (int i = 0; i < adj[node].size(); i++)
{if (!visited[adj[node].get(i)])
dfs(adj[node].get(i), adj, dp, visited);
dp[node] = Math.max(dp[node], 1 + dp[adj[node].get(i)]);// Just this line is different and for dp
    }
}
ArrayList<Integer> adjs[];

int findLongestPath( int n)
{
adjs=new ArrayList[n+1] ;
for(int i=0;i<n;i++) {adjs[i]=new ArrayList<Integer>();}
int[] dp = new int[n+1];
boolean[] visited = new boolean[n + 1];
for (int i = 1; i <= n; i++)
{if (!visited[i])dfs(i, adjs, dp, visited);}
int ans = 0;
for (int i = 1; i <= n; i++)
{ans = Math.max(ans, dp[i]);}
return ans;
}

//O(V+E)
//shortest path in dag
class AdjListNode
{
    private int v;
    private int weight;
    AdjListNode(int _v, int _w) { v = _v;  weight = _w; }
    int getV() { return v; }
    int getWeight()  { return weight; }
}
void topologicalSortUtil(int v, Boolean visited[], Stack stack)
{ visited[v] = true;
    Integer i;
    Iterator<AdjListNode> it = adj[v].iterator();
    while (it.hasNext())
    {
        AdjListNode node =it.next();
        if (!visited[node.getV()]) topologicalSortUtil(node.getV(), visited, stack);
    }
    stack.push(v);
}
private LinkedList<AdjListNode>adj[];
void shortestPath(int s)
{
	  adj = new LinkedList[V];
      for (int i=0; i<V; ++i)
          adj[i] = new LinkedList<AdjListNode>();
    Stack stack = new Stack();
    int dist[] = new int[V];
    Boolean visited[] = new Boolean[V];
    for (int i = 0; i < V; i++)visited[i] = false;
    for (int i = 0; i < V; i++)
        if (visited[i] == false)topologicalSortUtil(i, visited, stack);
    for (int i = 0; i < V; i++)
        dist[i] = Integer.MAX_VALUE;
    dist[s] = 0;
    while (stack.empty() == false)
    {
        int u = (int)stack.pop();
        Iterator<AdjListNode> it;
        if (dist[u] != Integer.MAX_VALUE)
        {
            it = adj[u].iterator();
            while (it.hasNext())
            { AdjListNode i= it.next();
                if (dist[i.getV()] > dist[u] + i.getWeight())
                    dist[i.getV()] = dist[u] + i.getWeight();
            }
        }
    }
    for (int i = 0; i < V; i++)
    {        if (dist[i] == Integer.MAX_VALUE)System.out.print( "INF ");
        else            System.out.print( dist[i] + " ");
    }
}
//31
//Journey to moon
public static void journey() throws NumberFormatException, IOException
{
	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine());
		int  n = Integer.parseInt(st.nextToken());
		int  p = Integer.parseInt(st.nextToken());
   ArrayList<ArrayList<Integer>>adj=new ArrayList<ArrayList<Integer>>();
   for(int i=0;i<n;i++) {adj.add(new ArrayList<Integer>());}
		while(p-->0)
      {
       st = new StringTokenizer(br.readLine());
		int  a = Integer.parseInt(st.nextToken());
		int  b = Integer.parseInt(st.nextToken());
         adj.get(a).add(b);adj.get(b).add(a);
     }
		boolean x[]=new boolean[n];
		ArrayList<Integer>ans=new ArrayList<Integer>();
		ArrayList<Integer>t=new ArrayList<Integer>();
		long h=0;
		for(int i=0;i<n;i++) 
		{t.clear();if(!x[i]) {dfs(x,i,t,adj);ans.add(t.size());}}
		int temp=n;
		while(ans.size()>1) {temp-=ans.get(0);h+=ans.get(0)*temp;ans.remove(0);}
		System.out.println(h);
}
public static void dfs(boolean[] vis,int v,ArrayList<Integer>a,ArrayList<ArrayList<Integer>>adj)
{
    vis[v]=true;
    a.add(v);
    for(int i=0;i<adj.get(v).size();i++)
    {
        int x=adj.get(v).get(i);
        if(!vis[x]){dfs(vis,x,a,adj);}
    }
}
//32
//Cheapest Flights Within K Stops
//DFS: O(n^k)
//BFS: O(n^k)
//BF: O(m*k)
//PQ: O(n^k * k * log(n^k))  
//Bellmann ford BF is fastest
//Bell mann ford method
public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
    int cost[]=new int[n];
    Arrays.fill(cost,Integer.MAX_VALUE);
    cost[src]=0;
    for(int i=0;i<=k;i++)
    {
 int z=0;  int temp[]=new int[n];for(int hi:cost){temp[z++]=hi;}
        for(int[]h:flights)
        {
            if(cost[h[0]]==Integer.MAX_VALUE)continue;
            temp[h[1]]=Math.min(temp[h[1]],cost[h[0]]+h[2]);
        }
        cost=temp;
    }
return cost[dst]==Integer.MAX_VALUE?-1:cost[dst];
}
//dijkastra
public int findCheapestPrice2(int n, int[][] flights, int src, int dst, int K) 
{
    Map<Integer,List<int[]>> map=new HashMap<>();
    for(int[] f:flights)
    {
        map.putIfAbsent(f[0],new ArrayList<>());
        map.get(f[0]).add(new int[]{f[1],f[2]});
    }
    PriorityQueue<int[]> q=new PriorityQueue<>(new Comparator<int[]>() {
        @Override
        public int compare(int[] o1, int[] o2) {
            return Integer.compare(o1[0],o2[0]);
        }
    });
    q.offer(new int[]{0,src,K+1});
    while(!q.isEmpty())
    {
        int[] c=q.poll();
        int cost=c[0];
        int curr=c[1];
        int stop=c[2];
        if(curr==dst)
            return cost;
        if(stop>0)
        {
            if(!map.containsKey(curr))
                continue;
            for(int[] next:map.get(curr))
            {
                q.add(new int[]{cost+next[1],next[0],stop-1});
            }
        }
    }
    return -1;
}
//dfs
int ans_dfs;
public int findCheapestPrice3(int n, int[][] flights, int src, int dst, int K)
{
    ans_dfs=Integer.MAX_VALUE;
    Map<Integer,List<int[]>> map=new HashMap<>();
    for(int[] i:flights)
    {
        map.putIfAbsent(i[0],new ArrayList<>());
        map.get(i[0]).add(new int[]{i[1],i[2]});
    }
    dfs(map,src,dst,K+1,0);
    return ans_dfs==Integer.MAX_VALUE?-1:ans_dfs;
}
public void dfs(Map<Integer,List<int[]>> map, int src, int dst, int k, int cost)
{
    if(k<0)
        return;
    if(src==dst)
    {
        ans_dfs=cost;
        return;
    }
    if(!map.containsKey(src))
        return;
    for(int[] i:map.get(src))
    {
        if(cost+i[1]>ans_dfs)               //Pruning, check the sum of current price and next cost. If it's greater then the ans so far, continue
            continue;
        dfs(map,i[0],dst,k-1,cost+i[1]);
    }
}
//bfs
public int findCheapestPrice4(int n, int[][] flights, int src, int dst, int K)
{
    Map<Integer,List<int[]>> map=new HashMap<>();
    for(int[] i:flights)
    {
        map.putIfAbsent(i[0],new ArrayList<>());
        map.get(i[0]).add(new int[]{i[1],i[2]});
    }
    int step=0;
    Queue<int[]> q=new LinkedList<>();
    q.offer(new int[]{src,0});
    int ans=Integer.MAX_VALUE;
    while(!q.isEmpty())
    {
        int size=q.size();
        for(int i=0;i<size;i++)
        {
            int[] curr=q.poll();
            if(curr[0]==dst)
                ans=Math.min(ans,curr[1]);
            if(!map.containsKey(curr[0]))
                continue;
            for(int[] f:map.get(curr[0]))
            {
                if(curr[1]+f[1]>ans)      //Pruning
                    continue;
                q.offer(new int[]{f[0],curr[1]+f[1]});
            }
        }
        if(step++>K)
            break;
    }
    return ans==Integer.MAX_VALUE?-1:ans;
}
//33
//Oliver and bob
public static void bob() throws NumberFormatException, IOException
{
	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int N = Integer.parseInt(br.readLine().trim());
      HashMap<Integer,Integer>h=new HashMap<Integer,Integer>();N--;
      while(N-->0)
      {
      StringTokenizer st = new StringTokenizer(br.readLine());
		int  a = Integer.parseInt(st.nextToken());
		int  b = Integer.parseInt(st.nextToken());
          h.put(b,a);h.put(1,-1);
     }
      int Q = Integer.parseInt(br.readLine().trim());
      while(Q-->0)
      {
    	    StringTokenizer st = new StringTokenizer(br.readLine());
    		int  s = Integer.parseInt(st.nextToken());
    		int  x = Integer.parseInt(st.nextToken());
    		int  y = Integer.parseInt(st.nextToken());
    		
    		if(s==0)
    		{int ans=y;
    			while(ans!=-1) { if(ans==x) {break;}  ans=h.get(ans);}
    		if(ans==-1) {System.out.println("NO");}else System.out.println("YES");
    		}
    		else	{int ans=x;
			while(ans!=-1) { if(ans==y) {break;}  ans=h.get(ans);}
			if(ans==-1) {System.out.println("NO");}else System.out.println("YES");
		}
      }
}
//34 && 35
//Water jug problem
//O(M+N)
public static int  minSteps(int a, int b, int d)
{
    if(b>a){int t=b;b=a;a=t;}
    if(d>a)return -1;
if(!canMeasureWater(a,b,d))return -1;
int x=steps(a,b,d);
int y=steps(b,a,d);    
return Math.min(x,y);
}
public static int steps(int a,int b,int d)
{
    int a1=a,b1=0;
    int s=1;
    System.out.println(a1+" "+b1);
    while(a1!=d&&b1!=d)
    {
        int min=Math.min(a1,b-b1);
        b1+=min;a1-=min;
        System.out.println(a1+" "+b1);
        s++;
if(a1==d||b1==d)break;
    if(a1==0){a1=a;s++;System.out.println(a1+" "+b1);}
    if(b1==b){b1=0;s++;System.out.println(a1+" "+b1);}    
    }

    return s;
}
    public static boolean canMeasureWater(int a, int b, int d) {
   if(d>a+b)return false;
    int c=gcdExtended(a,b,1,1);
    return d%c==0;
}
public static  int gcdExtended(int a, int b, int x, int y)
{
    if (a == 0)
    {
        x = 0;
        y = 1;
        return b;
    }
    int x1=1, y1=1;
    int gcd = gcdExtended(b%a, a, x1, y1);
    x = y1 - (b/a) * x1;
    y = x1;
    return gcd;
}
//36
//Path of greater than equal to k length 
boolean pathMoreThanK(int V , int E , int K , int [] A){
    ArrayList<ArrayList<int []>>adj=new ArrayList();
    for(int i=0;i<V;i++)
    {adj.add(new ArrayList<int[]>());}
    for(int i=0;i<E;i++)
    {adj.get(A[3*i]).add(new int[]{A[(3*i)+1],A[(3*i)+2]});
        adj.get(A[(3*i)+1]).add(new int[]{A[(3*i)],A[(3*i)+2]});
    }                    
boolean []b=new boolean[V];Arrays.fill(b,false);
b[0]=true;
    return pathMore(0,K,b,adj);
}
boolean pathMore(int src,int k,boolean b[],ArrayList<ArrayList<int[]>>adj)
{
    if(k<=0)return true;
    for(int[] x:adj.get(src))
    {
        if(b[x[0]])continue;
        if(x[1]>=k)return true;
        b[x[0]]=true;
        if(pathMore(x[0],k-x[1],b,adj))return true;
        b[x[0]]=false;
    }
 return false;   
}
//37
				//M graph Colouring
				//O(M^V)
				public static boolean graphColoring(List<Integer>[] G, int[] color, int i, int C) 
			    {  if (i == G.length)
			        return 
			        solved(G, color);
                  for (int c = 1; c <= C; c++)
			        {if (legal(G, color, i, c)) 
			            {			                color[i] = c;
           if (graphColoring(G, color, i + 1, C))
			                    return true; 
			                color[i] = 0;
			            }
			        }
			        return false;
			    }

			    public static boolean solved(List<Integer>[] G, int[] color) 
			    {
			        for (int i = 0; i < G.length; i++) {
			            for (int nei : G[i]) {
			                if (color[i] == 0 || color[i] == color[nei]) return false;
			            }
			        }
			        return true;
			    }
			    public static boolean legal(List<Integer>[] G, int[] color, int i, int c)
			    {    for (int nei : G[i]) {
			            if (color[nei] == c) return false;
			        }
			        return true; 
			    }
			    //38
			    //Minimum edges to reverse to make path from a source to a destination
	//O(V+E)
			    public static void reverse()
			    {
			    	 int V = 7;
			    	    int edge[][] = { { 0, 1 }, { 2, 1 },
			    	                     { 2, 3 }, { 5, 1 },
			    	                     { 4, 5 }, { 6, 4 },
			    	                     { 6, 3 } };
			    	    int E = edge.length;
			    	 
			    	    int minEdgeToReverse = getMinEdgeReversal(
			    	        edge, E, V, 0, 6);
			    	     
			    	    if (minEdgeToReverse != -1)
			    	        System.out.println(minEdgeToReverse);
			    	    else
			    	        System.out.println("Not possible");
			    }
	private static int getMinEdgeReversal(int[][] edge, int e, int v, int s, int d) {
					List<List<int[]>>adj=new ArrayList<List<int[]>>();
					for(int i=0;i<v;i++)
							adj.add(new ArrayList<int []>());
					for(int i=0;i<e;i++)
					{
						adj.get(edge[i][0]).add(new int[]{edge[i][1],0});
						adj.get(edge[i][1]).add(new int[]{edge[i][0],1});
					}
				return	dijkastra(adj,s,d);
				}
	private static  int dijkastra(List<List<int[]>> adj2, int s,int d) {
		int dis[]=new int[adj2.size()];
		Arrays.fill(dis, Integer.MAX_VALUE);
		HashSet<Integer>h=new HashSet<Integer>();
		PriorityQueue<int[]>pq=new PriorityQueue<int[]>(new Nomdv());
		pq.add(new int[]{s,0});dis[s]=0;
		while(h.size()!=adj2.size()) 
		{
			if(pq.isEmpty())break;
			int[] u=pq.remove();
			if(h.contains(u[0]))continue;
			h.add(u[0]);
			for(int i=0;i<adj2.get(u[0]).size();i++)
			{
				int[] v=adj2.get(u[0]).get(i);
			
				if(!h.contains(v[0]))
	{
		if(dis[v[0]]>dis[u[0]]+v[1])
		{dis[v[0]]=dis[u[0]]+v[1];	
	pq.add(new int[] {v[0],dis[v[0]]});
	}
		
			}
		}
		}
	return dis[d];
	}
	
static class   Nomdv implements Comparator<int[]>{
	   @Override
	   public int compare(int[] n1,int[] n2)
	   {
		   if(n1[1]<n2[1])return -1;
		   if(n1[1]>n2[1])return 1;
		   return 0;
	   }
   }
//39
//Fleury algo
//Paths to travel each nodes using each edge (Seven Bridges of Königsberg)
//fleury method
static class Grap
{int V;
    ArrayList<ArrayList<Integer>> adj;
    Grap(int V)
    {        this.V = V;
        adj = new ArrayList<ArrayList<Integer>>();
   for(int i=0; i<V; i++){
            adj.add(new ArrayList<Integer>());
        }
    }
    void addEdge(int u, int v)
    {        adj.get(u).add(v);
        adj.get(v).add(u);
    }
void rmvEdge(int u, int v)
    {   int iv = find(adj.get(u), v);
        adj.get(u).set(iv, -1);
        int iu = find(adj.get(v), u);
        adj.get(v).set(iu, -1);
    }
    int find(ArrayList<Integer> al, int v){
      for(int i=0; i<al.size(); i++){
            if(al.get(i) == v){return i;}
        }
        return -1;
    }
void printEulerTour()
    {int u = 0;
        for (int i = 0; i < V; i++){
            if (adj.get(i).size() % 2 == 1)
            {  u = i;  break;}
        }
    printEulerUtil(u);
        System.out.println();
    }
    void printEulerUtil(int u)
    {
      for (int i = 0; i<adj.get(u).size(); ++i)
        {
            int v = adj.get(u).get(i);
         if (v != -1 && isValidNextEdge(u, v))
            { System.out.print(u + "-" + v + " ");
                rmvEdge(u, v);
                printEulerUtil(v);
            }
        }
    }
    int DFSCount(int v, boolean visited[])
    {
        visited[v] = true;
        int count = 1;
        for (int i = 0; i<adj.get(v).size(); ++i){
            int u = adj.get(v).get(i);

            if (u != -1 && !visited[u]){
                count += DFSCount(u, visited);
            }
        }
        return count;
    }
 boolean isValidNextEdge(int u, int v)
    {
        int count = 0; // To store count of adjacent vertices
        for (int i = 0; i<adj.get(u).size(); ++i)
            if (adj.get(u).get(i) != -1)count++;
        if (count == 1)return true;
        boolean visited[] = new boolean[V];
        Arrays.fill(visited, false);
        int count1 = DFSCount(u, visited);
        rmvEdge(u, v);
        Arrays.fill(visited, false);
        int count2 = DFSCount(u, visited);
        addEdge(u, v);
       return (count1 > count2)? false: true;
    }
}
//40
//Vertex Cover problem
// Its an approximation problem
//So O(v+e)
void printVertexCover(ArrayList<Integer>adj[])
{
    boolean visited[] = new boolean[V];
    for (int i=0; i<V; i++)
        visited[i] = false;
    Iterator<Integer> i;
for (int u=0; u<V; u++)
    {if (visited[u] == false)
        {i = adj[u].iterator();
            while (i.hasNext())
            {  int v = i.next();
                if (visited[v] == false)
                {
                     visited[v] = true;visited[u]  = true;
                     break;
                }
            }
        }
    }
   for (int j=0; j<V; j++)
        if (visited[j])
          System.out.print(j+" ");
}
//41
//Chineese postman problem consist only theory  no code is there
	//42
  //Number of Triangles in Directed and Undirected Graphs
			    int v = 4;
			    int countTriangle(int graph[][],
			                      boolean isDirected)
			   { int count_Triangle = 0;
			 for (int i = 0; i < v; i++)
			       {for (int j = 0; j < v; j++)
			           {for (int k=0; k<v; k++)
 {  if (graph[i][j] == 1 &&graph[j][k] == 1 &&graph[k][i] == 1)count_Triangle++;}
			           }
			       }
			  if(isDirected == true)
			       {count_Triangle /= 3;}
			       else
			       {count_Triangle /= 6;}
			       return count_Triangle;
			   }
			    public  void check()
			   {   int graph[][] = {{0, 1, 1, 0},
			                        {1, 0, 1, 1},
			                        {1, 1, 0, 1},
			                        {0, 1, 1, 0}};//undirected			          
			       int digraph[][] = { {0, 0, 1, 0},
			                           {1, 0, 0, 1},
			                           {0, 1, 0, 0},
			                           {0, 0, 1, 0}};//directed			          
			    System.out.println("in undirected graph : " +countTriangle(graph, false));
			    System.out.println(" in directed graph : "+countTriangle(digraph, true));	 
			    }
//43
 //Minimize Cash Flow among a given set of friends who have borrowed money from each other
// same as Greedy 11
}

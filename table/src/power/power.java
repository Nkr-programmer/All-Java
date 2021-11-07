package power;
import java.util.*;
import java.lang.*;
import java.io.*;
class power
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int N = Integer.parseInt(br.readLine().trim());
            String[] S1 = br.readLine().trim().split(" ");
            String[] S2 = br.readLine().trim().split(" ");
            int[] KnightPos = new int[2];
            int[] TargetPos = new int[2];
            for(int i = 0; i < 2; i++){
                KnightPos[i] = Integer.parseInt(S1[i]);
                TargetPos[i] = Integer.parseInt(S2[i]);
            }
            Solution obj = new Solution();
            int ans = obj.minStepToReachTarget(KnightPos, TargetPos, N);
            System.out.println(ans);
       }
    }
}
// } Driver Code Ends



class Solution
{
	   public int minStepToReachTarget(int Ki[], int TPi[], int N)
	    {
	    	int K[]=new int[] {Ki[1],Ki[0]};
	    	int TP[]=new int[] {TPi[1],TPi[0]};
	        K[0]=N-K[0]+1;TP[0]=N-TP[0]+1;
	 //       System.out.println(K[0]+" "+K[1]+"  "+TP[0]+" "+TP[1]);
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

}
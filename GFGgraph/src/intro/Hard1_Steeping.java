package intro;

import java.util.LinkedList;
import java.util.Queue;

public class Hard1_Steeping {

	public static void main(String[] args) {
int n=0,m=21;

steppingNumbers(n,m);
	}

	private static void steppingNumbers(int n, int m) {
		for(int i=0;i<9;i++)
		{
			dfs(n,m,i);
		}	
	}
	private static void bfs(int n, int m, int i) {
		Queue<Integer>a= new LinkedList<Integer>();
		a.add(i);
		while(!a.isEmpty())
		{
			int num=a.poll();
			
			   if (num <= m && num >= n)
	            {
	                System.out.print(num + " ");
	            }
			
			if(num==0 || num>m)continue;
			
			int last=num%10;
			
			int snum=num*10+last-1;
			int pnum=num*10+last+1;
			
			if(last==0) {a.add(pnum);}
			else
			if(last==9) {a.add(snum);}
			else
			{a.add(pnum);a.add(snum);}
			
		}
		
	}
	private static void dfs(int n, int m, int i) {
		
		
			int num=i;
			
			   if (num <= m && num >= n)
	            {
	                System.out.print(num + " ");
	            }
			
			if(num==0 || num>m)return;
			
			int last=num%10;
			
			int snum=num*10+last-1;
			int pnum=num*10+last+1;
			
			if(last==0) {dfs(n,m,pnum);}
			else
			if(last==9) {dfs(n,m,snum);}
			else
			{dfs(n,m,pnum);dfs(n,m,snum);}
			
		
		
	}
}

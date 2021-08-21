package Easy;

import java.util.Scanner;
import java.util.Stack;

public class Geeks_garden {

		 public static void main (String[] args) {
		        Scanner sc=new Scanner(System.in);
		        int t=sc.nextInt();
		        
		        while(t-->0)
		        {
		        	
		            int n =sc.nextInt();
		            int m =sc.nextInt();
		         int a[][]= new int[n][m];
		            for(int i=0;i<n;i++)
		            {
		            	for(int j=0;j<m;j++)
			            {
			                a[i][j]=sc.nextInt();
			            }
		            }
		                flower obj=new flower();
		              int g=  obj.find(a,n,m);
		                
		                
		                    System.out.print(g+" ");         
		                System.out.println();
		        }
		    }
		}
class flower{
   int a[][],k,l;
    public int find(int s[][],int n,int m)
    {a=new int[n][m];
    a=s;
    k=m;l=n;
    
    	 ans = 0;
    		for(int i=0;i<n;i++)
    		{
    			for(int j=0;j<m;j++)
    			{
    				if(s[i][j]==1)
    				{
    					c = 0;
    					//System.out.println(a[i][j]);
    					garden(i, j);
    					ans = Math.max(ans, c);
    				}
    			}
    		}

    		
    	return ans;
    }
    static int ans = 0, c = 0;
    void garden(int i, int j)
    {
    	if(i<0 || i>=l || j<0 || j>=k || a[i][j]==0)
    		return;

    	if(a[i][j]==1)
    	{
    		c++;
    		a[i][j] = 0;
    		garden(i-1, j);
    		garden(i+1, j);
    		garden(i, j+1);
    		garden(i, j-1);
    		garden(i-1, j-1);
    		garden(i+1, j-1);
    		garden(i-1, j+1);
    		garden(i+1, j+1);
    	}
    }
    }
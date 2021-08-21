package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Help_The_Old_Man {
	
	
	   public static void main(String[] args) throws IOException{ 
		   BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
       int t = Integer.parseInt(in.readLine());
       while(t-- > 0){
           String a[] = in.readLine().trim().split("\\s+");
           int N = Integer.parseInt(a[0]);
           int n = Integer.parseInt(a[1]);
           
           old ob = new old();
           List<Integer> ans = new ArrayList<Integer>();
           ans = ob.shiftPile(N, n);
           System.out.println(ans.get(0)+" "+ans.get(1));
       }
	    }
	}

	class old {

		  static int moves=0;
		static int no=0;
		static List<Integer> a= new ArrayList<Integer>();
		 static void shiftPileutil(int N,int from,int to,int aux)
		{
		    if(N==1){
		   moves++;
		   if(a.isEmpty()&&moves==no) {a.add(from);a.add(to);}
		        return;
		    }
		    shiftPileutil( N-1, from, aux, to);
		    moves++;
		    if(a.isEmpty()&&moves==no) {a.add(from);a.add(to);}
		    shiftPileutil( N-1,  aux,to, from);
		}

		 List<Integer> shiftPile(int N, int n){
		     moves=0;a.clear();
		no=n;
		shiftPileutil(N,1,3,2);
		return a;
		}
		}

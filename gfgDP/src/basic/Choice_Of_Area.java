package basic;

import java.util.HashMap;
import java.util.Map;

public class Choice_Of_Area {

static class Area{
		int x;
		int y;
		Area(int x,int y)
		{
			this.x=x;
			this.y=y;
		}
	}
	
	public static void main(String[] args) {
	    Area X= new Area(3,2);
	    Area Y= new Area(-5,-10);
	    Area Z= new Area(-20,5);
	
	  
	    int A = 20;
	    int B = 8;
	    System.out.println(getMaxSurvivalTime(A, B, X, Y, Z));
	}
static int temp1=0,temp2=0,temp3=0;
	private static int getMaxSurvivalTime(int A, int B, Area X, Area Y, Area Z) {
		if(A<0||B<0) return 0;
		  if (A <= 0 || B <= 0)
		        return 0;
		    Map< Area, Integer > memo= new HashMap< Area, Integer >();
		    return
		        max(maxSurvival(A + X.x, B + X.y, X, Y, Z, 1, memo),
		            maxSurvival(A + Y.x, B + Y.y, X, Y, Z, 2, memo),
		            maxSurvival(A + Z.x, B + Z.y, X, Y, Z, 3, memo));
	}
	static int max(int a, int b, int c)
	{
	    return Math.max(a, Math.max(b, c));
	}
	static int maxSurvival(int A, int B, Area X, Area Y, Area Z,
	                int last, Map< Area, Integer > memo)
	{
	      if (A <= 0 || B <= 0)
	        return 0;
	    Area cur= new Area(A,B);
	    if (memo.containsKey(cur))
	        return memo.get(cur);
	  
	    int temp=0;
	     switch(last)
	    {
	    case 1:
	        temp = 1 + Math.max(maxSurvival(A + Y.x, B + Y.y,
	                                   X, Y, Z, 2, memo),
	                       maxSurvival(A + Z.x, B + Z.y,
	                                  X, Y, Z, 3, memo));
	        break;
	    case 2:
	        temp = 1 + Math.max(maxSurvival(A + X.x, B + X.y,
	                                  X, Y, Z, 1, memo),
	                       maxSurvival(A + Z.x, B + Z.y,
	                                  X, Y, Z, 3, memo));
	        break;
	    case 3:
	        temp = 1 + Math.max(maxSurvival(A + X.x, B + X.y,
	                                  X, Y, Z, 1, memo),
	                       maxSurvival(A + Y.x, B + Y.y,
	                                  X, Y, Z, 2, memo));
	        break;
	    }
	     memo.put(cur, temp);
	 System.out.println(memo);
	     return temp;
	}
}
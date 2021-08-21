package Easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Josephus {

	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int T=sc.nextInt();//testcases
		while(T-->0)
		{
		    Josephu obj=new Josephu();
		    
		    int n,k;
		    //taking input n and k
		    n=sc.nextInt();
		    k=sc.nextInt();
		    
		    //calling josephus() function
		    System.out.println(obj.josephus(n,k));
		    
		    
		}
		
	}
}

// } Driver Code Ends


class Josephu
{
	static List<Integer>a=new ArrayList<Integer>();
   static int j=0;
	public int josephus(int n, int k)
    {
	   a.clear();
        for(int i=1;i<=n;i++)
        {
        	a.add(i);
        }
       
        
        int ki=0;
        j=k;
        josephusutil(k);
      
        
        
 //       //iterative way
//        while(a.size()!=1)
//        {
//       if(k+ki-1>=a.size()) {	ki= (ki+k-1)%a.size();ki=ki-(k-1);}
//        	a.remove(k+ki-1);
//        	ki=k+ki-1;
//
//        }
 //     System.out.println(a); 
       
        return a.get(0);
    }
   
private void josephusutil(int k) {
	// TODO Auto-generated method stub
	if(a.size()==1)return;
	
	if(k>=a.size()) {k=k%a.size();if(k-1<0) {k=a.size()+k;}}
//	  System.out.println(a);
//	  System.out.println(k-1);
	  	  a.remove(k-1);
	  josephusutil(k-1+j);
}
}
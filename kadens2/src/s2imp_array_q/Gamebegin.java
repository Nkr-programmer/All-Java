package s2imp_array_q;

public class Gamebegin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub ....i is intializer and j is the no.s to which it should be added
int m[]= {1,-3,-4,5,-6,3,-9,10};
 int a=m.length;
int l=Integer.MIN_VALUE;
for(int i=0;i<a;i++) {
	for(int j=i;j<a;j++) {
		int sum=0;
	                    for(int k=i;k<=j;k++) {
	                   sum=sum+m[k]; 	
	                    	
	                  
	                                          }
	if(l<sum) {
		l=sum;
	}
	
	                     }
	
                     }

System.out.println(l);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

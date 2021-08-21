package multi_dimensional_add;

public class Multi_dimensional_experiment2 {
public static void main(String[] args) {
	// TODO Auto-generated method stub{

	
	int	a[]= {1,2,3} ;
	int	b[]= {4,5,6} ;
	int	c[]= {7,8,9} ;


	
	
 	int	 d[][]= {{a[0],a[1],a[2]},{b[0],b[1],b[2]},{c[0],c[1],c[2]}};
				
			
			
 
 for(int i=0;i<3;i++)
 {
	 for(int j=0;j<3;j++)
	 {
		System.out.print(d[i][j]);
	 }
	 System.out.println();
	
	// that you are thinking that is not possible as by using {,,,}initialising only we can use it by 
	 //but if it is already initialized than it will not work as in this case{kkk} single condition as k is aliwed
 }
}
}
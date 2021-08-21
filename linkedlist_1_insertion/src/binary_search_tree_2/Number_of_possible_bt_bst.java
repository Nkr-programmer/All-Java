package binary_search_tree_2;

public class Number_of_possible_bt_bst {

	public Number_of_possible_bt_bst() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=2;
		int count1=  bst(n);
		int count2 = bt(n);
		
		System.out.println(count1+"= possible bst "+count2+"possible bt");
	}

	private static int bt(int n) {

		int count= catalan(n);
		
		return count* factorial(n);
	}

	private static int factorial(int n) {
		// TODO Auto-generated method stub
		int y=1;
		for(int r=1;r<=n;r++)
		y=y*r;
		return y;
	}

	private static int catalan(int n) {
		// TODO Auto-generated method stub
		
		int count = binomial(2*n,n);
		return count/(n+1);
	}

	private static int binomial(int n, int k) {
		// TODO Auto-generated method stub
		int res=1;
		if (k > n - k) 
	        k = n - k;
		for(int i=0;i<k;i++)
		{
			res*= n-i;
			res/= 1+i;
		}
		
		return res;
	}

	private static int bst(int n) {
		// TODO Auto-generated method stub
int count= catalan(n);
		
		return count;
	}

}

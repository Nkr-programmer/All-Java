package backtracking;

public class Hamilton_Cycle {

	public static void main(String[] args) {
		//  O(8^(n^2))
solvehami();
	}
static int N=5;
	private static boolean solvehami() {
		int [][]a=
			{{0, 1, 0, 1, 0},
		            {1, 0, 1, 1, 1},
		            {0, 1, 0, 0, 1},
		            {1, 1, 0, 0, 1},
		            {0, 1, 1, 1, 0},
		        };
		  int check[]=new int[N];
		  check[0]=0;
			if(solveHamiUtil(a,1,check)) {
			
				for(int j=0;j<N;j++)
				{
					System.out.print(check[j]+" ");
				}
				
			return true;}
		else {System.out.println("not possible");return false;}
		
	}
    static boolean isSafe(int board[][], int i, int k, int[] check)
    {
 if(board[check[k-1]][i]==0){return false;  }

 for (int g= 0;g<k;g++)
 {if (check[g] == i)
     return false;}

 return true;
    }
  
    static boolean solveHamiUtil(int board[][], int k, int[] check)
    {
        if (k == N) {
        	  if (board[check[k - 1]][check[0]] == 1)
                  return true;
              else
                  return false;
          }
       
        for (int i = 1; i < N; i++) {
            if (isSafe(board, i, k,check)) {
                check[k] = i;
  
                if (solveHamiUtil(board, k + 1,check) == true)
                    return true;
                check[k] = -1; // BACKTRACK
            }
        }
        return false;
    }
}
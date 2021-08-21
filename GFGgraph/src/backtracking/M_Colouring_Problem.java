package backtracking;

public class M_Colouring_Problem {
	public static void main(String[] args) {
		//  O(m^(V))
solvecolour();
	}
static int N=4;
	private static boolean solvecolour() {
		  int a[][] = {
		            { 0, 1, 1, 1 },
		            { 1, 0, 1, 0 },
		            { 1, 1, 0, 1 },
		            { 1, 0, 1, 0 },
		        };
		  int colour[]=new int[N];
		  colour[0]=1;
		        int m = 3; // Number of colors
		     	if(colourUtil(a,m,0,colour)) {
			
				for(int j=0;j<N;j++)
				{
					System.out.print(colour[j]+" ");
				}
			
			return true;}
		else {System.out.println("not possible");return false;}
		
	}
    static boolean isSafe(int board[][], int colour, int[] colr, int ver)
    {
        int i, j;
  
        for (i = 0; i < N; i++)
            if (board[ver][i] == 1&&colr[i]==colour)
                return false;
  
        return true;
    }
  
    static boolean colourUtil(int board[][], int m,int k, int[] colour)
    {
        if (k ==N)
            return true;
        for (int i = 1; i <=m ; i++) {
            if (isSafe(board,i,colour,k)) {
                colour[k]=i;
  
                if (colourUtil(board,m,k+1,colour ) == true)
                    return true;
                colour[i]=0; // BACKTRACK
            }
        }
        return false;
    }
}

package backtracking;

import java.util.Arrays;

public class Rat_Maze {
static int N=0;
	public static void main(String[] args) {
		//  O(2^(n^2))
	   
        int maze[][] = { { 1, 1, 1, 1, 1 },
                         { 1, 1, 1, 0, 1 },
                         { 1, 1, 1, 0, 1 },
                         { 0, 0, 0, 0, 1 },
                         { 0, 0, 0, 0, 1 }};
 
        N = maze.length;
        solveMaze(maze);
	}
	private static boolean solveMaze(int[][] maze) {
	
			if(solveMazeutil(0,0,maze)) {
			
					System.out.println("True");
				return true;}
			else {System.out.println("not possible");return false;}//1 is about the nos of move
			
	}
	private static boolean solveMazeutil(int x,int y,int[][] maze) {
		
		if(x==maze.length-1&&y==maze.length-1&&maze[x][y]==1)return true;
	
	 if(x>=0&&x<maze.length&&y>=0&&y<maze.length&&maze[x][y]==1)
	 {
		 if(maze[x][y]==2)return false;
		 maze[x][y]=2;
		 if(solveMazeutil(x+1,y,maze)) {return true;}
				 
     	 if(solveMazeutil(x-1,y,maze)) {return true;}
			  
     	 if(solveMazeutil(x,y+1,maze)) {return true;}
		 
     	 if(solveMazeutil(x,y-1,maze)) {return true;}
	 maze[x][y]=1;
	 return false;
	 
	 }
	
	return false;
	}

}

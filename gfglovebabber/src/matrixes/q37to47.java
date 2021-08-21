package matrixes;

import java.util.HashMap;
import java.util.PriorityQueue;


public class q37to47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	//2
		//O(m+n)
		   public boolean searchMatrix(int[][] matrix, int target) {
		        int i=0,j=0;
		        while(i<matrix.length-1){
		            if(matrix[i][0]==target||matrix[i+1][0]==target){return true;}
		            if(matrix[i+1][0]>target){break;}
		            else if(matrix[i+1][0]<target){i++;}
		        }
		    while(j<matrix[0].length-1)
		    {
		        if(matrix[i][j]==target||matrix[i][j+1]==target)
		        {return true;}
		            if(matrix[i][j+1]>target){
		                                      return false;}
		            else if(matrix[i][j+1]<target){j++;}
		    }
		    return matrix[i][j]==target;
		    }
		   //O(log(m)+log(n))
		      public boolean searchMatrixs(int[][] m, int t) {
			        int i=0,j=m.length-1,i1=0,j1=m[0].length-1;
			    
		          if(m[j][0]>t){
		          while(i<j){
			        	int mid=(i+j)/2;
			            if(m[i][0]==t||m[j][0]==t||m[mid][0]==t){return true;}
			             if(i==mid)break;
		                if(m[mid][0]<t){i=mid;}
			            else if(m[mid][0]>t){j=mid;}
			        }}
		          else{i=j;}
		              		        while(i1<j1){
			        	int mid=(i1+j1)/2;
			            if(m[i][i1]==t||m[i][j1]==t||m[i][mid]==t){return true;}
		                if(i1==mid)break;
			            if(m[i][mid]<t){i1=mid;}
			            else if(m[i][mid]>t){j1=mid;}
			        }
			    return m[i][i1]==t;
			    } 
		   //4
		      //Row with max 1s
		      //  O(m+n)  O(1)
		      int rowWithMax1s(int arr[][], int n, int m) {
		          int i=0,j=m-1,max=-1;
		          while(i<n){
		                          if(arr[i][j]==0){i++;}
		              else if(arr[i][j]==1){j--;if(j==-1){return i; }max=Math.max(max,i);}
		  }
		                 return max;
		             }
		      //5
		      //print elements in sorted order using row column wise sorted matrix
		      // O(n2log(n)) O(n2)
		      public static class Element implements Comparable<Element>{
		            int row,col,val;
		            
		            public Element(int row, int col, int val){
		                this.row = row;
		                this.col = col;
		                this.val = val;
		            }
		            
		            @Override
		            public int compareTo(Element e){
		                return this.val - e.val;
		            }
		        }
	  int[][] sortedMatrix(int n, int matrix[][]) {
	       PriorityQueue<Element> q = new PriorityQueue<Element>();
		            
		            //add first row into the priority queue
		            for(int i=0;i<matrix[0].length;i++)
		                q.add(new Element(0,i, matrix[0][i]));
		                int [][] x= new int[n][n];
		            int i1=0,j1=0,c=0;
		            for(int i=0;i<(n*n);i++){
		                Element e = q.poll();
		                x[(int)(c/n)][c%n]=e.val;c++;
		                if (e.row+1 < matrix.length)
		                    q.add(new Element(e.row+1, e.col, matrix[e.row+1][e.col]));    
		            }
		            return x;
		        }
		      
		  //7
		      // Find a specific pair in a matrix
		      // O(n2)   O(n2)
		      public static int pairs(int arr[][], int n)
		      {
		    	  int max=arr[n-1][n-1];
		    	  for(int i=n-2;i>=0;i--)
		    	  {max=Math.max(max, arr[n-1][i]);arr[n-1][i]=max;}
		    	  for(int i=n-2;i>=0;i--)
		    	  {max=Math.max(max, arr[i][n-1]);arr[i][n-1]=max;}
		    	  int maxom= Integer.MAX_VALUE;
	for(int i=n-2;i>=0;i--)
		for(int j=n-2;j>=0;j--) 
		{
			maxom=Math.max(maxom, arr[i+1][j+1]-arr[i][j]);
			arr[i][j]= Math.max(arr[i][j], Math.max(arr[i][j+1], arr[i+1][j]));
		}
		    	  return maxom;
		      }
		      
		      // 8 Rotate a matrix by 90 degree
	//O(n2) O(1)
		      public static void  rotate(int [][] m) {
		    	  int n=m.length;
		    	  for(int i=0;i<n/2;i++)
		    	  for(int j=i;j<n-1-i;j++)
		    	  {
		    		  int t= m[i][j];
		    		      m[i][j]=m[n-1-j][i];
		    		      m[n-1-j][i]=m[n-1-i][n-1-j];
		    		      m[n-1-i][n-1-j]=m[j][n-1-i];
		    		      m[j][n-1-i]=t;
		    	  }	    	  
		      }
		      
		      //just need to print
		      public static void  rotatePrint(int [][] m) {
		    	  int n=m.length;
		    	  for(int i=0;i<n;i++)
		    	  for(int j=n-1;j>=0;j--)
		    	  {
		    		  System.out.print(m[j][i]);
		    		  System.out.println();
		    	  }	    	  
		      }
		      //Anticlockwise
		      static void rotateby90(int m[][], int n) 
		      { 
		  	    	  for(int i=0;i<n/2;i++)
		  	    	  for(int j=i;j<n-1-i;j++)
		  	    	  {
		  	    		  int t= m[i][j];
		  	    		      m[i][j]=m[j][n-1-i];
		  	    		      m[j][n-1-i]=m[n-1-i][n-1-j];
		  	    		      m[n-1-i][n-1-j]=m[n-1-j][i];
		  	    		      m[n-1-j][i]=t;
		  	    	  }	
		      }
		  //9
//		      Kth element in Matrix
	// O(n+klog(n))  O(n)
		      static class HeapNode
		      {
		          int val;
		          int r;
		          int c;
		           
		          HeapNode(int val, int r, int c)
		          {
		              this.val = val;
		              this.c = c;
		              this.r = r;
		          }
		      }
		       
		      static void minHeapify(HeapNode harr[],
		                             int i, int heap_size)
		      {
		          int l = 2 * i + 1;
		          int r = 2 * i + 2;
		          int min = i;
		           
		          if(l < heap_size&& r<heap_size && harr[l].val < harr[i].val && harr[r].val < harr[i].val){
		                  HeapNode temp=harr[r];
		                  harr[r]=harr[i];
		                  harr[i]=harr[l];
		                  harr[l]=temp;
		                  minHeapify(harr ,l,heap_size);
		                  minHeapify(harr ,r,heap_size);
		              }
		                if (l < heap_size && harr[l].val < harr[i].val){
		                  HeapNode temp=harr[i];           
		                  harr[i]=harr[l];
		                  harr[l]=temp;
		                  minHeapify(harr ,l,heap_size);
		              }
		      }
		          
		          
		          
		          
		      	public static int kthSmallest(int[][]arr,int n,int k)
		      	{
		          if(k<=0||k>n*n)return Integer.MAX_VALUE;
		          HeapNode harr[]= new HeapNode[n];
		          for(int i=0;i<n;i++)
		          {
		              harr[i]=new HeapNode(arr[0][i],0,i);
		              
		          }
		              HeapNode h= new HeapNode(0,0,0);
		              
		              for(int i=1;i<=k;i++)
		              {
		              //System.out.print(harr[0].val+" ");
		                  h= harr[0];
		                  harr[0]=new 
		                  HeapNode(h.r<n-1?arr[(h.r)+1][h.c]:Integer.MAX_VALUE,(h.r)+1,h.c);
		                  minHeapify(harr,0,n);
		              }
		              
		              return h.val;
		          }
		      
		      // better 

		        public class elements implements Comparable<elements>{
		            int row,col,val;
		            
		            public elements(int row, int col, int val){
		                this.row = row;
		                this.col = col;
		                this.val = val;
		            }
		            
		            @Override
		            public int compareTo(elements e){
		                return this.val - e.val;
		            }
		        }
		        
		        public int kthSmallest(int[][] matrix, int k) {
		            
		            PriorityQueue<elements> q = new PriorityQueue<elements>();
		            
		            //add first row into the priority queue
		            for(int i=0;i<matrix[0].length;i++)
		                q.add(new elements(0,i, matrix[0][i]));
		            
		            for(int i=0;i<k-1;i++){
		                elements e = q.poll();
		                if (e.row+1 < matrix.length)
		                    q.add(new elements(e.row+1, e.col, matrix[e.row+1][e.col]));    
		            }
		            
		            return q.peek().val;
		        }
		    
		      
		      
		      //10
		      //Common elements in all rows of a given matrix
		      //O(mn)    O(n)
		      public static void print(int [][]m)
		      {
		    	  HashMap<Integer,Integer>x=new HashMap<Integer,Integer>();
		    	  int n=m.length,t=m[0].length;
		    	for(int i=0;i<t;i++) {if(!x.containsKey(m[0][i])) {x.put(m[0][i],1);}}
		    	  for(int i=1;i<n;i++)
		    	  {
		    		  for(int j=0;j<t;j++)
		    		  {
		    			  if(x.containsKey(m[i][j])&&(x.get(m[i][j])+1)==i) {x.put(m[i][j],i);
		    			  if(i==t-1)System.out.println(m[i][j]);
		    			  }
		    		  }
		    	  }
		      }
		      //
			}
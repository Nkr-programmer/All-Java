package leetcode;

import java.util.*;

public class BBabber {
	  public class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	  }
	  
	   public class TreeNode {
	       int val;
	       TreeNode left;
	       TreeNode right;
	       TreeNode() {}
	       TreeNode(int val) { this.val = val; }
	       TreeNode(int val, TreeNode left, TreeNode right) {
	           this.val = val;
	           this.left = left;
	           this.right = right;
	       }
	   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N =6;
			int 	S[] = {1,3,0,5,8,5};
			int 	F[] = {2,4,6,7,9,9};
System.out.println(   maxMeetings(S,F,N));
imple();
	}
//1) array  344. Reverse String
	 public void reverseString(char[] word) {
		    
	        int i = 0;
	        int j = word.length - 1;
	        while (i < j) {
	            word[i] = (char) (word[i] ^ word[j]);
	            word[j] = (char) (word[i] ^ word[j]);
	            word[i] = (char) (word[i] ^ word[j]);
	            i++;
	            j--;
	        }
	    }
//3) String is same as 1
//4) Binary Search    34. Find First and Last Position of Element in Sorted Array
	 public int[] searchRange(int[] num, int target) {
	        if(num.length==0)return new int[]{-1,-1};
	       
	       int i=0,j=num.length-1,fir=0,las=0;
	       las= checkr(i,j,target,num);
	       fir= checkl(i,j,target,num);
	        
	        
//	        System.out.println(fir+" "+las);
	        return new int[]{fir,las};
	    }
	 
	    
	       public static int checkl(int i,int j,int t,int[] num){
	        if(i+1==j&&num[i]<t&&num[j]>t)return-1;
	           if((num[i]<t&&num[j]<t)||(num[i]>t&&num[t]>t))return -1;
	           
	           
	            if(i-1>=0&&num[i]==t&&num[i-1]!=t){return i;}
	 else   if(i-1<0&&num[i]==t){return i;}
	        
	        if(j-1>=0&&num[j]==t&&num[j-1]!=t){return j;}
	 else   if(j==0&&num[j]==t){return j;}
	        
	  
	        int mid= (i+j)/2;
	       int g=0; 
	        if(num[mid]==t&&num[mid-1]!=t)return mid;      
	 else   if(num[mid]<t){g=checkl(mid,j,t,num);}
	 else   if(num[mid]>=t){g=checkl(i,mid,t,num);}
	        
	        return g;       
	    }
	    
	    public static int checkr(int i,int j,int t,int[] num){
	        if(i+1==j&&num[i]<t&&num[j]>t)return-1;
	        if((num[i]<t&&num[j]<t)||(num[i]>t&&num[t]>t))return -1;
	        
	        int n=num.length;
	        if(i+1<n&&num[i]==t&&num[i+1]!=t){return i;}
	 else   if(i+1>=n&&num[i]==t){return i;}
	        
	        if(j+1<n&&num[j]==t&&num[j+1]!=t){return j;}
	 else   if(j==n-1&&num[j]==t){return j;}
	        
	       // System.out.println(i+" "+j);      
	        int mid= (i+j)/2;
	       int g=0; 
	        if(num[mid]==t&&num[mid+1]!=t)return mid;      
	 else   if(num[mid]<=t){g=checkr(mid,j,t,num);}
	 else   if(num[mid]>t){g=checkr(i,mid,t,num);}
	        
	        return g;    
	    }
//5)   Linked list 206. Reverse Linked List
	   
	    public ListNode reverseList(ListNode head) {
	        if(head==null)return null;
	        if(head.next==null)return head;
	    ListNode x=null,y=null;
	        while(head.next!=null)
	        {
	            x=head.next;
	            head.next=y;
	            y=head;
	            head=x;
	        }
	    head.next=y;
	    
	    return head;
	    }	
//recursive
	    public ListNode reverseList2(ListNode head) {
	        return re(head,null,null);
	        }	
	        
	        public static ListNode re(ListNode head,ListNode x,ListNode y)
	        {
	            if(head==null)return head; 
	             if(head.next==null){head.next=y;return head;}
	           
	            x=head.next;
	                head.next=y;
	                y=head;
	                head=x;
	            return re(head,x,y);
	        }    
	        	    
//6)	Tree 102. Binary Tree Level Order Traversal
	        public List<List<Integer>> levelOrder(TreeNode root) {
	            List<List<Integer>> ans= new ArrayList<>(); 
	               if(root==null)return  ans;
	               Queue<TreeNode> temp= new LinkedList<>();
	               temp.add(root);
	               TreeNode f= null;
	               while(!temp.isEmpty())
	               {
	              int size=temp.size();   
	                   List<Integer>x= new ArrayList<Integer>();
	                   
	                   for(int i=0;i<size;i++)
	                   {
	                        f=temp.remove();
	                  if(f.left!=null)temp.add(f.left);
	                  if(f.right!=null)temp.add(f.right);
	                 x.add(f.val);
	                   }
	        ans.add(x);       
	               }
	               return ans;
	           }
//7) BST  700. Search in a Binary Search Tree
	        // SEARCHING
	        public TreeNode searchBST(TreeNode root, int val) {
	        if(root==null)return root;
	        TreeNode g=null;
	        if(root.val==val)return root;
	        else if(root.val>val)g=searchBST(root.left,  val);
	        else if(root.val<val)g=searchBST(root.right,  val);
		
	    return g;
	    }
	        //701. Insert into a Binary Search Tree
	        //INSERTION
	        public TreeNode insertIntoBST(TreeNode root, int val) {
	        	if(root==null){TreeNode f= new TreeNode(val);return f;}
	        	if(root.val>val){root.left=insertIntoBST(root.left,  val);}
	        	else if(root.val<val){root.right=insertIntoBST(root.right,  val);}
	        	return root;
	        	}
//15) BM   191. Number of 1 Bits
	        // Bit Masking
	        public int hammingWeight(int nt){
	            int mask=1,count=0;
	            
	            for(int i=0;i<32;i++)
	            {
	                if((nt  &  mask)!=0){count++;}mask<<=1;
	            }
	            
	            return count;
	        }
// Bit Method
	        public int hammingWeight2(int nt){
	            int mask=1,count=0;
	            
	       while(nt!=0)
	            { nt=nt & nt-1;count++;}   
	            return count;
	       
	        }
//2) Matrix   54. Spiral Matrix
	        public List<Integer> spiralOrder(int[][] m) {
	            int r=m.length,c=m[0].length;
	            List<Integer>x= new ArrayList<Integer>();
	        spiral(x,m,0,c-1,0,r-1);
	            return x;
	        }
	        public static void spiral(List<Integer>x,int[][] m,int c0,int c,int r0,int r)
	        {
	            if(c0>c&&r0>r)return;
	           if(r0<=r) {for(int i=c0;i<=c;i++){x.add(m[r0][i]);}}r0++;
	               if(c0<=c){for(int j=r0;j<=r;j++){x.add(m[j][c]);}}c--;
	               if(r0<=r){for(int j=c;j>=c0;j--){x.add(m[r][j]);}}r--;
	               if(c0<=c){for(int i=r;i>=r0;i--){x.add(m[i][c0]);}}c0++;
	            spiral(x,m,c0,c,r0,r);
	        }   
//8) Greedy N meetings in one room	    
//wrong

	        static class value{
	    	   	        	int x;
	    	   	        	int y;
	    	   	        	value(int x,int y){this.x=x;this.y=y;   }
	    	   	        }
	    	   	   static  class StockComparator implements Comparator<value> {
	    	   	        	  
	    	   	            // override the compare() method
	    	   	            public int compare(value s1, value s2)
	    	   	            {
	    	   	                if (s1.y == s2.y)
	    	   	                    return 0;
	    	   	                else if (s1.y > s2.y)
	    	   	                    return 1;
	    	   	                else
	    	   	                    return -1;
	    	   	            }
	    	   	        }
	    	   	        public static  int maxMeetings(int s[], int e[], int n)
	    	   	        {
	    	   	      List<value>arr=new ArrayList<value>();
	    	   	      arr.clear();
	    	   	            for(int i=0;i<s.length;i++)
	    	   	            {
	    	   	            	arr.add(new value(s[i], e[i]));
	    	   	            }
	    	   	            Collections.sort(arr, new StockComparator());
//	    	   for(value x:arr)
//	    	   	            System.out.println(x.x+" "+x.y);
	    	   	            int max=1,i=0;
	    	  int temp=1;
	    	       int k=i;
	    	       for(int j=i+1;j<s.length;j++)
	    	       {
	    	           if(arr.get(k).y<arr.get(j).x){temp++;k=j;}
	    	       }
	    	   if(temp>max){max=temp;}
	    	   
	    	   	    return max;
	    	   	        } 
//10 Stack Implement stack from scratch
	    static 	class stack{
	    		int max=100;
	    		int arr[];
	    		int top;
	    		stack(int max){this.max=max;
	    			arr= new int[this.max];
	    		top=-1;
	    		}
	    		void push(int val) {if(isFull()) {System.out.println("Array is already fulled");return;}arr[++top]=val;}
	    		int pop() {if(isEmpty()) {System.out.println("Array is already emptied");return -100;}int temp=arr[top--];return temp;}
	    		boolean isEmpty() {if(top==-1)return true;else return false;}
	    		boolean isFull() {if(top==max-1)return true;else return false;}
	    	    int Peek() {if(isEmpty()||isFull()) {System.out.println("Not Possible");return -100;}else return arr[top];} 
	    	}
public static void  imple() {
	int max=5;
	stack s= new stack(max);
	s.push(10);
	s.push(20);
	s.push(30);
	s.push(40);
	s.push(50);
	s.push(60);
	System.out.println(s.pop());
	System.out.println(s.pop());
	System.out.println(s.pop());
	System.out.println(s.pop());
	System.out.println(s.pop());
	System.out.println(s.pop());
	System.out.println(s.Peek());
	
	
	
}
}
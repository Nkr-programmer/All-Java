package matrixes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Stack;

public class q37to46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	// 1
	public List<Integer> spiralOrder(int[][] m) {
		int r = m.length, c = m[0].length;
		List<Integer> x = new ArrayList<Integer>();
		spiral(x, m, 0, c - 1, 0, r - 1);
		return x;
	}

	public static void spiral(List<Integer> x, int[][] m, int c0, int c, int r0, int r) {
		if (c0 > c && r0 > r)
			return;
		if (r0 <= r) {
			for (int i = c0; i <= c; i++) {
				x.add(m[r0][i]);
			}
		}
		r0++;
		if (c0 <= c) {
			for (int j = r0; j <= r; j++) {
				x.add(m[j][c]);
			}
		}
		c--;
		if (r0 <= r) {
			for (int j = c; j >= c0; j--) {
				x.add(m[r][j]);
			}
		}
		r--;
		if (c0 <= c) {
			for (int i = r; i >= r0; i--) {
				x.add(m[i][c0]);
			}
		}
		c0++;
		spiral(x, m, c0, c, r0, r);
	}

	// 2
	// O(m+n )
	public boolean searchMatrix(int[][] matrix, int target) {
		int i = 0, j = 0;
		while (i < matrix.length - 1) {
			if (matrix[i][0] == target || matrix[i + 1][0] == target) {
				return true;
			}
			if (matrix[i + 1][0] > target) {
				break;
			} else if (matrix[i + 1][0] < target) {
				i++;
			}
		}
		while (j < matrix[0].length - 1) {
			if (matrix[i][j] == target || matrix[i][j + 1] == target) {
				return true;
			}
			if (matrix[i][j + 1] > target) {
				return false;
			} else if (matrix[i][j + 1] < target) {
				j++;
			}
		}
		return matrix[i][j] == target;
	}

	// O(log(m)+log(n))
	public boolean searchMatrixs(int[][] m, int t) {
		int i = 0, j = m.length - 1, i1 = 0, j1 = m[0].length - 1;

		if (m[j][0] > t) {
			while (i < j) {
				int mid = (i + j) / 2;
				if (m[i][0] == t || m[j][0] == t || m[mid][0] == t) {
					return true;
				}
				if (i == mid)
					break;
				if (m[mid][0] < t) {
					i = mid;
				} else if (m[mid][0] > t) {
					j = mid;
				}
			}
		} else {
			i = j;
		}
		while (i1 < j1) {
			int mid = (i1 + j1) / 2;
			if (m[i][i1] == t || m[i][j1] == t || m[i][mid] == t) {
				return true;
			}
			if (i1 == mid)
				break;
			if (m[i][mid] < t) {
				i1 = mid;
			} else if (m[i][mid] > t) {
				j1 = mid;
			}
		}
		return m[i][i1] == t;
	}
	// 3
	//median in a row wise sorted matrix
    int median(int m[][], int r, int c) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<r ; i++)
        {if(m[i][0] < min)
                min = m[i][0];
           if(m[i][c-1] > max)
                max = m[i][c-1];
        }
         
        int desired = (r * c + 1) / 2;
        while(min < max)
        {
            int mid = min + (max - min) / 2;  
         int place=0,get=0;
         for(int i=0;i<r;i++){
         get=Arrays.binarySearch(m[i],mid);
         if(get<0){get= Math.abs(get)-1;}
         else{
             while(get<m[i].length&&m[i][get]==mid)
             {get++;}
         }
         place+=get;
         }
         if(place<desired){min=mid+1;}
         else{max=mid;}
               
        }  
  return min;  }

	// 4
	// Row with max 1s
	// O(m+n) O(1)
	int rowWithMax1s(int arr[][], int n, int m) {
		int i = 0, j = m - 1, max = -1;
		while (i < n) {
			if (arr[i][j] == 0) {
				i++;
			} else if (arr[i][j] == 1) {
				j--;
				if (j == -1) {
					return i;
				}
				max = Math.max(max, i);
			}
		}
		return max;
	}

	// 5
	// print elements in sorted order using row column wise sorted matrix
	// O(n2log(n)) O(n2)
	public static class Element implements Comparable<Element> {
		int row, col, val;

		public Element(int row, int col, int val) {
			this.row = row;
			this.col = col;
			this.val = val;
		}

		@Override
		public int compareTo(Element e) {
			return this.val - e.val;
		}
	}

	int[][] sortedMatrix(int n, int matrix[][]) {
		PriorityQueue<Element> q = new PriorityQueue<Element>();

		// add first row into the priority queue
		for (int i = 0; i < matrix[0].length; i++)
			q.add(new Element(0, i, matrix[0][i]));
		int[][] x = new int[n][n];
		int i1 = 0, j1 = 0, c = 0;
		for (int i = 0; i < (n * n); i++) {
			Element e = q.poll();
			x[(int) (c / n)][c % n] = e.val;
			c++;
			if (e.row + 1 < matrix.length)
				q.add(new Element(e.row + 1, e.col, matrix[e.row + 1][e.col]));
		}
		return x;
	}

//6
//      Segment tree for sum of all values
	static class SegmentTree {
		// Construction
		int st[];

		SegmentTree(int arr[], int n) {
			int x = (int) (Math.ceil(Math.log(n) / Math.log(2)));
			int max_size = 2 * (int) Math.pow(2, x) - 1;
			st = new int[max_size]; // Memory allocation
			constructSTUtil(arr, 0, n - 1, 0);
		}

		int constructSTUtil(int arr[], int ss, int se, int si) {
			if (ss == se) {
				st[si] = arr[ss];
				return arr[ss];
			}
			int mid = getMid(ss, se);
			st[si] = constructSTUtil(arr, ss, mid, si * 2 + 1) + constructSTUtil(arr, mid + 1, se, si * 2 + 2);
			return st[si];
		}

		int getMid(int s, int e) {
			return s + (e - s) / 2;
		}

//Update ^
		void updateValueUtil(int ss, int se, int i, int diff, int si) {
			if (i < ss || i > se)
				return;
			st[si] = st[si] + diff;
			if (se != ss) {
				int mid = getMid(ss, se);
				updateValueUtil(ss, mid, i, diff, 2 * si + 1);
				updateValueUtil(mid + 1, se, i, diff, 2 * si + 2);
			}
		}

		void updateValue(int arr[], int n, int i, int new_val) {
			if (i < 0 || i > n - 1) {
				System.out.println("Invalid Input");
				return;
			}
			int diff = new_val - arr[i];
			arr[i] = new_val;
			updateValueUtil(0, n - 1, i, diff, 0);
		}

		public static void main(String args[]) {
			int arr[] = { 1, 3, 5, 7, 9, 11 };
			int n = arr.length;
			SegmentTree tree = new SegmentTree(arr, n);
			System.out.println("Sum of values in given range = " + tree.getSum(n, 1, 3));
			tree.updateValue(arr, n, 1, 10);
			System.out.println("Updated sum of values in given range = " + tree.getSum(n, 1, 3));
		}

		// GET Sum feature
		int getSum(int n, int qs, int qe) {
			if (qs < 0 || qe > n - 1 || qs > qe) {
				System.out.println("Invalid Input");
				return -1;
			}
			return getSumUtil(0, n - 1, qs, qe, 0);
		}

		int getSumUtil(int ss, int se, int qs, int qe, int si) {
			if (qs <= ss && qe >= se)
				return st[si];
			if (se < qs || ss > qe)
				return 0;
			int mid = getMid(ss, se);
			return getSumUtil(ss, mid, qs, qe, 2 * si + 1) + getSumUtil(mid + 1, se, qs, qe, 2 * si + 2);
		}
	}

	// Segment tree for min
	// Largest Rectangular Area in a Histogram
	static class SegmentTreeRMQ {
		int st[];

		int minVal(int x, int y) {
			return (x < y) ? x : y;
		}

		int getMid(int s, int e) {
			return s + (e - s) / 2;
		}

		int RMQUtil(int ss, int se, int qs, int qe, int index) {
			if (qs <= ss && qe >= se)
				return st[index];
			if (se < qs || ss > qe)
				return Integer.MAX_VALUE;
			int mid = getMid(ss, se);
			return minVal(RMQUtil(ss, mid, qs, qe, 2 * index + 1), RMQUtil(mid + 1, se, qs, qe, 2 * index + 2));
		}

		int RMQ(int n, int qs, int qe) {
			if (qs < 0 || qe > n - 1 || qs > qe) {
				System.out.println("Invalid Input");
				return -1;
			}
			return RMQUtil(0, n - 1, qs, qe, 0);
		}

		int constructSTUtil(int arr[], int ss, int se, int si) {
			if (ss == se) {
				st[si] = arr[ss];
				return arr[ss];
			}
			int mid = getMid(ss, se);
			st[si] = minVal(constructSTUtil(arr, ss, mid, si * 2 + 1), constructSTUtil(arr, mid + 1, se, si * 2 + 2));
			return st[si];
		}

		void constructST(int arr[], int n) {
			int x = (int) (Math.ceil(Math.log(n) / Math.log(2)));
			int max_size = 2 * (int) Math.pow(2, x) - 1;
			st = new int[max_size]; // allocate memory
			constructSTUtil(arr, 0, n - 1, 0);
		}

		public static void main(String args[]) {
			int arr[] = { 1, 3, 2, 7, 9, 11 };
			int n = arr.length;
			SegmentTreeRMQ tree = new SegmentTreeRMQ();

// Build segment tree from given array
			tree.constructST(arr, n);
			int qs = 1; // Starting index of query range
			int qe = 5; // Ending index of query range
			System.out.println("Minimum of values in range [" + qs + ", " + qe + "] is = " + tree.RMQ(n, qs, qe));
//rectangular sum histogram
			System.out.println(
					"Minimum of values in range [" + qs + ", " + qe + "] is = " + tree.getSum(arr, n, 0, n - 1));

		}

		private int getSum(int[] arr, int n, int i, int j) {
			if (i > j)
				return Integer.MIN_VALUE;
			if (i == j)
				return arr[i];
			int mid = RMQ(n, i, j);
			return Math.max(getSum(arr, n, i, mid), Math.max(getSum(arr, n, mid + 1, j), (j - i + 1) * arr[mid]));
		}
	}

//Max rectangle
//O(r*c)
	public int maxArea(int A[][], int R, int C) {
		int result = maxHist(R, C, A[0]);

		for (int i = 1; i < R; i++) {
			for (int j = 0; j < C; j++) {
				if (A[i][j] == 1)
					A[i][j] += A[i - 1][j];
			}
			int max = maxHist(R, C, A[i]);
			result = Math.max(result, max);
		}

		return result;
	}

// ans of largest histogram area also O(n)   
	private static int maxHist(int r, int c, int[] is) {
		Stack<Integer> x = new Stack<Integer>();
		int tp = 0, area = 0, i = 0, max_area = 0;
		while (i < c) {
			if (x.empty() || is[x.peek()] <= is[i]) {
				x.push(i++);
			} else {
				tp = x.pop();
				area = is[tp] * (x.empty() ? i : i - x.peek() - 1);
				max_area = Math.max(area, max_area);
			}
		}
		while (x.empty() == false) {
			tp = x.pop();
			area = is[tp] * (x.empty() ? i : i - x.peek() - 1);
			max_area = Math.max(area, max_area);
		}

		return max_area;
	}

	// 7
	// Find a specific pair in a matrix
	// O(n2) O(n2)
	public static int pairs(int arr[][], int n) {
		int max = arr[n - 1][n - 1];
		for (int i = n - 2; i >= 0; i--) {
			max = Math.max(max, arr[n - 1][i]);
			arr[n - 1][i] = max;
		}
		for (int i = n - 2; i >= 0; i--) {
			max = Math.max(max, arr[i][n - 1]);
			arr[i][n - 1] = max;
		}
		int maxom = Integer.MAX_VALUE;
		for (int i = n - 2; i >= 0; i--)
			for (int j = n - 2; j >= 0; j--) {
				maxom = Math.max(maxom, arr[i + 1][j + 1] - arr[i][j]);
				arr[i][j] = Math.max(arr[i][j], Math.max(arr[i][j + 1], arr[i + 1][j]));
			}
		return maxom;
	}

	// 8 Rotate a matrix by 90 degree
	// O(n2) O(1)
	public static void rotate(int[][] m) {
		int n = m.length;
		for (int i = 0; i < n / 2; i++)
			for (int j = i; j < n - 1 - i; j++) {
				int t = m[i][j];
				m[i][j] = m[n - 1 - j][i];
				m[n - 1 - j][i] = m[n - 1 - i][n - 1 - j];
				m[n - 1 - i][n - 1 - j] = m[j][n - 1 - i];
				m[j][n - 1 - i] = t;
			}
	}

	// just need to print
	public static void rotatePrint(int[][] m) {
		int n = m.length;
		for (int i = 0; i < n; i++)
			for (int j = n - 1; j >= 0; j--) {
				System.out.print(m[j][i]);
				System.out.println();
			}
	}

	// Anticlockwise
	static void rotateby90(int m[][], int n) {
		for (int i = 0; i < n / 2; i++)
			for (int j = i; j < n - 1 - i; j++) {
				int t = m[i][j];
				m[i][j] = m[j][n - 1 - i];
				m[j][n - 1 - i] = m[n - 1 - i][n - 1 - j];
				m[n - 1 - i][n - 1 - j] = m[n - 1 - j][i];
				m[n - 1 - j][i] = t;
			}
	}

	// 9
//		      Kth element in Matrix
	// O(n+klog(n)) O(n)
	static class HeapNode {
		int val;
		int r;
		int c;

		HeapNode(int val, int r, int c) {
			this.val = val;
			this.c = c;
			this.r = r;
		}
	}

	static void minHeapify(HeapNode harr[], int i, int heap_size) {
		int l = 2 * i + 1;
		int r = 2 * i + 2;
		int min = i;

		if (l < heap_size && r < heap_size && harr[l].val < harr[i].val && harr[r].val < harr[i].val) {
			HeapNode temp = harr[r];
			harr[r] = harr[i];
			harr[i] = harr[l];
			harr[l] = temp;
			minHeapify(harr, l, heap_size);
			minHeapify(harr, r, heap_size);
		}
		if (l < heap_size && harr[l].val < harr[i].val) {
			HeapNode temp = harr[i];
			harr[i] = harr[l];
			harr[l] = temp;
			minHeapify(harr, l, heap_size);
		}
	}

	public static int kthSmallest(int[][] arr, int n, int k) {
		if (k <= 0 || k > n * n)
			return Integer.MAX_VALUE;
		HeapNode harr[] = new HeapNode[n];
		for (int i = 0; i < n; i++) {
			harr[i] = new HeapNode(arr[0][i], 0, i);

		}
		HeapNode h = new HeapNode(0, 0, 0);

		for (int i = 1; i <= k; i++) {
			// System.out.print(harr[0].val+" ");
			h = harr[0];
			harr[0] = new HeapNode(h.r < n - 1 ? arr[(h.r) + 1][h.c] : Integer.MAX_VALUE, (h.r) + 1, h.c);
			minHeapify(harr, 0, n);
		}

		return h.val;
	}

	// better

	public class elements implements Comparable<elements> {
		int row, col, val;

		public elements(int row, int col, int val) {
			this.row = row;
			this.col = col;
			this.val = val;
		}

		@Override
		public int compareTo(elements e) {
			return this.val - e.val;
		}
	}

	public int kthSmallest(int[][] matrix, int k) {

		PriorityQueue<elements> q = new PriorityQueue<elements>();

		// add first row into the priority queue
		for (int i = 0; i < matrix[0].length; i++)
			q.add(new elements(0, i, matrix[0][i]));

		for (int i = 0; i < k - 1; i++) {
			elements e = q.poll();
			if (e.row + 1 < matrix.length)
				q.add(new elements(e.row + 1, e.col, matrix[e.row + 1][e.col]));
		}

		return q.peek().val;
	}

	// 10
	// Common elements in all rows of a given matrix
	// O(mn) O(n)
	public static void print(int[][] m) {
		HashMap<Integer, Integer> x = new HashMap<Integer, Integer>();
		int n = m.length, t = m[0].length;
		for (int i = 0; i < t; i++) {
			if (!x.containsKey(m[0][i])) {
				x.put(m[0][i], 1);
			}
		}
		for (int i = 1; i < n; i++) {
			for (int j = 0; j < t; j++) {
				if (x.containsKey(m[i][j]) && (x.get(m[i][j]) + 1) == i) {
					x.put(m[i][j], i);
					if (i == t - 1)
						System.out.println(m[i][j]);
				}
			}
		}
	}
	
}
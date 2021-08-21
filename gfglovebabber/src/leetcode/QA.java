package leetcode;

public class QA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
//1)  69. Sqrt(x)
    public int mySqrt(int x) {
    if(x==0)return 0;
        if(x==1)return 1;
        return check(x,0,x);   
    }
    public static int check(int x,int a,int b    )
    {
   
        int mid=(a+b)/2;    
        if(mid==x/mid||(mid<x/mid&&(mid+1)>x/(mid+1)))return mid;
        int ans=0;
        if(mid<x/mid){ans= check(x,mid,b);}
        else if(mid>x/mid){ans= check(x,a,mid);}
    return ans;
    }
    //2)  287. Find the Duplicate Number
    //contion was t O(n)  && S O(1)
    public int findDuplicate(int[] nums) {
        
        int i=nums[0],kn=nums[i];
        while(kn!=0)
        { nums[i]=0;
             i=kn;
        kn=nums[i];
        }
         return i;
    }
//3)   540. Single Element in a Sorted Array
    public int singleNonDuplicate(int[] nums) {
        int i=0,l=nums.length-1;
         if(nums.length==1)return nums[0];
         if(nums[i]!=nums[i+1])return nums[i];
           if(nums[l]!=nums[l-1])return nums[l];
          //System.out.println();
         return check(i,l,nums);
     }
     public static int check(int i,int l,int [] nums)
     {
         int mid=(i+l)/2;
         //System.out.print(mid);
         if(nums[mid]!=nums[mid-1]&&nums[mid]!=nums[mid+1])return nums[mid];
         int g=0;
         if(nums[mid]==nums[mid-1]){g=mid%2==0?check(i,mid,nums):check(mid,l,nums);}
         else  if(nums[mid]==nums[mid+1]){g=mid%2==0?check(mid,l,nums):check(i,mid,nums);}
         
         return g; 
     }
 }


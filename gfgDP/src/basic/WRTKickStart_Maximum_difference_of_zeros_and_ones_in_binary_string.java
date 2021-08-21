package basic;

public class WRTKickStart_Maximum_difference_of_zeros_and_ones_in_binary_string {

	public static void main(String[] args) {
		 String str = "11000010001";
	     char[]v= str.toCharArray();   
		 int n = str.length();
	 int co[]= new int[n];
	 for(int i=0;i<n;i++)
	 {co[i]= v[i]=='0'?1:-1;}
	 System.out.println(maxSubArray(co));
	// kadenes algorithm
	 System.out.println(maxSubArrayk(co));
	}
	private static int maxSubArrayk(int[] co) {
int sum=0,n=co.length,temp=0;
for(int i=0;i<n;i++)
{temp+=co[i];
if(temp<0) {temp=0;}
if(sum<temp) {sum=temp;}	
}
		return sum;
	}
	static int fulls[];
    public static int maxSubArray(int[] nums) {
        fulls=new int[nums.length];fulls[0]=nums[0];
int maxa=fulls[0];
        for(int i=1;i<nums.length;i++)
        {fulls[i]=nums[i]+(fulls[i-1]>0?fulls[i-1]:0);maxa= Math.max(maxa,fulls[i]);}
return maxa;
    }
}
 
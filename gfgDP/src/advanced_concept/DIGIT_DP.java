package advanced_concept;

public class DIGIT_DP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(bruteforce(3,1500000000,1200));
	}

	private static int  bruteforce(int i, int j, int k) {
	int res=0;
	for(int num=i;num<j+1;num++){
		if(check(num,k))res++;
	}
		
		
		return res;
	}
	static boolean check(int num,int x) {
		int sum=0;
		while(num!=0) {
			sum+=num%10;
			num/=10;
		}
		if(sum==x)return true;
		else return false;
	}

}

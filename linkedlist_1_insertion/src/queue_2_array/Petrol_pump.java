package queue_2_array;

public class Petrol_pump {

	
	

int petrol;
int distance;
		
	public	Petrol_pump(int petrol,int distance)
	{
		this.petrol=petrol;
		this.distance=distance;
	}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Petrol_pump a[]= {new Petrol_pump(6,6),new Petrol_pump(4,5),new Petrol_pump(1,3),new Petrol_pump(3,5)};
		
		int start=printTour(a,a.length);
		System.out.println(start);
		
		
		
	}


	private static int printTour(Petrol_pump[] a, int length) {
		
		
	int start=0;
	int end= 1;
	int remain_petrol=a[0].petrol-a[0].distance;
	
	
	while(end%length!=start || remain_petrol<0)
	{
		while(remain_petrol<0)
		{start=start%length;
		end=start+1;
		remain_petrol=a[start].petrol-a[start].distance;
		
		}
		
		
		remain_petrol =remain_petrol + a[end%length].petrol-a[end%length].distance;
		end++;
		if(start%length==0)
		{
			return -1;
		}
	}
	
	
		return start;
	}

}

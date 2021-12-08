package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//class Student implements Comparable<Student> {  
//    public String name;  
//  public Student(String name) {  
//    this.name = name;  
//  }  
  


class Brand implements Comparable<Brand>{
	private String model;
	private Integer speed;
	public Brand(String model,Integer speed) {this.model=model;this.speed=speed;}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Integer getSpeed() {
		return speed;
	}
	public void setSpeed(Integer speed) {
		this.speed = speed;
	}
	@Override
	public int compareTo(Brand o) {
		 return speed.compareTo(o.speed); } 
	}


class BrandImplementation{
	public List<Brand> sortbySpeed(List<Brand> list){
		Collections.sort(list);
		return list;
	}
public long getCount(List<Brand>list) {
	long c=0;
	for(Brand x:list)
	{
		if(x.getSpeed()>200)c++;
	}
return c;
}
}
public class xyz {

public static void main(String atgd[])
{
List<Brand> list =new ArrayList<>();
list.add(new Brand("SUV",500));
list.add(new Brand("SEDAN",800));

}		
}

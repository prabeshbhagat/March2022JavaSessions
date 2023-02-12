package Java11;

public class Car {
	
	
	String name;
	String color;
	int price;
	//int wheels;
	static int wheels=4;
	//static variable will never be stored inside the object
	//--It will be stored in CMA(common memmory allocation)
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1=new Car();
		c1.name="BMW";
		c1.color="Red";
		c1.price=30;
		//c1.wheels=4;
		//made the wheels as static and it can be used anywhere
		
		Car c2=new Car();
		c2.name="Audi";
		c2.color="Black";
		c2.price=40;
		//c2.wheels=4;
		
		Car c3=new Car();
		c3.name="Honda";
		c3.color="White";
		c3.price=50;
		//c3.wheels=4;
		
		//for the above code the common thing is wheel=4 even if we 
		//--create 100 objects (common property value)
		System.out.println(c1.color+" "+c1.name+" "+c1.price);
		
		//How to access static variables.
		//1.by using class name
		System.out.println(Car.wheels );
		
		//2.use it directly
		System.out.println(wheels);
		//System.out.println(color);
		//--not possible as it is present inside an object
		
		//3. can we access  static variable using object ref
		//yes but it will give warning to access it in a static way

		//System.out.println(c1.wheels);
		//The static field Car.wheels should be accessed in a static way
	}

}

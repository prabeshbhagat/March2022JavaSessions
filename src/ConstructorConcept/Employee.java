package ConstructorConcept;

public class Employee {
	
	/*
	 * 
	 */
	String name;
	double sal;
	boolean isPerm;
	int age;

	public Employee() {
		System.out.println("default constructor...");
	}

//	Duplicate constructor
//	public Employee() {
//		 System.out.println("default constructor...");
//		}
	
	
//	public Employee(int i) {
//		System.out.println("one param constructor..."+i);
//	}
//	
//	
//	public Employee(int i,String j) {
//		System.out.println("two params constructor..."+i);
//	}
	
	//this looks ugly name1,sal1
	//for this we will use this keyword
	// this keyword is used to initilize class variable with local variable.
	//this keyword is also used to differentiate local variable with the class variable.
	public Employee(String name1,Double sal1) {
		name=name1;
		sal=sal1;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

//		Employee e1= new Employee();
//		e1.name="Tom";
//		e1.sal=12.33;
//		e1.isPerm=true;
//		e1.age=26;
//		
//		
//		Employee e2= new Employee();
//		e1.name="Peter";
//		e1.sal=15.33;
//		e1.isPerm=false;
//		e1.age=30;

		// in the above we have to write same code again & again
		// to avoid this we will use a constructor .

		Employee e1 = new Employee();
		// The moment you create the object default constructor will be called.
		
		//constructor overloading.
//		Employee e2 = new Employee(10);
//		Employee e3 = new Employee(10,"Hooda");
		
		//Prblem came to overcome we use this keyword.
		Employee e3 = new Employee("Hardik",12.33);
		System.out.println(e3.name+"  "+e3.sal);
		System.out.println(e3.name+"  "+e3.sal+" "+e3.age+" "+e3.isPerm);
		
		//with constructor we are restricting the object creation in different ways
		//only the type of constructor we create the same kind of object can be created.
		
		
		/*
		 * fhsjfajs
		 * 
		 */
	

	}

}

package ConstructorConcept;

public class User {
	
	int empId;
	int age;
	
	public User(int empId, int age, String name) {
		this.empId = empId;
		this.age = age;
		this.name = name;
	}
	
	public User(int empId, String name, boolean isTrue) {
		this.empId = empId;
		this.name = name;
		this.isTrue = isTrue;
	}


	public User(int empId, int age, String name, boolean isTrue) {
		this.empId = empId;
		this.age = age;
		this.name = name;
		this.isTrue = isTrue;
	}








	String name;
	boolean isTrue;
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//User u1=new User();//This is not possible as costructor is restricting
		//int empId, int age, String name
		User u2=new User(100,25,"Neel");
		System.out.println(u2.age+"  "+u2.name+" "+u2.empId);
		

	}

}

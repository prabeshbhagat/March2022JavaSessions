package Java11;

public class MainMethodOverloading {

	public void main() {
		System.out.println("Main 1 method");
	}
	
	public void main(String a ) {
		System.out.println("Main 2 method  "+ a);
	}
	
//	public static void main() {
//		System.out.println("Main 1 method");
//	}
//	
//	public static void main(String a ) {
//		System.out.println("Main 2 method"+ a);
//	}
//	
	//java will always search for main method with array of arguments
	//Main method can be overloaded
	
	//public static void main(String[]t)
	//--the above one is also fine as only variable name is changed
	//--variable name t can be anything
	//JVM is calling main method with No values in array, blank array
	//--to pass values we have to use command line arguments
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is my Java code");
		MainMethodOverloading obj=new MainMethodOverloading();
		obj.main("Testing");
	}
	
	//not allowed 
//	public static void main(String[] a) {
//		// TODO Auto-generated method stub
//		System.out.println("This is my Java code");
//	}
	
	public static void main(int[] args) {
		// TODO Auto-generated method stub
		System.out.println(" Java code");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

package Java_10;

public class Ecomm {

// The below thing is not allowed its a duplicate method
//	public void tests() {
//		System.out.println("Test method");
//	}
//	
//	public void tests() {
//		System.out.println("Test method");
//	}

	// The below thing is not allowed its a duplicate method
//		public void tests(int a) {
//			System.out.println("Test method");
//		}
	//
//		public void tests(int b) {
//			System.out.println("Test method");
//		}

	/*
	 * //Method inside a method is also not allowed public void tests() {
	 * System.out.println("Test method");
	 * 
	 * public void tests() { System.out.println("Test method"); } }
	 */

	/*
	 * Creating a method inside a method is also not allowed public static void
	 * main(String[] args) { public void tests() {
	 * System.out.println("Test Method"); } }
	 */

	// @@Interview MethodOverloading(Ploymorphism) poly(many) +
	// --morphism(different forms of same method)
	// The above type is complie time polymorphism(MethodOverloading)
	// the above is also called as static polymorphism
	// why it is called complie time polymorphim beacuse complier--
	// --is deciding which method to be called

	// Method Overloading & Method Overridding are Ploymorphism
	// What is the defination.
	// Method overloading happens within the same class we have number of methods
	// 1.With the same name
	// 2.different number of parameters
	// 3.different types of params
	// 4.Sequence of parameter is different
	// --5. return does not matter in Method overloading

	// In python there is no complier at runtime everything happens thats why it is
	// slow compared to java
	// java has its own complier
	// 1st java code is compiled(80% work is done)--
	// --than at runtime we will get output(20% will be done in runtime)

	// Advantage of Method Overloading
	// 1.. Better structured code is written
	// examples of Method overloading of amazon login page ecomm application

	// Note:
	// CC number ,ssn number ,aadhar number are of type String instead of
	// integer, as we are not doing any multiplication or substartcion

	public void login() {

	}

	public void login(String UN, String Pwd) {

	}

	public void login(String UN, String Pwd, int otp) {

	}

	public void login(String UN, String Pwd, String role) {

	}

	// Search method
	public void search() {
		// 1000 Products
	}

	public void search(String Productname) {
		// Result will be 100 Product based on Product name
	}

	public void search(String Productname, int price) {
		// 80
	}

	public void search(String Productname, int price, String color) {
		// 50
	}

	public void search(String Productname, int price, String color, String seller) {
		// 10
	}

	public void test() {// 0 Param
		System.out.println("Test Method with 0 param");
	}

//	public void test(int a) {//1 Param
//		System.out.println("Test Method with 1 param");
//	}

	public int test(int b) {// 1 Param
		System.out.println("Test Method with 1 param");
		return 10;
	}

//	public int test(int b) {//Not method overloading
//		System.out.println("Test Method with 1 param");
//		return 10.88;
//	}

	public double test(double a) {// 1 Param
		System.out.println("Test Method with 1 param");
		return a + 202;
	}

//	public void test(int b) {//Not allowed
//		System.out.println("Test Method with 1 param");
//	}

	public void test(int a, int b) {// 2 Param
		System.out.println("Test Method with 2 param" + (a + b));
	}

	public void test(String a, int b) {// 2 Param
		System.out.println("Test Method with 2 param" + (a + b));
	}

	public void test(int a, String b) {// 2 Param
		System.out.println("Test Method with 2 param" + (a + b));
	}

	// Uber App
	public void bookingApp(String Source, String Destination) {
		System.out.println("The source & Destination" + Source);
	}

	public void bookingApp(String Source, String Destination, String Cartype) {

	}

	public void bookingApp(String Source, String Destination, String Cartype, int noOfPassenger) {

	}

	// overload do payment Method
	public void doPayment(String CC,int cvv) {

	}

	public void doPayment(String cc,int cvv,int otp) {

	}
	
	public void doPayment(String upi) {

	}
	
	
	

	public static void main(String[] args) {

		System.out.println("****" + args.length);// 0
		//The above will give you a number as length is number so its a 0
		System.out.println("****" + args[0]);// AIOB
		//for above when length is 0 there is no box no space,a[0]not even exists
		
		// TODO Auto-generated method stub

		// Duplciate method creation is not allowed
		// To create a Method inside a method is also not allowed.
		// Creating a method inside a main method is also not allowed

		// Decison is taken during the complie time regarding which method to--
		// call
		Ecomm e = new Ecomm();
		e.test();
		double d1 = e.test(12.66);
		System.out.println(d1);
		e.test(10, "Testing");

		// Decison is always take at the complie time
		// There are 2 states in Java
		// 1.Complie Time(.class file generation)
		// 2..Run tIme

		e.bookingApp("Patia", "Cuttack");

		// How backend works:
		// there are apis (i.e methods booking app method)which is in backend
		// user is non technical guy user wont call backend
		// user will open app or will open application to book cab
		// user will hit server(uber.com)
		// the code is deployed in the server
		// the server will call the apis over the internet
		// the api called over the internet is called webservice
		// the api will respond back to server then i(user) ll get response in the webportal

		// @@assignment (try--Can we overload the main method or not)

	}

}

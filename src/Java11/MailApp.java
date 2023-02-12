package Java11;

public class MailApp {
	
	
	int price;//java will store copy of the price variable
	//--inside the new MailApp() object.
	static String name="gmail";

	public  void sendmail() {////java will store copy of the sendmail method
		//--inside the new MailApp() object.
		System.out.println("Send Mail");
	}

	public static void sendInfo() {//CMA (static method will be stored inside CMA)
		System.out.println("Send Info");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//How to call/access non static method:
		//Static method is stored inside Metaspace,even static variales.
		//1.By Creating Object:
		
		MailApp m1=new MailApp();
		m1.sendmail();
		//sendmail method cannot be called by class name.
		
		//How to call /access non static method 
		//1.by using class name
		
		MailApp.sendInfo();//CMA (static method will be stored inside CMA)

		//2.Directly by calling method name 
		sendInfo();
		
		//3.By using object reference.
		m1.sendInfo();//you will get warning
		//accesing static method using object reference.
		//No mechnanism for static method cleaning
		
		//1.where exactly will nbe main method stored.
		//main method will be stored inside the object or CMA?
		//As main method is static in nature it will stored in CMA.
		//QQ-why main method is static in nature?
		//why main method is void in nature?
		// as it will not return anything 
		//Main methd will be called by JVM
		//if main method is non static than JVM has to create the 
		//--object why JVM will create object
		
	    //object creation should be done by user, not by JVM
		
		
		System.out.println(MailApp.name);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

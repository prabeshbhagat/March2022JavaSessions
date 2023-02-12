package Java_10;

import java.util.ArrayList;
import java.util.Arrays;

public class Application {

	// Dynamic array in collection
	// WAF:This will return menu links on the page.
	// param:page Name
	// return type:ArrayList<String>.
	public ArrayList<String> getPageLinks(String pagename) {

		ArrayList<String> menulist = new ArrayList<String>();
		if (pagename.trim().equalsIgnoreCase("loginpage")) {
			menulist.add("Product");
			menulist.add("Categaory");
			menulist.add("Price");
		}

		else if (pagename.trim().equalsIgnoreCase("homepage")) {
			menulist.add("Product");
			menulist.add("Categaory");
			menulist.add("Price");
			menulist.add("cart");
			menulist.add("Search");
		}

		else if (pagename.trim().equalsIgnoreCase("productpage")) {
			menulist.add("Product");
			menulist.add("Category");
			menulist.add("Price");
			menulist.add("cart");
			menulist.add("details");
		}

		else {
			System.out.println("Enter correct pagename..." + pagename);
		}

		return menulist;
	}

	// Static array as the number of device is limited
	// WAF:This will return device list for employees.
	// param:emp name
	// return type:String[].

	public String[] getDeviceList(String empName) {

		String devices[] = new String[5];
		empName = empName.toLowerCase();
		if (empName.equals("sandeep")) {
			devices[0] = "iPhonex";
			devices[1] = "Macbook Pro";
			devices[2] = "Dell Mouse";
		} else if (empName.equals("virat")) {
			devices[0] = "iPhonex";
			devices[1] = "Macbook Air";
			devices[2] = "Airtel Sim";
		} else if (empName.equals("shreyas")) {
			devices[0] = "iPhonex";
			devices[1] = "Lenoovo Laptop";
			devices[2] = "Headset";
		}
		return devices;

	}

	public static void main(String[] args) {

		Application app = new Application();
		// ArrayList<String> list= app.getPageLinks("homepage");
		// ArrayList<String> list= app.getPageLinks("Homepage");//equalsIgnoreCase
		ArrayList<String> list = app.getPageLinks("  Homepage  ");// trim()//corner space
		// ArrayList<String> list = app.getPageLinks("Login page");// User mistake ,dnt
		// consider this,space

		System.out.println(list);

		String[] deviceList = app.getDeviceList("Sandeep");

		// How to print an Array.
		System.out.println(Arrays.toString(deviceList));
	}

}

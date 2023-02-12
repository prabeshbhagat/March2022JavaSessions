package Java_10;

import java.util.ArrayList;
import java.util.Arrays;

public class Assign10 {

	// Static array
	// WAF:This will return page links in a webpage.
	// param:Pagename
	// return type:String[].

	public String[] getPageLink(String Pagename) {
		String menuList[] = new String[5];

		if (Pagename.equalsIgnoreCase("homepage")) {
			menuList[0] = "Products";
			menuList[1] = "Search";
			menuList[2] = "Cart";
			menuList[3] = "Category";
		}

		else if (Pagename.equalsIgnoreCase("loginpage")) {
			menuList[0] = "Products";
			menuList[1] = "company logo";
			menuList[2] = "Footer link";

		} else {
			System.out.println("Please enter the correct pageName.." + Pagename);
		}

		return menuList;

	}

	// AssignMent
	// WAF:This will return device list for employees.
	// param:emp name
	// return type:Arraylist<String>.

	public ArrayList<String> getDevicesList(String empName) {

		ArrayList<String> devices = new ArrayList<String>();
		empName = empName.toUpperCase();
		if (empName.equalsIgnoreCase("SUNIL")) {
			devices.add("Laptop bag");
			devices.add("Optical Mouse");
			devices.add("Boat headset");
		} else if (empName.equalsIgnoreCase("SUBRAT")) {
			devices.add("HP LAptop");
			devices.add("Dell Mouse");
			devices.add("Boat headset");
		} else {
			System.out.println("Please pass the correct empName " + empName);
		}

		return devices;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assign10 empDevice = new Assign10();
		ArrayList<String> empDevices = empDevice.getDevicesList("sunils");
		System.out.println(empDevices);

		String linksList[] = empDevice.getPageLink("Homepage");
		System.out.println(Arrays.toString(linksList));
	}

}

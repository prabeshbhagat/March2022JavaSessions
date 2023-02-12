package JavaPractice;

public class SwitchCaseStatement3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//we will solve the same problem previous one
		//if else if else browser one
		
		String browser="Opera";
		
		//solution 3
		//solution 3 is better than sol 2 inside IFELSE class
		//to generate switch case write Switch and click ctrl space
		switch (browser) {
		case "chrome":
			System.out.println("Launch Chrome");
			break; //break means break the entire switch case
		case "firefox":
			System.out.println("Launch firefox");
			break;
		case "IE":
			System.out.println("Launch IE");
			break;
		case "Safari":
			System.out.println("Launch Safari");
			break;

		default:
			System.out.println("Plz pass the right browser name....");
			break;
		}
		
		//here Key is Browser & Value is IE & sfari or whatever
		//what Java will do it will check the value with all the available case
		//the moment it matches it will execute the code below it & break.
		
		
		//Sol 1 is wrong
		//sol 2 we can use when there is less conditions(statement)
		//sol3 is always good when we have lot of conditions 
		
		
//Q		
		
		//solution 3
		//solution 3 is better than sol 2 inside IFELSE class
		//to generate switch case write Switch and click ctrl space
		
		
		
		//Now we will use the above solution but without break.
		String browser1="firefox";
		switch (browser1) {
		case "chrome":
			System.out.println("Launch Chrome");
			 //break means break the entire switch case
		case "firefox":
			System.out.println("Launch firefox");
			
		case "IE":
			System.out.println("Launch IE");
			
		case "Safari":
			System.out.println("Launch Safari");
			

		default:
			System.out.println("Plz pass the right browser name....");
			break;//this does not has any significance
		}
		
		
		//the above code has bug 
		//there is no comparison in the above code
		// it will always execute the code in sequEntial mode
		
		
		//one more example 
		System.out.println("+++++++++11");
		//Now we will use the above solution but without break.
				String browser2="firefox";
				switch (browser2) {
				case "chrome":
					System.out.println("Launch Chrome%%");
					break;
				case "firefox":
					System.out.println("Launch firefox");
					//break is not there
					//in case satisfies it will break the case.
				case "IE":
					System.out.println("Launch IE");
					break;

				case "Safari":
					System.out.println("Launch Safari");
					break;


				default:
					System.out.println("Plz pass the right browser name....");
					break;//this does not has any significance
				}
				
				//for switch case use of break is mandatory.
				
				
				//
				
				System.out.println("+++++++++");
				
				
				String browser3="CHROME";
//Q				
			switch (browser3.toLowerCase()) {//use of lower case
				case "chrome":
					System.out.println("Launch Chrome");
					break;
				case "firefox":
					System.out.println("Launch firefox");
					//break is not there
					//in case satisfies it will break the case.
				case "ie":
					System.out.println("Launch IE");
					break;

				case "safari":
					System.out.println("Launch Safari");
					break;


				default:
					System.out.println("Plz pass the right browser name....");
					break;//this does not has any significance
				}
				System.out.println("*******************");
				
//Q How to handle extra space with value:Chrome  
//use Trim method(it will remove extra space before & after
				//trim will remove leading & trailing spaces
				
				
				String browser4=" CHROME ";
			switch (browser4.toLowerCase().trim()) {//use of lower case
			case "chrome":
				System.out.println("Launch Chrome");
				break;
			case "firefox":
				System.out.println("Launch firefox");
				//break is not there
				//in case satisfies it will break the case.
			case "ie":
				System.out.println("Launch IE");
				break;

			case "safari":
				System.out.println("Launch Safari");
				break;


			default:
				System.out.println("Plz pass the right browser name....");
				break;//this does not has any significance
			}
			
			
			//In above example we used Switch with String Values
			//can we use Switch case with numeric values
			
			int marks=90;
			switch (marks) {
			case 100:
				System.out.println("Grade A");
				break;
			case 90:
				System.out.println("Grade B");
				break;

			default:
				System.out.println("Fail");
				break;
			}
			
			
			//can we use boolean expression with  case 
			//and int to deaclare a varaiale 
			//lets see the example below
			
			int num=10;
//Q			
//			switch (num<=10) {//Cannot switch on a value of type boolean.
//			//Only convertible int values, strings or enum variables are permitted
//			//case num<=100: // Type mismatch: cannot convert from boolean to int
//				System.out.println("Grade A");
//				break;
//			case 90:
//				System.out.println("Grade B");
//				break;
//
//			default:
//				System.out.println("Fail");
//				break;
//			}
			
			// the above case is not true
			//boolean expression we cannot write with cases
			//Switch cannot handle boolean data
			//we cannot write boolean with Switch & a case
			
			
			//Switch case is not applciable for boolean expression
//QQ			
			//where we will use in our framework in applciation
			//calendar date picker
			//launching the browser
			//Execute code on a specfic environment
			
			//one practical code example
			//is passing of different environment like dev QA Mirror
			
			double d1=12.33;
			double d2=12.34;
			
			if(d1==d2) {
				
			}
			
			//double equal to operator can be used with primitive data type
				
//Q
			//< <= >= == !=
			
			//example of reversing the condition
			
			boolean flag=true;
			
			if(!flag) {
				System.out.println("Bye");
			}
			else {
				System.out.println("Pass");
			}
			
			//there is many example we will see in selenium
			//whenever we are reversing a condition
			//crousal 
			//pagination,whenever an element is dispalyed or not
			//list exmaple ,footer exmaple
			//wait for element example
			
			
			//##Assignment
			//use cases of switch
			//Multiple environment :QA ,stage,dev,prod,
			
			String env="qa";
			
			switch (env) {
			case "qa":
				System.out.println("test cases are runing on QA env");
				break;
			case "dev":
				System.out.println("test cases are runing on dev env");
				break;
				
			case "staging":
				System.out.println("test cases are runing on stage env");
				break;
				
			case "uat":
				System.out.println("test cases are runing on uat env");
				break;
				
				
			case "prod":
				System.out.println("test cases are runing on prod env");
				break;

			default:
				System.out.println("Please pass the correct env");
				break;
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
				
				
				
				
				
				
				
				
				
				
				
				
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

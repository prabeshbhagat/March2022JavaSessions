package JavaPractice;

public class IfElseConditions3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.
		int a=20;//int a=10;
		int b=20;//assignment operator
		//I want to do a comparision between a and b
		if(a>b) {
			System.out.println("a is greater than b");
		}
		else {
			System.out.println("b is greater than or equal to a");
		}
		//if the above condition is true than it will come inside the body
		//its not true that every if have else condition(not mandatory)
		//if should have a condition its represents a boolean
		
		//for primtive data types comparision
		//== operator double equal to
		if(a==b) {//comparison operator
			System.out.println("both are equal");
		}else {
			System.out.println("both are not equal");
		}
		
		//drawing tool in eclipse
		//difference bewtween assignment & comparision operator
		
		
		//Topic1##########dead code example Q;
		// the complier is not able to reach the code (it will never reach & execute )
		if(true) {
			System.out.println("Hi");
		}else		{
			System.out.println("Bye");
		}//dead code
		
		
		if(false) {  //dead code
			System.out.println("Hi");
		}else		{
			System.out.println("Bye");
		}
		
		//new example
		// no warnings why?
		//what is the diff betwwen above e.g & this e.g
		//as in future the flag(value) logic can be changed,hence no warning
	
		//not an example of dead code
		
		boolean flag=true;
		if (flag) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}

	//topic2##########example of nested if	
		
		int number=90;
		if(number<=100) {
				if(number >=90) {
					System.out.println("Grade A");
				}
				if(number<=80) {
					System.out.println("Grade B");
				}else {
					System.out.println("Good Bye");
				}
				//Grade A
				//Grade B
		}else {
			System.out.println("Wrong marks");
		}
		
		int number1=200;
		if(number1<=100) {
			if(number1 >=90) {
				System.out.println("Grade A");
			}
			if(number1>=75) {
				System.out.println("Grade B");
			}
			
	}else {
		System.out.println("Inavlid Number");
	}
		
		
		//Topic 3################example
		//Note : Never user double equal to operator for string comparision as it
		//is a non primitive type
		//use double equal to for primitive data types only
		
		//1st solution
//		String browser="Firefox";//as it is non primitive //Opera
//		if(browser.equals("chrome")) {
//			System.out.println("launch chrome");
//		}
//		
//		//another example
//		
//		if (browser.equals("chrome")) {
//			System.out.println("Launch Chrome");
//		}
//		if(browser.equals("Firefox")) {
//			System.out.println("Launch Firefox");
//		}
//		if(browser.equals("Safari")) {
//			System.out.println("Launch Safari");
//		}
//		if(browser.equals("IE")) {
//			System.out.println("Launch IE");
//		}
//		else {
//			System.out.println("Plz pass the right browser");
//		}
//		
		//for the above case else will execute as it is associated with 
		//the last if statement i.e (IE)
		
		
		
//		// there is many issues with the above code
//		//1st problem many If Conditions if 1st condition (chrome one ) is pass 
//		//uncessarily we are executing the other lines
//		//2nd problem if chrome is passed as a string instead of IE than else part will execute unnessarily
//		//the above is not the right way to write the code
//		
//	ctrl +// to comment
		
		//2nd Solution
	//2nd is better than 1st 
		String browser="chrome";
		if(browser.equals("chrome")) {
			System.out.println("Launch Chrome");
		}
		else if(browser.equals("Firefox")){
			System.out.println("Launch Firefox");
		}
		else if(browser.equals("Safari")) {
			System.out.println("Launch Safari");
		}
		else if(browser.equals("IE")) {
			System.out.println("Launch IE");
		}
		else {
			System.out.println("Plz pass the right broswer..");
			
//Q			//break;break cannot be used outside of a loop or a switch
		}
		
		//even the 2nd solution is not good as to execute suppose IE we have to 
		//execute all above IE codes than come to IE
		//for example if we have 100 lines of code and the condition satisfies in 95th line
		//than above 95th line all condition we have to execute wehich is unnessary 
		
		//the solution for above problem is we have to use Switch Case
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

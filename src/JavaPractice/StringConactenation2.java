package JavaPractice;

public class StringConactenation2 {
	
	//without main method you cannot run the program

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String is a default class available in Java
		//class name starts with capital in java
		//its a non primitive data type
		//
		
		//String s=Hello World; will give error
		String s="Hello World";
		System.out.println(10);//direct variable value we can print
		System.out.println("Hello World");//direct variable value we can print
		String s1="100"; // its not integer type its string type
		String ph="987978888888";
		String cc="1234 5678 9090 1234";
		
		// String is a collection a mutiple characters
		System.out.println(s);
		//What do you mean by String Concatenation & How does it works ?
		
		String x="Hello";
		String y="Testing";
		
		int a=100;
		int b=200;
		
		System.out.println(a+b);//300//Here + is addition operator
		System.out.println(x+y);//HelloTesting//String concatination
		//Here + is concat operator
		
		//What is the difference between concatination and addition
		//concatination means adding two things or merging two things
		
		
		//can i concatinate a string with a numeric value
		System.out.println(x+a);//Hello100
		System.out.println(a+x);//100Hello
		System.out.println(a+b+x+y);//300HelloTesting
		//execution will start from left to right 1st it will add 100+200 than concatenate
		
		System.out.println(x+y+a+b);//HelloTesting100200
		//Hello will be merged with Testing than HelloTesting will be merged with 100
		//it becomes HelloTesting100 than HelloTesting100 will be merged with 200
		//final output is HelloTesting100200
		
		System.out.println(x+y+(a+b));//HelloTesting300//output is due to bracket
		
		System.out.println(x+y+a+b+a+b);//HelloTesting100200100200
		//it will keep concatenating
		
		System.out.println("The Value of a :"+a);//The Value of a :100
		System.out.println("The Value of b :"+b);//The Value of b :200
		System.out.println("The Sum :"+a+b);//The Sum :100200
		System.out.println("The Sum is:"+(a+b));
		
		System.out.println(x+y);
		System.out.println(x+" "+y);

		double c=12.77;
		double d=23.88;
		
		System.out.println(x+y+c+d);
		
		char c1='a';//97
		char c2='b';//98
		
		System.out.println("-----"+c1);
		System.out.println(c1+c2);//195//char comes from numeric family 
		//refer previous session notes
		
		//unicode values //ascci values 
		//a-z:97 to 122
		//A-Z 65 to 90
		//0-9  48 to 57
		System.out.println(c1+""+c2);//ab
		System.out.println(c1+"");//a//no mathematical operation
		System.out.println(x+y+a+b);
		System.out.println(a+b+x+y);
		
		
		
		byte b1=120;
		byte b2=50;
		//byte b3=b1+b2;//The sum of b3 is not within the range of byte
		int b3=b1+b2;
		System.out.println(b3);
		
		
		byte b4=60;
		byte b5=50;
		//byte b6=b4+b5;//tomm if we are changing the value which might go beyond the byte range
		//hence its not allowing
		//short b6=b4+b5;//even this not allowed
		//int b6=b4+b5; //its fine
		System.out.println(b4+b5);//here we are not assigning any value to some  other variable
		//this wont give any error//but we are storing in other variable with type int there it is a problem
		long b6=b4+b5;//either int or long never store it in byte or short//Here we are assigning the result in b6
		System.out.println(b6);
		
		int g=10;
		int h=2;
		System.out.println(g/h);//5
		
		int g1=10;
		int h1=3;
		System.out.println(g1/h1);//3//as g1 is int & h1 is int the resultant will also be an int
		System.out.println("***********");
		System.out.println(10/2);//5
		System.out.println(10.0/2);//5.0 as one of them is floating number hence the o/p will float type
		System.out.println(10.0/2.0);//both are floating
		System.out.println(10/2.0);//one of them is floating the resultant will also  be floating number
		System.out.println(10/3.0);//one of them is floating the resultant will also  be floating
		
		
		//System.out.println(11/0);//ArithmeticException
		System.out.println(0/9);//0
		
		//for interview point of view below 5 lines
		//&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
		//System.out.println(0/0);//ArithmeticException//a number cannot be divided by zero thats why exception
		System.out.println(0.0/0);//I//NAN//NaN=Not a number//for floating numbers
		System.out.println(0/0.0);//NAN//for floating numbers
		System.out.println(0.0/0.0);//NAN//for floating numbers
		
		
		
		System.out.println(5.0/0);//for floating numbers it will be infinity
		System.out.println(5/0.0);//Infinity
		System.out.println(5.0/0.0);//Infinity
		
		System.out.println('a'/97);//any char followed by arithmetic operation will consider char asci value
		System.out.println('b'-'a');
		System.out.println('b'/'a');
		System.out.println('b'*'a');
		//System.out.println("Hello"-10);//The operator - is undefined for the argument type(s) String, int
		//imp topic above
		System.out.println("Hello"+10+12.33+10255+'a');
		
		char t='a';
		System.out.println(t);//a
		//asci value will come into picture when we are doing any aithmetical operation
		//like add ,divide
		System.out.println((int)t);//97//this is how we print asci value of an integer  //Q
		//we are doing a casting converting type t to integer
		//asci value is same for all its a standard
		
		char c5='z';
		System.out.println((int)c5);//122 //printing asci value of z
		//Here c5 is pointing to z
		
		//try with floating numbers & observe the beahaviour
		//see the observations
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

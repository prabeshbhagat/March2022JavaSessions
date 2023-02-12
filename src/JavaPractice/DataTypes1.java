package JavaPractice;

public class DataTypes1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		
		//1.Primitive Data Types:Dont need any object
		//1.1.Boolean Type:boolean(true/false)
		//1.2.Numeric Type:
			//1.Character Type:char
		    //2.Integral Type
					//1.Integer: byte,short,int,long.
					//2.Floating-point:flaot,double.
		
		//2.Non primitive Data Type:need to create object--oop
		//String ,Array,Interface,Classes.
		
		
		
		
		//byte
		//size 1 byte=8 bits
		//range -128 to 127
		byte b=10;
		b=20;
		b=30;
		//byte b=40;//not possible//Duplicate local variable b
		
		byte b1=10;
		byte b2=15;
		System.out.println(b1+b2);
		//byte b3=b1+b2;//Type mismatch: cannot convert from int to byte
		System.out.println(b);//30
		System.out.println(b1);//10
		System.out.println(b+b2);//45
		
		
		
		//short
		//size 2 byte=16 bits
		//range: -32768 to 32767
		short s=1896;
		System.out.println(s);
		
		//int
		//size 4 byte=32 bits
		//range:-2147483648 to 2147483647
		int i=23545;
		int j=-190;
		int k=1;
		
		
		//long
		//size 8 bytes=64 bits
		//range:-923188485444884121287 to 92245855455444
		//long l=5455444545544; this will give error
		long distance=54554445455044L;//distance bet sun & moon
		System.out.println(distance);
		long pop = 1212121212;
		
		//float
		//size 4bytes=32 bits
		//range after . its will take upto 7 digits
		float f1=12.33f;	//type 1
		float f2=(float)124.33;// type 2
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f1+f2);
		float f3=100;
		System.out.println(f3);
		
		
		//double
		//size:8 bytes=8*8=64 bits
		//range after.its will take upto 16 digits
		double d=12.33;
		double d1=12344.33;
		double d2=1200;
		System.out.println(d2);
		
		
		//7.Char
		//2 bytes=16 bits
		//single digit value
		char c1='e';//a-z A-Z
		char c2='1';//0-9
		char c3='%';//any special characters
		//char c4='aa';// error //single digit value
		//unicode chars //chinese cahrs
		//special chars
		//why char is 2 bytes as it can take any special chars
		System.out.println("++++++++");
		System.out.println(c1);//e
		System.out.println(c2);//1
		System.out.println(c3);//%
		
		
		//boolean : true /false  we dont use 0 and 1
		boolean flag=true;
		boolean flag1=false;
		System.out.println(flag1);
		
		
		char char1 = 'a';
		System.out.println(char1);//a
		System.out.println((int)char1);// 97//asci value
		char char2 = 'b';
		System.out.println((int)char2); //98
		char charx = 'x';
		System.out.println((int)charx);//120
		
		System.out.println("Airthmetic opss-----");//195
		//arithmetic operation
		System.out.println(char1+char2);//195
		
		
		//concatenation
		char ca1 = 'a';//97
		char ca2 = 'b';//98
		System.out.println(ca1+""+ca2);//ab
		
		//Find the Min /Max range
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		System.out.println("-----------");
		System.out.println(Short.MAX_VALUE);
		System.out.println(Short.MIN_VALUE);
		System.out.println("-----------");
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println("-----------");
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		System.out.println("-----------");
		System.out.println(Float.MAX_VALUE);
		System.out.println(Float.MIN_VALUE);
		System.out.println("-----------");
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
	}

}

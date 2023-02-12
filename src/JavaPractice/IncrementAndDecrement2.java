package JavaPractice;

public class IncrementAndDecrement2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Increment ++(increase by 1)
		//--(Decrease by 1)
		//1.Post Increment
		int a1=1;
		int b1=a1++;//post increment means assign the value & then increase
		//assign a1 value to b1(b1 becomes 1) & than increase a1 value by 1(a1 becomes 2)
		
		System.out.println(a1+","+b1);
		System.out.println(a1);//2
		System.out.println(b1);//1
		
		int g=-99;
		int h=g++;
		
		System.out.println(g);//--98
		System.out.println(h);//--99
		
		//2.Pre Increment//1st increase the value than assign
		int x=1;
		int y=++x;
		
		System.out.println(x);//2
		System.out.println(y);//2
		
		int m= -97;
		int n= m++;
		
		System.out.println(m);//-96
		System.out.println(n);//-97
		
		
		int m1= -97;
		int n1= ++m1;
		
		System.out.println(m1);//-96
		System.out.println(n1);//-96
		
		
		//3.Post decrement //decrease the value of  1 later.
		int p=2;
		int q=p--;
		System.out.println(p);//1
		System.out.println(q);//2
		
		
		//4.Pre Decrement//decrease 1st and than assign
		
		int u=2;
		int v=--u;
		System.out.println(u);//1
		System.out.println(v);//1
		
		
		int t1=2;
		System.out.println(t1++);//2
		//it will take the value of t1 & print it immediately it will icrease the value later
		System.out.println(t1);//3
		
		int l=5;
		System.out.println(++l);//6
		System.out.println(l);//6
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

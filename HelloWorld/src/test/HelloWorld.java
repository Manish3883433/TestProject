package test;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Welcome to java");
		/*System.out.println("Welcome to java"); syso ctrl+space 
		System.out.println("Welcome to java");
		System.out.println("Welcome to java");
		System.out.println("Welcome to java");
		System.out.println("Welcome to java");
		System.out.println("Welcome to java");*/
		
		System.out.println("**********************************************************");
		
		//Numeric data types
		int a=100;
		int b=200;
		System.out.println("the value of a is:"+a);
		System.out.println("the value of b is:"+b);
		System.out.println("the sum of a and b is:"+(a+b));
		
		byte by=125;
		System.out.println(by);
		
		short sh=3535;
		System.out.println(sh);
		
		long l=234567789;
		System.out.println(l);
		
		float item_price=20.5F;
		System.out.println(item_price);
		
		double dbl=123.76554;
		System.out.println(dbl);
		
		char ch='A';
		System.out.println(ch);
		
		String str="java";
		System.out.println(str);
		
		boolean bl=true;
		System.out.println(bl);
		
		
		System.out.println("**********************************************************");
		//Arthmetic operator
		int x=200;
		int y=100;
		System.out.println("sum of x and y:"+(x+y));
		System.out.println("Difference of x and y:"+(x-y));
		System.out.println("Multiply of x and y:"+(x*y));
		System.out.println("Divide of x and y:"+(x/y));
		System.out.println("Modulo of x and y:"+(x%y));
		
		System.out.println("**********************************************************");
		
		//relational operator
		System.out.println(x>y);
		System.out.println(x>=y);
		System.out.println(x<y);
		System.out.println(x<=y);
		System.out.println(x==y);
		System.out.println(x!=y);
		
		System.out.println("**********************************************************");
		
		//logical operator || && !
		boolean value1=true;
		boolean value2=false;
		
		System.out.println(value1 || value2);
		System.out.println(value1 && value2);
		System.out.println(!value1);
		System.out.println(!value2);
		
		System.out.println("**********************************************************");
		
		
		//increment operator
		int mark=80;
		mark++;
		System.out.println(mark);
		mark--;
		System.out.println(mark);
		
		int new_mark=70;
		++new_mark;
		System.out.println(new_mark);
		--new_mark;
		System.out.println(new_mark);
		
		System.out.println("**********************************************************");
		
		int xyx=10;
		xyx+=5;
		System.out.println(xyx);
		
		//ternary operator
		int m=100;
		int n=50;
		int z=(m>n)?m:n;
		System.out.println(z);
		
		System.out.println("*************************************************************");
		int person_age=15;
		String res=person_age>=18?"Eligible for vote":"Not Eligible for vote";
		System.out.println(res);
		
		System.out.println("*************************************************************");
		
		//Session 3 Assignment Ques:Swapping of two number
		int aa=10;
		int bb=20;
		System.out.println("Before swapping:"+aa);
		System.out.println("Before swapping:"+bb);
//		int temp=aa;
//		aa=bb;
//		bb=temp;
		
//		aa=aa+bb;
//		bb=aa-bb;
//		aa=aa-bb;
		
		aa=aa^bb;
		bb=aa^bb;
		aa=aa^bb;
		
		
		System.out.println("After swapping:"+aa);
		System.out.println("After swapping:"+bb);
		
		
		
		
		

	}

}

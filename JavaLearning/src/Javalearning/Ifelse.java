package Javalearning;

public class Ifelse {

	public static void main(String[] args) {
	int a =23;
	int b=45;
	if(b>a) {
		System.out.println("a is grater value");
	}
	else {
		System.out.println("b is grater value");
	}

	
	int c=123;
	int d=34;
	if(c==d) {
		System.out.println("c and d are equal");
	}
	else {
		System.out.println("c and d are not equal");
	}
	
	int a1=123;
	int b1=234;
	int c1=235;
	if(a1>b1 & a1>c1) {
		System.out.println("a1 is greater");
	}
	else if(b1>c1) {
		System.out.println("b1 is greater");
		
	}
	else {
		System.out.println("c1 is greater");
	}
	
	
	int age=13;
	
			if(age>18) {
				System.out.println("Eligible for vote");
			}
			
			 else { System.out.println("Not eligibl for vote"); }
			
	}
	
	

}
 
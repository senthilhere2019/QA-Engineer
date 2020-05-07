package Javalearning;

public class Arrayconcept {

	public static void main(String[] args) {
		
		//Static array -size is fixed
		//One dimensional array
		//Stores only similar data types
		
		//2 Dimensional array-Object array using collections  
		//Dynamic array
		
		int i[]= new int[4];
		i[0]=12;
		i[1]=23;
		i[2]=34;
		i[3]=255;
		
		System.out.println(i[2]);
		System.out.println(i.length);
		
		System.out.println("----------------------");//length of array
		
		//All the values of array
		for(int j=0;j<i.length;j++) {
			System.out.println(i[j]);
		}
		
		String s[]=new String [4];
		s[0]="Rishma";
		s[1]="Mridula";
		s[2]="Sentil";
		s[3]="kumar";
		
		System.out.println(s.length);
		System.out.println(s[1]);

		System.out.println("************************88");
	
//Object is a class
		Object obj[]=new Object[5];
		obj[0]="Senthil";
		obj[1]=25;
		obj[2]='f';
		obj[3]=122.33;
		obj[4]=true;
		
		for(int k=0;k<5;k++) {
			System.out.println(obj[k]);
		}
		
		System.out.println(obj[2]);
	}

	
	
}

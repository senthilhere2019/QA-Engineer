import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * 
 * ArrayList - It's a dynamic array. It extends AbstractList class, implements List interface
 *             Non-synchornized, index based. Allows duplicate elements.
 *             
 * @author senthil_rishma
 *
 */


public class ArrayListCollection {
	


	public static void main(String[] args){
	
			ArrayList<String> arr = new ArrayList<String>();
			arr.add("Rishma");
			arr.add("Senthil");
			arr.add("Thara");
			arr.add("Deepika");
			arr.add("Senthil");
	
			Iterator iter = arr.iterator();
			while(iter.hasNext()){
				System.out.println(iter.next());
			}
			
			
			System.out.println("**************************");
		    arr.set(1, "Pooja");
		    
		    for(String obj:arr){
		    	System.out.println(obj);
		    }
		    
		    Student s1 = new Student(32,"Yoga",25);
		    Student s2= new Student(102,"Ravi",21);  
		    Student s3=new Student(103,"Hanumat",25);  
		      
		    ArrayList<Student> stuList = new ArrayList<Student>();
		    stuList.add(s1);
		    stuList.add(s2);
		    stuList.add(s3);
		    
		    ListIterator stuIter= stuList.listIterator();
		    while(stuIter.hasNext()){
		    	
		    	Student s = (Student)stuIter.next();
		    	System.out.println(s.age+"###"+s.name+"####"+s.rollno);
		    }
		    
		    
		  
		    
		    ArrayList<Student> slist = new ArrayList<Student>();
		    Student s4= new Student(104,"Ravi",21);  
		    Student s5=new Student(105,"Rahul",25); 
		    slist.add(s4);
		    slist.add(s5);
		    
		    stuList.retainAll(slist);
		    
            for(Student stuObj: stuList){
		    	
		    	System.out.println(stuObj.age+"*******"+stuObj.rollno+"*******"+stuObj.name);
		    }
		    
	}
		
}



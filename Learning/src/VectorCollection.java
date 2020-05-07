import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Vector;


public class VectorCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> v=new Vector<String>();//creating vector  
		  v.add("umesh");//method of Collection  
		  v.addElement("irfan");//method of Vector  
		  v.addElement("kumar");  
		  //traversing elements using Enumeration  
		  Enumeration e=v.elements();  
		  while(e.hasMoreElements()){  
		   System.out.println(e.nextElement());  
		  }  
		  
			Hashtable<Integer,String> h =new Hashtable<Integer,String>();//creating hashtable  
			  h.put(1,"umesh");//method of Collection  
			  h.put(2,"irfan");//method of Vector  
			  h.put(3,"kumar");  
			  
			  Set set = h.entrySet();
			  
			  
			  //traversing elements using Enumeration  
		    Enumeration e1 = h.elements();
			  while(e1.hasMoreElements()){  
			   System.out.println(e1.nextElement());  
			  } 
	}

}

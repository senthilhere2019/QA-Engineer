import java.util.ArrayList;
import java.util.Dictionary;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Set;


public class JavaCollections {

	public static void main(String[] args) {
		
	   
		Dictionary dic = new Hashtable();
		
		dic.put("1", "Rishma");
		dic.put("2", "Senthil");
		
		//System.out.println(dic.get("1"));
		
		Set set = new HashSet();
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(null);
	System.out.println(set.add(null));
		
		//for(Object obj:set){
			System.out.println(set);
		//}
		
		List list = new ArrayList();
		list.add(2);
		list.add(2);
		
		//System.out.println(list.size());
		
		ArrayList<Integer> alist = new ArrayList<Integer>(533);
		//System.out.println(alist.size());
		
		
		
		
		

	}

}

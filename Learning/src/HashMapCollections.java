import java.util.HashMap;
import java.util.Map;


public class HashMapCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		map.put(100, "ABC");
		map.put(400,"DEF");
		map.put(300,"GHI");
		
		for(Map.Entry<Integer,String> obj : map.entrySet()){
			System.out.println(obj.getKey()+"****"+obj.getValue());
		}
		
	}

}

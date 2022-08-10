package hashmap;
import java.util.*;

public class GetValue {

	public static void main(String[] args) 
	{
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		map.put(1, "Black");
		map.put(2, "Blue");
		map.put(3, "Red");
		map.put(4, "Green");
		map.put(5, "Yellow");
		System.out.println("map--"+map);
		String val=(String)map.get(3);
		System.out.println("value--"+val);

	}

}

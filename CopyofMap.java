package hashmap;
import java.util.*;

public class CopyofMap {

	public static void main(String[] args) 
	{
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		map.put(1, "Black");
		map.put(2, "Blue");
		map.put(3, "Red");
		map.put(4, "Green");
		map.put(5, "Yellow");
		System.out.println("map--"+map);
		HashMap<Integer,String> new_map=new HashMap<Integer,String>();
		new_map=(HashMap) map.clone();
		System.out.println("new map---"+new_map);
		
	}

}
